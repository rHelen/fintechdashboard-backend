package com.finsight.service;

import com.finsight.entity.User;
import com.finsight.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public User save(User user) {
        return repository.save(user);
    }

    public User update(Long id, User data) {
        User user = findById(id);

        user.setName(data.getName());
        user.setEmail(data.getEmail());

        if (data.getPassword() != null && !data.getPassword().isBlank()) {
            user.setPassword(data.getPassword());
        }

        return repository.save(user);
    }

    public void delete(Long id) {
        User user = findById(id);
        repository.delete(user);
    }
}