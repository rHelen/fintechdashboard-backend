package com.finsight.controller;

import com.finsight.entity.Transaction;
import com.finsight.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "http://localhost:5173")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @GetMapping("/user/{userId}")
    public List<Transaction> findByUser(@PathVariable Long userId) {
        return service.findByUser(userId);
    }

    @GetMapping("/{id}")
    public Transaction findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Transaction create(@RequestBody Transaction transaction) {
        return service.save(transaction);
    }

    @PutMapping("/{id}")
    public Transaction update(
            @PathVariable Long id,
            @RequestBody Transaction transaction
    ) {
        return service.update(id, transaction);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}