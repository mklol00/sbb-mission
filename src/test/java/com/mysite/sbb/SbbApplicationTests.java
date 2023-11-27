package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;
import java.util.function.Function;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;
    @Test
    void testJpa() {
        Optional<Question> oq = this.questionRepository.findById(1);
        if(oq.isPresent()){
            Question q =oq.get();
            assertEquals("sbb가 무엇인가요?", q.getSubject());
        }

    }

}
