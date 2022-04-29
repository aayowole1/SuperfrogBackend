package edu.tcu.cs.superfrogbackend;

import edu.tcu.cs.superfrogbackend.dao.EmailDao;
import edu.tcu.cs.superfrogbackend.domain.Email;
import edu.tcu.cs.superfrogbackend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.beans.BeanProperty;
import java.util.Properties;

@SpringBootApplication
public class SuperfrogBackendApplication {

    @Autowired
    private EmailDao mailService;
    public static void main(String[] args) {
        SpringApplication.run(SuperfrogBackendApplication.class, args);
    }


    public void run(String... args) throws Exception
    {
        Email mail = new Email();
        mail.setFromAddress("no-reply@gmail.com");
        mail.setToAddress("SD@gmail.com");
        mail.setSubject("Event Completed");
        mail.setContent("A Superfrog appearance has been completed");
        mailService.sendEmail(mail);
    }
    //    @Bean
//    public JavaMailSender getJavaMailSender() {
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost("smtp.gmail.com");
//        mailSender.setPort(587);
//
//        mailSender.setUsername("no-reply@gmail.com");
//        mailSender.setPassword("password");
//
//        Properties props = mailSender.getJavaMailProperties();
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.debug", "true");
//
//        return mailSender;
//    }

}
