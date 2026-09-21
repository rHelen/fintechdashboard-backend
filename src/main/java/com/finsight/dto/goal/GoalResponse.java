package com.finsight.dto.goal;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GoalResponse {

    private Long id;
    private String name;
    private BigDecimal targetAmount;
    private BigDecimal currentAmount;
    private LocalDate targetDate;
    private Long userId;

    public GoalResponse(
            Long id,
            String name,
            BigDecimal targetAmount,
            BigDecimal currentAmount,
            LocalDate targetDate,
            Long userId
    ) {
        this.id = id;
        this.name = name;
        this.targetAmount = targetAmount;
        this.currentAmount = currentAmount;
        this.targetDate = targetDate;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getTargetAmount() {
        return targetAmount;
    }

    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public Long getUserId() {
        return userId;
    }
}