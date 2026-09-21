package com.finsight.dto.account;

import com.finsight.enums.AccountType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class AccountRequest {

    @NotBlank(message = "Nome da conta é obrigatório")
    private String name;

    @NotNull(message = "Tipo da conta é obrigatório")
    private AccountType type;

    @NotNull(message = "Saldo é obrigatório")
    private BigDecimal balance;

    @NotNull(message = "Usuário é obrigatório")
    private Long userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}