package com.finsight.dto.transaction;

import com.finsight.enums.TransactionStatus;
import com.finsight.enums.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TransactionResponse {

    private Long id;
    private String description;
    private BigDecimal amount;
    private LocalDate transactionDate;
    private TransactionType type;
    private TransactionStatus status;
    private Long accountId;
    private String accountName;
    private Long categoryId;
    private String categoryName;

    public TransactionResponse(
            Long id,
            String description,
            BigDecimal amount,
            LocalDate transactionDate,
            TransactionType type,
            TransactionStatus status,
            Long accountId,
            String accountName,
            Long categoryId,
            String categoryName
    ) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.type = type;
        this.status = status;
        this.accountId = accountId;
        this.accountName = accountName;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public TransactionType getType() {
        return type;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public Long getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }
}