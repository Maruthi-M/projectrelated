package com.cts.ProjectApplication.Buyercontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ProjectApplication.Buyer.ShoppingCart;
import com.cts.ProjectApplication.BuyerService.ShoppingCartService;

@RestController
public class ShoppingCartController {
	@Autowired
	private ShoppingCartService shoppingCartService;
	@RequestMapping(value = "Buyer/{buyerId}/addcartitem", method = RequestMethod.POST, produces = "application/json")
	public ShoppingCart addCartItems(@PathVariable(value = "buyerId") Integer buyerId,@RequestBody ShoppingCart cartItem) {
		Optional<ShoppingCart> savedItem = shoppingCartService.addItemToCart(cartItem, buyerId);
		return savedItem.get();
	}

}
                                                                                                                          