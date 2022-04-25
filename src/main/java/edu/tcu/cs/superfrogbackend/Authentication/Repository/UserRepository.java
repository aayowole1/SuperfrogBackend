package edu.tcu.cs.superfrogbackend.Authentication.Repository;

import java.util.Optional;

import edu.tcu.cs.superfrogbackend.Authentication.Models.Role;
import edu.tcu.cs.superfrogbackend.Authentication.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findById(Long id);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}