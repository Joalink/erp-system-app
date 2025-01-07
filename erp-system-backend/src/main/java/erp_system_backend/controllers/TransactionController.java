package erp_system_backend.controllers;

import erp_system_backend.model.Transaction;
import erp_system_backend.service.TransactionService;
import erp_system_backend.service.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    
    @Autowired
    private TransactionService transactionService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getTransactions(){
        List<Transaction> transactions = transactionService.getTransactions();

        return ResponseEntity.ok(transactions);
    }

}
