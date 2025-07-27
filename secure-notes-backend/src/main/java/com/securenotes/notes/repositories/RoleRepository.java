package com.securenotes.notes.repositories;

import com.securenotes.notes.models.AppRole;
import com.securenotes.notes.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}