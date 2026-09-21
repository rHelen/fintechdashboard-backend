package com.finsight.dto.account;

import com.finsight.enums.AccountType;

import java.math.BigDecimal;

public class AccountResponse {

    private Long id;
    private String name;
    private AccountType type;
    private BigDecimal balance;
    private Long userId;

    public AccountResponse(
            Long id,
            String name,
            AccountType type,
            BigDecimal balance,
            Long userId
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AccountType getType() {
        return type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Long getUserId() {
        return userId;
    }
}