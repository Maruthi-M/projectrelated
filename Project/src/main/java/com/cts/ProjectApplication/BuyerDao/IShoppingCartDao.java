package com.cts.ProjectApplication.BuyerDao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.ProjectApplication.Buyer.Buyer;
import com.cts.ProjectApplication.Buyer.ShoppingCart;

@Repository
public interface IShoppingCartDao extends JpaRepository<ShoppingCart, Integer> {

	void deleteBybuyer(Buyer buyer);

	List<ShoppingCart> findAllBybuyer(Integer buyerId);

}
