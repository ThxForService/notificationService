package com.thxforservice.email.services;

import com.thxforservice.email.entities.EmailHistory;
import com.thxforservice.email.repositories.EmailHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailHistoryService {
    private final EmailHistoryRepository repository;

    public void save(EmailHistory history) {
        repository.saveAndFlush(history);
    }
}
