package com.database.librarymanagement.controller;

import com.database.librarymanagement.modal.StudyRoom;
import com.database.librarymanagement.service.StudyRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/study-rooms")
public class StudyRoomController {
    private final StudyRoomService studyRoomService;

    @Autowired
    public StudyRoomController(StudyRoomService studyRoomService) {
        this.studyRoomService = studyRoomService;
    }

    @GetMapping
    public List<StudyRoom> getAllStudyRooms() {
        return studyRoomService.getAllStudyRooms();
    }

    @GetMapping("/{roomId}")
    public ResponseEntity<StudyRoom> getStudyRoomById(@PathVariable Integer roomId) {
        Optional<StudyRoom> studyRoom = studyRoomService.getStudyRoomById(roomId);
        return studyRoom.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<StudyRoom> createStudyRoom(@RequestBody StudyRoom studyRoom) {
        StudyRoom savedStudyRoom = studyRoomService.saveStudyRoom(studyRoom);
        return new ResponseEntity<>(savedStudyRoom, HttpStatus.CREATED);
    }

    @DeleteMapping("/{roomId}")
    public ResponseEntity<Void> deleteStudyRoom(@PathVariable Integer roomId) {
        studyRoomService.deleteStudyRoom(roomId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
