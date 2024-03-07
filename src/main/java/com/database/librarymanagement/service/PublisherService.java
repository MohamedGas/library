package com.database.librarymanagement.service;

import com.database.librarymanagement.modal.Publisher;
import com.database.librarymanagement.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }

    public Optional<Publisher> getPublisherById(int publisherId) {
        return publisherRepository.findById(publisherId);
    }

    public Publisher savePublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    public void deletePublisher(int publisherId) {
        publisherRepository.deleteById(publisherId);
    }

}
