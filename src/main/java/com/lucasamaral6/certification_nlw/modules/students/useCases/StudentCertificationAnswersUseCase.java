package com.lucasamaral6.certification_nlw.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lucasamaral6.certification_nlw.modules.students.dto.StudentCertificationAnswerDTO;
import com.lucasamaral6.certification_nlw.modules.students.entities.StudentRepository;

@Service
public class StudentCertificationAnswersUseCase {
    
    @Autowired
    private StudentRepository studentRepository;
    
    public void execute(StudentCertificationAnswerDTO dto) throws Exception{
        // Verificar se o usuário existe
        var student = studentRepository.findByEmail(dto.getEmail());

        if (student.isEmpty()){
            throw new Exception("E-mail do estudante incorreto.");
        }
        //Buscar as alternativas das perguntas
         // - Correta ou Incorreta

        // Salvar as informações da certificação

    }
}
