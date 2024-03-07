package com.database.librarymanagement.controller;

import com.database.librarymanagement.modal.ContactInfo;
import com.database.librarymanagement.service.ContactInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contact-infos")
public class ContactInfoController {
    private final ContactInfoService contactInfoService;

    @Autowired
    public ContactInfoController(ContactInfoService contactInfoService) {
        this.contactInfoService = contactInfoService;
    }

    @GetMapping
    public List<ContactInfo> getAllContactInfos() {
        return contactInfoService.getAllContactInfo();
    }

    @GetMapping("/{phone}")
    public ResponseEntity<ContactInfo> getContactInfoByPhone(@PathVariable String phone) {
        Optional<ContactInfo> contactInfo = contactInfoService.getContactInfoById(phone);
        return contactInfo.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<ContactInfo> createContactInfo(@RequestBody ContactInfo contactInfo) {
        ContactInfo savedContactInfo = contactInfoService.saveContactInfo(contactInfo);
        return new ResponseEntity<>(savedContactInfo, HttpStatus.CREATED);
    }

    @DeleteMapping("/{phone}")
    public ResponseEntity<Void> deleteContactInfo(@PathVariable String phone) {
        contactInfoService.deleteContactInfo(phone);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
