package com.database.librarymanagement.repository;

import com.database.librarymanagement.modal.StudyRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface StudyRoomRepository extends JpaRepository<StudyRoom, Integer> {
}
