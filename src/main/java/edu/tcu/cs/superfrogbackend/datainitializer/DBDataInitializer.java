package edu.tcu.cs.superfrogbackend.datainitializer;

import edu.tcu.cs.superfrogbackend.Authentication.Models.ERole;
import edu.tcu.cs.superfrogbackend.Authentication.Models.Role;
import edu.tcu.cs.superfrogbackend.Authentication.Models.User;
import edu.tcu.cs.superfrogbackend.Authentication.Repository.RoleRepository;
import edu.tcu.cs.superfrogbackend.Authentication.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DBDataInitializer implements CommandLineRunner {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    public DBDataInitializer(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /* Set<Role> roles = new HashSet<>();
        Role role = roleRepository.findByName(ERole.ROLE_DIRECTOR).orElseThrow(() -> new RuntimeException("Error: Role is not found."));
        roles.add(role);
        User s1 = new User();
        s1.setUsername("James");
        s1.setPassword("123456");
        s1.setEmail("j.fanning@tcu.edu");
        s1.setEnabled(false);
        s1.setRoles(roles);
        userRepository.save(s1);
*/
    }
}
