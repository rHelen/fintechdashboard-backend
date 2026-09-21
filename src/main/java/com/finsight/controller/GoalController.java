package com.finsight.controller;

import com.finsight.entity.Goal;
import com.finsight.service.GoalService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/goals")
@CrossOrigin(origins = "http://localhost:5173")
public class GoalController {

    private final GoalService service;

    public GoalController(GoalService service) {
        this.service = service;
    }

    @GetMapping("/user/{userId}")
    public List<Goal> findByUser(@PathVariable Long userId) {
        return service.findByUser(userId);
    }

    @GetMapping("/{id}")
    public Goal findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Goal create(@RequestBody Goal goal) {
        return service.save(goal);
    }

    @PutMapping("/{id}")
    public Goal update(
            @PathVariable Long id,
            @RequestBody Goal goal
    ) {
        return service.update(id, goal);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}