package com.cts.ProjectApplication.BuyerService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cts.ProjectApplication.Buyer.PurchaseHistory;
import com.cts.ProjectApplication.BuyerDao.IPurchaseHistoryDao;

@Service
public class PurchaseHistoryService {

	@Autowired
	private IPurchaseHistoryDao iPurchaseHistoryDao;
	
	@Autowired
	private TransactionService transactionService;
	
	public PurchaseHistory addPurchaseHistory(PurchaseHistory purchaseHistory){
		return purchaseHistory;
	}
}
