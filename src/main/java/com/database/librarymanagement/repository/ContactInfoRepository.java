package com.database.librarymanagement.repository;

import com.database.librarymanagement.modal.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface ContactInfoRepository  extends JpaRepository<ContactInfo, String> {
}
