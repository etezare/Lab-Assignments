package edu.miu.cs.cs425.lab9.eregistrar.repository;

import edu.miu.cs.cs425.lab9.eregistrar.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
    List<Student> findAllByFirstNameContainingOrLastNameContainingOrStudentNumberContainingOrderByStudentId(String firstName,
                                                                                         String lastName,
                                                                                         String studentNumber);
    List<Student> findAllByEnrollmentDateEquals(LocalDate enrollmentdate);
    List<Student> findAllByCgpaEquals(Double cGpa);

    // More queries
    List<Student> findBooksByEnrollmentDateIsStartingWith(String str);
}
