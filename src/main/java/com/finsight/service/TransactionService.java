package com.finsight.service;

import com.finsight.entity.Transaction;
import com.finsight.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> findByUser(Long userId) {
        return repository.findByAccountUserId(userId);
    }

    public Transaction findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transação não encontrada"));
    }

    public Transaction save(Transaction transaction) {
        return repository.save(transaction);
    }

    public Transaction update(Long id, Transaction data) {
        Transaction transaction = findById(id);

        transaction.setDescription(data.getDescription());
        transaction.setAmount(data.getAmount());
        transaction.setTransactionDate(data.getTransactionDate());
        transaction.setType(data.getType());
        transaction.setStatus(data.getStatus());
        transaction.setCategory(data.getCategory());
        transaction.setAccount(data.getAccount());

        return repository.save(transaction);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}