package erp_system_backend.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private Integer transaction_id;
    private LocalDateTime transaction_date;
    private BigDecimal amount;
    private String type;
    private Integer user_id;

    public Transaction() {
    }

    public Transaction(Integer transaction_id, LocalDateTime transaction_date, BigDecimal amount, String type, Integer user_id) {
        this.transaction_id = transaction_id;
        this.transaction_date = transaction_date;
        this.amount = amount;
        this.type = type;
        this.user_id = user_id;
    }

    public Integer getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Integer transaction_id) {
        this.transaction_id = transaction_id;
    }

    public LocalDateTime getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(LocalDateTime transaction_date) {
        this.transaction_date = transaction_date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
