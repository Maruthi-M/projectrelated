package com.cts.ProjectApplication.BuyerService;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ProjectApplication.Buyer.Buyer;
import com.cts.ProjectApplication.Buyer.PurchaseHistory;
import com.cts.ProjectApplication.Buyer.ShoppingCart;
import com.cts.ProjectApplication.Buyer.Transaction;
import com.cts.ProjectApplication.BuyerDao.IBuyerDao;
import com.cts.ProjectApplication.BuyerDao.IShoppingCartDao;
@Service
public class ShoppingCartService {


	@Autowired
	private IShoppingCartDao cartDao;
	
	@Autowired
	private IBuyerDao buyerDao;
	
	@Autowired
	private TransactionService transactionService;
	public Optional<ShoppingCart> addItemToCart(ShoppingCart cartItem, Integer buyerId) {
		return buyerDao.findById(buyerId).map(buyer -> {
            cartItem.setBuyer(buyer);
            return cartDao.save(cartItem);
        });
	}
	
	public String deleteCartItem(Integer cartItemId) {
		cartDao.deleteById(cartItemId);
		return "Deleted";
	}
	
	public String emptyCartItems(Integer buyerId) {
		Optional<Buyer> buyer = buyerDao.findById(buyerId);
		cartDao.deleteBybuyer(buyer.get());
		return "deleted";
	}
	
	public List<ShoppingCart> getallCartItems(Integer buyerId){
		List<ShoppingCart> items = cartDao.findAllBybuyer(buyerId);
		return items;
	}
	public void checkout(ShoppingCart cartItem, PurchaseHistory purchaseHistory, Transaction transactionHistory, Integer buyerId) {
		transactionService.addTransaction(transactionHistory, buyerId);
	}
}
