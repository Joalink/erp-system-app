package erp_system_backend.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import erp_system_backend.model.Transaction;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Primary
@Service
public class TransactionServiceJSONImpl implements TransactionService {

    public List<Transaction> getTransactions() {
        List<Transaction> transactions;

        try {
             transactions = new ObjectMapper()
                    .readValue(this.getClass().getResourceAsStream("/transactions.json"),
                            new TypeReference<List<Transaction>>() {});
            return transactions;
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
