package com.example.kanban.Repository;

import com.example.kanban.models.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <TaskModel, Long> {
}
