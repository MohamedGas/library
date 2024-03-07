package com.database.librarymanagement.service;

import com.database.librarymanagement.modal.StudyRoom;
import com.database.librarymanagement.repository.StudyRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudyRoomService {
    @Autowired
    private StudyRoomRepository studyRoomRepository;

    public List<StudyRoom> getAllStudyRooms() {
        return studyRoomRepository.findAll();
    }

    public Optional<StudyRoom> getStudyRoomById(int roomId) {
        return studyRoomRepository.findById(roomId);
    }

    public StudyRoom saveStudyRoom(StudyRoom studyRoom) {
        return studyRoomRepository.save(studyRoom);
    }

    public void deleteStudyRoom(int roomId) {
        studyRoomRepository.deleteById(roomId);
    }
}
