package com.akshayacodes.todo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.akshayacodes.todo.model.Task;
import com.akshayacodes.todo.repository.TaskRepository;



 
@RestController
@CrossOrigin
public class TaskController {
    @Autowired
    private TaskRepository repo;
    @GetMapping({"/hello"})
    public String helloworld(){
        return "welcome";
    }
    @PostMapping("/api/tasks")
    public Task createtask(@RequestBody Task data){
       repo.save(data);
        return data;
    }
    @GetMapping("/api/tasks")
    public List<Task> getAllTasks() {
        return repo.findAll();  // Fetch all tasks from the repository
    }
    @PutMapping("/api/tasks/{id}")
    public Task updatetask(@PathVariable Long id, @RequestBody Task data){
        data.setId(id);
        return repo.save(data);
    }
    @DeleteMapping("/api/tasks/{id}")
    public void deleteTask(@PathVariable Long id) {
    repo.deleteById(id);
}



   
 
   
}
 
    

