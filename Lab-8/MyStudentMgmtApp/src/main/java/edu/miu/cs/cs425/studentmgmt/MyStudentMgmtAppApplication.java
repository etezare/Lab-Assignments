package edu.miu.cs.cs425.studentmgmt;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;

import edu.miu.cs.cs425.studentmgmt.model.ClassRoom;
import edu.miu.cs.cs425.studentmgmt.model.Student;
import edu.miu.cs.cs425.studentmgmt.model.Transcript;
import edu.miu.cs.cs425.studentmgmt.repository.ClassRoomRepository;
import edu.miu.cs.cs425.studentmgmt.repository.StudentRepository;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ClassRoomRepository classroomRepository;

	@Override
	public void run(String... args) throws Exception {
		ClassRoom CR = new ClassRoom("McLaughlin building", "M105");
		ClassRoom CR2 = new ClassRoom("McLaughlin building", "M115");
		Transcript transcript = new Transcript("BS Computer Science");
		Transcript transcript2 = new Transcript("Bs Civil Engineering");
		Transcript transcript3 = new Transcript("Bs Mathematics");
		Student student = new Student(transcript, CR, "000-61-001", "Anna", "Lynn", "Smith", 3.45,
				LocalDate.of(2019, 5, 24));
		Student student2 = new Student(transcript2, CR, "000-61-002", "Essey", "A. ", "Tezare", 3.81,
				LocalDate.of(2020, 1, 1));

		Student student3 = new Student(transcript3, CR, "000-61-003", "Eyob", "W.", "Yohannes", 3.9,
				LocalDate.of(2020, 1, 1));
		List<Student> stuList = Arrays.asList(student, student2, student3);
		CR.setStudentList(stuList);
		Student savedStudent = saveStudent(student);
		Student savedStudent2 = saveStudent(student2);
		Student savedStudent3 = saveStudent(student3);
		System.out.println(savedStudent);
		System.out.println(savedStudent2);
		System.out.println(savedStudent3);
		saveClassRoom(CR);
		saveClassRoom(CR2);
	}

	private Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	private ClassRoom saveClassRoom(ClassRoom classroom) {
		return classroomRepository.save(classroom);
	}

	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
	}

}
