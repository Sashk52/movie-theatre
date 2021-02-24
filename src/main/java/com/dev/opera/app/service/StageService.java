package com.dev.opera.app.service;

import com.dev.opera.app.model.Stage;
import java.util.List;

public interface StageService {
    Stage add(Stage stage);

    List<Stage> getAll();

    Stage getById(Long id);
}
