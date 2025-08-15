package br.com.dio.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.dio.model.UserModel;



public class UserDAO {
    private long nextId = 1L;

    private final List<UserModel> models = new ArrayList<>();

    public UserModel save(final UserModel model) {
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UserModel update(final UserModel model) {
        models.stream()
            .filter(m -> m.getId() == model.getId())
            .findFirst()
            .ifPresent(m -> {
                models.remove(m);
                models.add(model);
            });
        return model;
    }

    public UserModel findById(final long id) {
        var message = String.format("User not found")
        return models.stream()
            .filter(m -> m.getId() == id)
            .findFirst()
            .orElseThrow(() -> new RuntimeException(message));
    }

    public UserModel delete(final long id) {
        var toDelete = findById(id);
        models.remove(toDelete);
        return toDelete;
    }

    public List<UserModel> findAll() {
        return models;
    }
}
