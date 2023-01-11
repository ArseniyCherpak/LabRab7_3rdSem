package ru.urfu.labprog_security2db_thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.labprog_security2db_thymeleaf.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}