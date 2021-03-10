package com.onroad.backend.service;

import com.onroad.backend.entity.Reservation;
import com.onroad.backend.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;

    public void save(Reservation reservation)
    {
        repository.save(reservation);
    }

    public List<Reservation> findAll()
    {
        return repository.findAll();
    }

    public Optional<Reservation> findById(Integer id)
    {
        return repository.findById(id);
    }
}