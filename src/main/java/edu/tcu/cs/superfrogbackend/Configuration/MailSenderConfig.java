package edu.tcu.cs.superfrogbackend.Configuration;

import edu.tcu.cs.superfrogbackend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Properties;

@Configuration
public class MailSenderConfig {

//    @Autowired
//    private Environment env;
//
//    @Bean
//    public JavaMailSender getMailSender() {
//        EmailService mailService = new EmailService();
//        mailService.setHost(env.getProperty("spring.mail.host"));
//        mailService.setPort(Integer.valueOf(env.getProperty("spring.mail.port")));
//        mailService.setUsername(env.getProperty("spring.mail.username"));
//        mailService.setPassword(env.getProperty("spring.mail.password"));
//
//        Properties mailServiceProps = new Properties();
//        mailServiceProps.put("mail.smtp.starttls.enable", "true");
//        mailServiceProps.put("mail.smtp.auth", "true");
//        mailServiceProps.put("mail.transport.protocol", "smtp");
//        mailServiceProps.put("mail.debug", "true");
//        mailServiceProps.put("mail.smtp.ssl.trust", "*");
//
//        mailService.setMailServiceProps(mailServiceProps);
//        return mailService;
//
//    }
}

