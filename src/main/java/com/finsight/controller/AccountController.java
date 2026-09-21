package com.finsight.controller;

import com.finsight.entity.Account;
import com.finsight.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
@CrossOrigin(origins = "http://localhost:5173")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping("/user/{userId}")
    public List<Account> findByUser(@PathVariable Long userId) {
        return service.findByUser(userId);
    }

    @GetMapping("/{id}")
    public Account findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account create(@RequestBody Account account) {
        return service.save(account);
    }

    @PutMapping("/{id}")
    public Account update(
            @PathVariable Long id,
            @RequestBody Account account
    ) {
        return service.update(id, account);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}