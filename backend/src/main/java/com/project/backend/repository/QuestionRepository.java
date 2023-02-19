package com.project.backend.repository;

import com.project.backend.model.Questions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Questions, Integer> {
}
