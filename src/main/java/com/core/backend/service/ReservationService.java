package com.core.backend.service;

import com.core.backend.entity.Reservation;
import com.core.backend.entity.User;
import com.core.backend.repository.ReservationRepository;
import com.core.backend.service.list.EntityList;
import com.core.backend.service.list.ListBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService implements ServiceInterface<Reservation> {

    @Autowired
    private ReservationRepository repository;

    @Autowired
    private ListBuilder listBuilder;

    @Override
    public void save(Reservation reservation) {
        repository.save(reservation);
    }

    @Override
    public List<Reservation> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Reservation> get(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Page<Reservation> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public EntityList getList() {
        return listBuilder.build(Reservation.class);
    }

}
