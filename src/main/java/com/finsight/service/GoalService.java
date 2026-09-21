package com.finsight.service;

import com.finsight.entity.Goal;
import com.finsight.repository.GoalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {

    private final GoalRepository repository;

    public GoalService(GoalRepository repository) {
        this.repository = repository;
    }

    public List<Goal> findByUser(Long userId) {
        return repository.findByUserId(userId);
    }

    public Goal findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Meta não encontrada"));
    }

    public Goal save(Goal goal) {
        return repository.save(goal);
    }

    public Goal update(Long id, Goal data) {
        Goal goal = findById(id);

        goal.setName(data.getName());
        goal.setTargetAmount(data.getTargetAmount());
        goal.setCurrentAmount(data.getCurrentAmount());
        goal.setTargetDate(data.getTargetDate());

        return repository.save(goal);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}