package com.cts.ProjectApplication.BuyerDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cts.ProjectApplication.Buyer.PurchaseHistory;
@Repository
public interface IPurchaseHistoryDao extends JpaRepository<PurchaseHistory, Integer> {

}
