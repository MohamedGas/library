package com.database.librarymanagement.service;

import com.database.librarymanagement.modal.AccessLevel;
import com.database.librarymanagement.repository.AccessLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AccessLevelService {
    @Autowired
    private AccessLevelRepository accessLevelRepository;

    public List<AccessLevel> getAllAccessLevels() {
        return accessLevelRepository.findAll();
    }

    public Optional<AccessLevel> getAccessLevelById(int accessLevelId) {
        return accessLevelRepository.findById(accessLevelId);
    }

    public AccessLevel saveAccessLevel(AccessLevel accessLevel) {
        return accessLevelRepository.save(accessLevel);
    }

    public void deleteAccessLevel(int accessLevelId) {
        accessLevelRepository.deleteById(accessLevelId);
    }
}
