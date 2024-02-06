package modules.students.useCases;

import modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {


    public boolean execute(VerifyHasCertificationDTO dto){
        if(dto.getEmail().equals(anObject:"lucasamaral6@outlook.com") && dto.getTechnology().equals(anObject:"JAVA")){
            return true;
        }
        return false;
    }

}
