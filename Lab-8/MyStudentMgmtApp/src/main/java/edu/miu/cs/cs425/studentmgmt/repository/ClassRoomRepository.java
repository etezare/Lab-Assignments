package edu.miu.cs.cs425.studentmgmt.repository;

import org.springframework.data.repository.CrudRepository;

import edu.miu.cs.cs425.studentmgmt.model.ClassRoom;

public interface ClassRoomRepository extends CrudRepository<ClassRoom, Long> {

}
