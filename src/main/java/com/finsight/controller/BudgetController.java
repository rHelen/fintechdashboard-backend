package com.finsight.controller;

import com.finsight.entity.Budget;
import com.finsight.service.BudgetService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budgets")
@CrossOrigin(origins = "http://localhost:5173")
public class BudgetController {

    private final BudgetService service;

    public BudgetController(BudgetService service) {
        this.service = service;
    }

    @GetMapping("/user/{userId}")
    public List<Budget> findByUser(@PathVariable Long userId) {
        return service.findByUser(userId);
    }

    @GetMapping("/{id}")
    public Budget findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Budget create(@RequestBody Budget budget) {
        return service.save(budget);
    }

    @PutMapping("/{id}")
    public Budget update(
            @PathVariable Long id,
            @RequestBody Budget budget
    ) {
        return service.update(id, budget);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}