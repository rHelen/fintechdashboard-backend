package com.finsight.dto;

import com.finsight.model.Transaction;
import java.math.BigDecimal;
import java.time.LocalDate;

public record TransactionResponse(
        Long id,
        LocalDate date,
        String description,
        String category,
        String status,
        BigDecimal amount
) {
    public static TransactionResponse from(Transaction transaction) {
        return new TransactionResponse(
                transaction.id(),
                transaction.date(),
                transaction.description(),
                transaction.category(),
                transaction.status(),
                transaction.amount()
        );
    }
}
