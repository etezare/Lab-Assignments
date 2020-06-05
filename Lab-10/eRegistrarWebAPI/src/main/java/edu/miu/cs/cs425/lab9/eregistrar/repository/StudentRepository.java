package edu.miu.cs.cs425.lab9.eregistrar.repository;

import edu.miu.cs.cs425.lab9.eregistrar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
