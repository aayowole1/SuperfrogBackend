package edu.tcu.cs.superfrogbackend.service;

import edu.tcu.cs.superfrogbackend.Authentication.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

public class EmailService {

    @Autowired
    private JavaMailSender mailSender;


    public void sendMail(User customer) throws MessagingException, UnsupportedEncodingException {
        String toAddress = customer.getEmail();
        String fromAddress = "Email";
        String senderName = "Superfrog Team";
        String subject = "Superfrog Request Confirmation";
        String content = "Dear {{name}}, <br>"
                + "Your request for Superfrog appearance had been confirmed! <br>"
                + "<br>"
                + "Thank you, <br>"
                + "Superfrog Team";

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setFrom(fromAddress, senderName);
        helper.setTo(toAddress);
        helper.setSubject(subject);

        content = content.replace("{{name}}", customer.getUsername());

        helper.setText(content, true);

        mailSender.send(message);
    }


}
