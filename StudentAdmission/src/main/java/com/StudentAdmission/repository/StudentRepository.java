package com.StudentAdmission.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.StudentAdmission.entity.Student;
public interface StudentRepository extends JpaRepository<Student, Long>{

}
