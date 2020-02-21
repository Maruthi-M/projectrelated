package com.cts.ProjectApplication.BuyerDao;

import javax.transaction.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ITransactionDao extends JpaRepository<Transaction, Integer> {

}
