package edu.miu.cs.cs425.studentmgmt.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "classrooms")
public class ClassRoom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long classRoomId;

	@NotBlank(message = "buildingName required")
	private String buildingName;

	@NotBlank(message = "roomNumber required")
	private String roomNumber;

	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "studentClassRoom")
	private List<Student> studentList;

	public ClassRoom(long classRoomId, @NotBlank String buildingName, @NotBlank String roomNumber,
			List<Student> studentList) {
		super();
		this.classRoomId = classRoomId;
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
		this.studentList = studentList;
	}

	public ClassRoom(@NotBlank(message = "buildingName required") String buildingName,
			@NotBlank(message = "roomNumber required") String roomNumber, List<Student> studentList) {
		super();
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
		this.studentList = studentList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public ClassRoom(long classRoomId, @NotBlank String buildingName, @NotBlank String roomNumber) {
		super();
		this.classRoomId = classRoomId;
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}

	public ClassRoom(@NotBlank String buildingName, @NotBlank String roomNumber) {
		super();
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}

	public ClassRoom() {
		super();
	}

	public long getClassRoomId() {
		return classRoomId;
	}

	public void setClassRoomId(long classRoomId) {
		this.classRoomId = classRoomId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return String.format("ClassRoom [classRoomId=%s, buildingName=%s, roomNumber=%s]", classRoomId, buildingName,
				roomNumber);
	}

}
