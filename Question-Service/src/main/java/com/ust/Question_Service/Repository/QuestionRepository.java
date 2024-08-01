package com.ust.Question_Service.Repository;

import com.ust.Question_Service.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
}
