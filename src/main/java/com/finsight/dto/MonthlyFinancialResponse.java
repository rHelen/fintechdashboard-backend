package com.finsight.dto;

import java.math.BigDecimal;

public record MonthlyFinancialResponse(
        String month,
        BigDecimal revenue,
        BigDecimal expenses
) {}
