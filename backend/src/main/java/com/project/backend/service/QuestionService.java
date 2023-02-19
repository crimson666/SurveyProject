package com.project.backend.service;

import com.project.backend.model.Questions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {

    public Questions addQuestions(Questions questions);

    public List<Questions> getQuestions();

    public Questions getQuestionsByid(int id);

    public Questions updateQuestions(int id , Questions questions);

    public void deleteQuestions(int id);

}
