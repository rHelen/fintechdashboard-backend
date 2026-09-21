package com.finsight.dto.goal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GoalRequest {

    @NotBlank(message = "Nome da meta é obrigatório")
    private String name;

    @NotNull(message = "Valor da meta é obrigatório")
    @Positive(message = "Valor da meta deve ser maior que zero")
    private BigDecimal targetAmount;

    @PositiveOrZero(message = "Valor atual não pode ser negativo")
    private BigDecimal currentAmount = BigDecimal.ZERO;

    private LocalDate targetDate;

    @NotNull(message = "Usuário é obrigatório")
    private Long userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(BigDecimal targetAmount) {
        this.targetAmount = targetAmount;
    }

    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(BigDecimal currentAmount) {
        this.currentAmount = currentAmount;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}