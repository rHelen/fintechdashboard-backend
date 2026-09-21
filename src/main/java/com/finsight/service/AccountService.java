package com.finsight.service;

import com.finsight.entity.Account;
import com.finsight.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public List<Account> findByUser(Long userId) {
        return repository.findByUserId(userId);
    }

    public Account findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));
    }

    public Account save(Account account) {
        return repository.save(account);
    }

    public Account update(Long id, Account data) {
        Account account = findById(id);

        account.setName(data.getName());
        account.setType(data.getType());
        account.setBalance(data.getBalance());

        return repository.save(account);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}