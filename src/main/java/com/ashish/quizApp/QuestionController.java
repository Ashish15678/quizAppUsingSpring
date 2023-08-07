package com.ashish.quizApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    
    @GetMapping("/getAllQuestion")
public String getAllQuestions(){return "All questions avaliable";}

}
