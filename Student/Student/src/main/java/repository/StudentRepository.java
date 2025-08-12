package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import student.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
