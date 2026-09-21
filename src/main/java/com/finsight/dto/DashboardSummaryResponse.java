package com.finsight.dto;

import java.math.BigDecimal;

public record DashboardSummaryResponse(
        BigDecimal revenue,
        BigDecimal expenses,
        BigDecimal profit,
        BigDecimal cashFlow
) {}
