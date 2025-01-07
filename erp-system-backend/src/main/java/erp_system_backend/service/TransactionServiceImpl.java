package erp_system_backend.service;

import erp_system_backend.model.Transaction;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    List<Transaction> transactions = new ArrayList<>(Arrays.asList(

            new Transaction(1, LocalDateTime.parse("2024-11-20T14:45:00"), BigDecimal.valueOf(350.50), "buy", 1),
            new Transaction(2, LocalDateTime.parse("2024-11-20T14:45:00"), BigDecimal.valueOf(350.50), "sell", 2),
            new Transaction(3, LocalDateTime.parse("2024-11-20T14:45:00"), BigDecimal.valueOf(350.50), "buy", 3),
            new Transaction(4, LocalDateTime.parse("2024-11-20T14:45:00"), BigDecimal.valueOf(350.50), "sell", 4)

            ));

    @Override
    public List<Transaction> getTransactions () {
        return transactions;
    }
}
