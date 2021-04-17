package com.onroad.backend.service;

import com.onroad.backend.entity.Product;
import com.onroad.backend.entity.ProvisionalSale;
import com.onroad.backend.repository.ProvisionalSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProvisionalSaleService {

    @Autowired
    private ProvisionalSaleRepository repo;

    public void save(ProvisionalSale provisionalSale){
        repo.save(provisionalSale);
    }

    public Optional<ProvisionalSale> getById(Integer id){
        return repo.findById(id);
    }

    public Page<ProvisionalSale> getAll(Pageable pageable)
    {
        return repo.findAll(pageable);
    }


}
