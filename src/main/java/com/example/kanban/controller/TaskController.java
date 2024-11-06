package com.example.kanban.controller;

import com.example.kanban.Repository.TaskRepository;
import com.example.kanban.entitys.Enum.TaskStatus;
import com.example.kanban.models.TaskModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<TaskModel> TaskFindAll(){ return taskRepository.findAll();}

    @PostMapping
    public TaskModel TaskCreate(@RequestBody TaskModel taskModel){
        return taskRepository.save(taskModel);
    }

    @DeleteMapping(value = "/{id}")
    public void TaskDelete(@PathVariable Long id){ taskRepository.deleteById(id);}

    @PutMapping(value = "/{id}")
    public TaskModel TaskUpdate(@PathVariable Long id, @RequestBody TaskModel taskModel){
        TaskModel task = taskRepository.getReferenceById(id);
        task.setDescription(taskModel.getDescription());
        task.setPrioridade(taskModel.getPrioridade());
        task.setTitle(taskModel.getTitle());
        return taskRepository.save(task);
    }

    @PutMapping(value = "/{id}/move")
    public TaskModel mover(@PathVariable Long id){
        TaskModel task = taskRepository.getReferenceById(id);
        TaskStatus status = task.getStatus();
        if(status == task.getStatus())
    }
}
