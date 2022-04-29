package edu.tcu.cs.superfrogbackend.service;

import edu.tcu.cs.superfrogbackend.dao.EmailDao;
import edu.tcu.cs.superfrogbackend.domain.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService implements EmailDao {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(Email email) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setSubject(email.getSubject());
            mimeMessageHelper.setFrom(new InternetAddress(email.getFromAddress()));
            mimeMessageHelper.setTo(email.getToAddress());
            mimeMessageHelper.setText(email.getContent());
            mailSender.send(mimeMessageHelper.getMimeMessage());
        }
        catch (MessagingException e) {
            e.printStackTrace();
        }

    }

}
