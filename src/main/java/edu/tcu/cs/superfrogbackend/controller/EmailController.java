package edu.tcu.cs.superfrogbackend.controller;

import edu.tcu.cs.superfrogbackend.domain.Email;
import edu.tcu.cs.superfrogbackend.domain.Result;
import edu.tcu.cs.superfrogbackend.domain.StatusCode;
import edu.tcu.cs.superfrogbackend.service.EmailService;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component
@RestController
@RequestMapping
public class EmailController  {

//    private JavaMailSender mailSender;
    private EmailService emailService;

    public EmailController (EmailService emailService){
        this.emailService = emailService;
    }

    @GetMapping ("/email")
    public Result sendEmail(Email email){
        Result result = new Result(true, StatusCode.SUCCESS, "email Success");
        return result;
    }

}
