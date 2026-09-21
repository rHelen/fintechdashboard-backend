package com.finsight.service;

import com.finsight.entity.Budget;
import com.finsight.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    private final BudgetRepository repository;

    public BudgetService(BudgetRepository repository) {
        this.repository = repository;
    }

    public List<Budget> findByUser(Long userId) {
        return repository.findByUserId(userId);
    }

    public Budget findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Orçamento não encontrado"));
    }

    public Budget save(Budget budget) {
        return repository.save(budget);
    }

    public Budget update(Long id, Budget data) {
        Budget budget = findById(id);

        budget.setName(data.getName());
        budget.setLimitAmount(data.getLimitAmount());
        budget.setSpentAmount(data.getSpentAmount());
        budget.setCategory(data.getCategory());

        return repository.save(budget);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}