package com.lucasamaral6.certification_nlw.modules.students.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentCertificationAnswerDTO {
   
    
    private String email;
    private String technololy;
    private List<QuestionAnswerDTO> questionAnswer;
    private boolean isCorrect;
}
