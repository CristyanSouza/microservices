package com.devsuperior.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hruser.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
