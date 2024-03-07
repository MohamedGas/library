package com.database.librarymanagement.service;

import com.database.librarymanagement.modal.ContactInfo;
import com.database.librarymanagement.repository.ContactInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactInfoService {
    @Autowired
    private ContactInfoRepository contactInfoRepository;
    public List<ContactInfo> getAllContactInfo() {
        return contactInfoRepository.findAll();
    }

    public Optional<ContactInfo> getContactInfoById(String phoneNumber) {
        return contactInfoRepository.findById(phoneNumber);
    }

    public ContactInfo saveContactInfo(ContactInfo contactInfo) {
        return contactInfoRepository.save(contactInfo);
    }

    public void deleteContactInfo(String phoneNumber) {
        contactInfoRepository.deleteById(phoneNumber);
    }

}
