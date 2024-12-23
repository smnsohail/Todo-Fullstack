package com.akshayacodes.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshayacodes.todo.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {
    
}
