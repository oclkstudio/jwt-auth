package com.oclkstudio.jwt.repository;

import com.oclkstudio.jwt.model.Role;
import com.oclkstudio.jwt.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
