package com.project.backend.service;

import com.project.backend.model.Questions;
import com.project.backend.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Questions addQuestions(Questions questions) {
        return questionRepository.save(questions);
    }

    @Override
    public List<Questions> getQuestions() {
        return (List<Questions>) questionRepository.findAll();
    }

    @Override
    public Questions getQuestionsByid(int id) {
        return questionRepository.findById(id).get();
    }

    @Override
    public Questions updateQuestions(int id, Questions questions) {
        Questions questions1 = questionRepository.findById(id).get();
        questions1.setEmail(questions.getEmail());
        questions1.setPno(questions.getPno());
        questions1.setAddress(questions.getAddress());
        return questionRepository.save(questions1);
    }

    @Override
    public void deleteQuestions(int id) {
        questionRepository.deleteById(id);
    }
}
