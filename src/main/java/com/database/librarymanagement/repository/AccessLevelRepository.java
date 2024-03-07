package com.database.librarymanagement.repository;

import com.database.librarymanagement.modal.AccessLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface AccessLevelRepository extends JpaRepository<AccessLevel, Integer> {
}
