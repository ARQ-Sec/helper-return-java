package com.arq.helperreturnjava.service;

import com.arq.helperreturnjava.dto.DisputeResponse;
import com.arq.helperreturnjava.repository.DisputeRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DisputeService {
    private final DisputeRepository repository;

    public DisputeService(DisputeRepository repository) {
        this.repository = repository;
    }

    public List<DisputeResponse> summarize() {
        return repository.findAll().stream().map(record -> new DisputeResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
