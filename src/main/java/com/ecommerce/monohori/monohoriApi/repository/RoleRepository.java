package com.ecommerce.monohori.monohoriApi.repository;

import com.ecommerce.monohori.monohoriApi.models.ERole;
import com.ecommerce.monohori.monohoriApi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}