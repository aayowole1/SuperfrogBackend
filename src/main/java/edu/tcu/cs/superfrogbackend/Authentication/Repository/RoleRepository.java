package edu.tcu.cs.superfrogbackend.Authentication.Repository;

import java.util.Optional;

import edu.tcu.cs.superfrogbackend.Authentication.Models.ERole;
import edu.tcu.cs.superfrogbackend.Authentication.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}