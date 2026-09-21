package com.finsight.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Transaction(
        Long id,
        LocalDate date,
        String description,
        String category,
        String status,
        BigDecimal amount
) {}
