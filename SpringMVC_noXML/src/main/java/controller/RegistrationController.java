package controller;

import API.CommunicationDTO;
import API.Phone;
import API.UserRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegistrationController {
    @RequestMapping("/register")
    public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO){
//        UserRegistrationDTO userRegistrationDTO = new UserRegistrationDTO();
//        model.addAttribute("userReg",userRegistrationDTO);
        Phone phone = new Phone();
        phone.setCountryCode("99");
        phone.setUserNumber("22222222");

        CommunicationDTO communicationDTO = new CommunicationDTO();
        communicationDTO.setPhone(phone);
        userRegistrationDTO.setCommunicationDTO(communicationDTO);
        return "user-registration-page";
    }
    @RequestMapping("/registration-success")
    public String processUserReg(@Valid @ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO, BindingResult result){
       if(result.hasErrors()){
           System.out.println("My page has errors");
           List<ObjectError> er = result.getAllErrors();
           for (ObjectError i:er){
               System.out.println(i);
           }
           return "user-registration-page";
       }
        return "registration-sucess";
    }
}
