package com.mysite.sbb.question;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;
    public List<Question> getList(){
        return this.questionRepository.findAll();
    }
}
