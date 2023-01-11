package ru.urfu.labprog_security2db_thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.labprog_security2db_thymeleaf.entity.User;
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}