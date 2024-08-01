package com.ust.Question_Service.Controller;

import com.ust.Question_Service.Model.Question;
import com.ust.Question_Service.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionService service;

    @GetMapping("/{setname}")
    ResponseEntity<Question> getQuestions(@RequestParam String setname){
        
    }
    @PutMapping
}
