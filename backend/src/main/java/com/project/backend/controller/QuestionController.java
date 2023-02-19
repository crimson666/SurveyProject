package com.project.backend.controller;

import com.project.backend.model.Questions;
import com.project.backend.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/add")
    public Questions addQuestions(@RequestBody Questions questions){
        Questions questionsData = questionService.addQuestions(questions);
        return questionsData;
    }

    @GetMapping("/users")
    public List<Questions> getQuestions(){
        System.out.println("Users..");
        return questionService.getQuestions();
    }

    @GetMapping("/user/{id}")
    public Questions getQuestionsById(@PathVariable("id") int id){
        return questionService.getQuestionsByid(id);
    }

    @PutMapping("/update/{id}")
    public String updateQuestions(@PathVariable("id") int id, @RequestBody Questions questions){
        questionService.updateQuestions(id, questions);
        return "User Updated Successfully...";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteQuestions(@PathVariable("id") int id){
        questionService.deleteQuestions(id);
        return "User Deleted Successfully...";
    }

}
