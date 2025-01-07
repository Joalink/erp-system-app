package erp_system_backend.service;

import erp_system_backend.model.Transaction;

import java.util.List;

public interface TransactionService {

    List<Transaction> getTransactions();
}
