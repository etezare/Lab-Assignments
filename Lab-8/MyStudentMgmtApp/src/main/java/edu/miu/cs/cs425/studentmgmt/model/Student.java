package edu.miu.cs.cs425.studentmgmt.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "transcript_fk")
	private Transcript stuTranscript;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "classRoom_fk", nullable = false)
	private ClassRoom studentClassRoom;

	@NotBlank(message = "studentNumber is required")
	private String studentNumber;

	@NotBlank(message = "firstName is required")
	private String firstName;

	private String middleName;

	@NotBlank(message = "lastName is required")
	private String lastName;

	private double cgpa;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfEnrollment;

	public Student(long studentId, Transcript stuTranscript, ClassRoom studentClassRoom,
			@NotBlank(message = "studentNumber is required") String studentNumber,
			@NotBlank(message = "firstName is required") String firstName, String middleName,
			@NotBlank(message = "lastName is required") String lastName, double cgpa, LocalDate dateOfEnrollment) {
		super();
		this.studentId = studentId;
		this.stuTranscript = stuTranscript;
		this.studentClassRoom = studentClassRoom;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}

	public Student(Transcript stuTranscript, ClassRoom studentClassRoom,
			@NotBlank(message = "studentNumber is required") String studentNumber,
			@NotBlank(message = "firstName is required") String firstName, String middleName,
			@NotBlank(message = "lastName is required") String lastName, double cgpa, LocalDate dateOfEnrollment) {
		super();
		this.stuTranscript = stuTranscript;
		this.studentClassRoom = studentClassRoom;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}

	
	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public ClassRoom getStudentClassRoom() {
		return studentClassRoom;
	}

	public void setStudentClassRoom(ClassRoom studentClassRoom) {
		this.studentClassRoom = studentClassRoom;
	}

	public Student(Transcript stuTranscript, ClassRoom studentClassRoom,
			@NotBlank(message = "studentNumber is required") String studentNumber,
			@NotBlank(message = "firstName is required") String firstName,
			@NotBlank(message = "lastName is required") String lastName, LocalDate dateOfEnrollment) {
		super();
		this.stuTranscript = stuTranscript;
		this.studentClassRoom = studentClassRoom;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfEnrollment = dateOfEnrollment;
	}

	public ClassRoom getStudentclassroom() {
		return studentClassRoom;
	}

	public void setStudentclassroom(ClassRoom studentclassroom) {
		studentClassRoom = studentclassroom;
	}

	public Student() {
		super();
	}

	public long getStudnetId() {
		return studentId;
	}

	public void setStudnetId(long studnetId) {
		this.studentId = studnetId;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}

	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}

	public Transcript getStuTranscript() {
		return stuTranscript;
	}

	public void setStuTranscript(Transcript stuTranscript) {
		this.stuTranscript = stuTranscript;
	}

	@Override
	public String toString() {
		return String.format(
				"Student [studentId=%s, stuTranscript=%s, studentClassRoom=%s, studentNumber=%s, firstName=%s, middleName=%s, lastName=%s, cgpa=%s, dateOfEnrollment=%s]",
				studentId, stuTranscript, studentClassRoom, studentNumber, firstName, middleName, lastName, cgpa,
				dateOfEnrollment);
	}

}
