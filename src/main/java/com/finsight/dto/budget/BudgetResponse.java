package com.finsight.dto.budget;

import java.math.BigDecimal;

public class BudgetResponse {

    private Long id;
    private String name;
    private BigDecimal limitAmount;
    private BigDecimal spentAmount;
    private Long categoryId;
    private String categoryName;
    private Long userId;

    public BudgetResponse(
            Long id,
            String name,
            BigDecimal limitAmount,
            BigDecimal spentAmount,
            Long categoryId,
            String categoryName,
            Long userId
    ) {
        this.id = id;
        this.name = name;
        this.limitAmount = limitAmount;
        this.spentAmount = spentAmount;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public BigDecimal getSpentAmount() {
        return spentAmount;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Long getUserId() {
        return userId;
    }
}