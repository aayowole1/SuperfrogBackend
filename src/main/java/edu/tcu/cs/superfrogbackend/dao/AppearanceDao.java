package edu.tcu.cs.superfrogbackend.dao;

import edu.tcu.cs.superfrogbackend.domain.Appearance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppearanceDao extends JpaRepository<Appearance, Integer> {
}
