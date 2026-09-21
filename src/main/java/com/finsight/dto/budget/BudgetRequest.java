package com.finsight.dto.budget;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public class BudgetRequest {

    @NotBlank(message = "Nome do orçamento é obrigatório")
    private String name;

    @NotNull(message = "Limite é obrigatório")
    @PositiveOrZero(message = "Limite não pode ser negativo")
    private BigDecimal limitAmount;

    @PositiveOrZero(message = "Valor gasto não pode ser negativo")
    private BigDecimal spentAmount = BigDecimal.ZERO;

    private Long categoryId;

    @NotNull(message = "Usuário é obrigatório")
    private Long userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }

    public BigDecimal getSpentAmount() {
        return spentAmount;
    }

    public void setSpentAmount(BigDecimal spentAmount) {
        this.spentAmount = spentAmount;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}