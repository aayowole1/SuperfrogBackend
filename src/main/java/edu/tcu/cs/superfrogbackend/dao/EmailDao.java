package edu.tcu.cs.superfrogbackend.dao;

import edu.tcu.cs.superfrogbackend.domain.Appearance;
import edu.tcu.cs.superfrogbackend.domain.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailDao {
   public void sendEmail(Email email);

}
