package com.database.librarymanagement.service;

import com.database.librarymanagement.modal.Reservation;
import com.database.librarymanagement.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> getReservationById(int reservationId) {
        return reservationRepository.findById(reservationId);
    }

    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(int reservationId) {
        reservationRepository.deleteById(reservationId);
    }
}
