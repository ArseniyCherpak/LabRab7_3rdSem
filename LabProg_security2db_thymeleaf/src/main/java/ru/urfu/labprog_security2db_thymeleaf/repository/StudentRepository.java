package ru.urfu.labprog_security2db_thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.urfu.labprog_security2db_thymeleaf.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
}