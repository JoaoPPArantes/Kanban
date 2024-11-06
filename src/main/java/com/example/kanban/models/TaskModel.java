package com.example.kanban.models;

import com.example.kanban.entitys.Enum.TaskPrior;
import com.example.kanban.entitys.Enum.TaskStatus;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

public class TaskModel {
    private Long Id;
    private String Title;
    private String Description;
    private TaskStatus Status;
    private Date Date;
    private TaskPrior Prioridade;

    public TaskModel(String title, String description, TaskStatus status, java.util.Date date, TaskPrior prioridade) {
        Title = title;
        Description = description;
        Status = status;
        Date = date;
        Prioridade = prioridade;
    }
     @Id
     @GeneratedValue
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public TaskStatus getStatus() {
        return Status;
    }

    public void setStatus(TaskStatus status) {
        Status = status;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public TaskPrior getPrioridade() {
        return Prioridade;
    }

    public void setPrioridade(TaskPrior prioridade) {
        Prioridade = prioridade;
    }
}
