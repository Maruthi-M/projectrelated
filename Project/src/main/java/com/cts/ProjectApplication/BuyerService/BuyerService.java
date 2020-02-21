package com.cts.ProjectApplication.BuyerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ProjectApplication.Buyer.Buyer;
import com.cts.ProjectApplication.BuyerDao.IBuyerDao;
@Service
public class BuyerService {
	@Autowired
	private IBuyerDao dao;
	
	public Integer createOrUpdate(Buyer buyer) {
		Buyer buyer1 =(Buyer)dao.save(buyer);
		return buyer1.getBuyerId();
	}
}
