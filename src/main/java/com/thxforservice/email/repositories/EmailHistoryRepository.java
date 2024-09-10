package com.thxforservice.email.repositories;

import com.thxforservice.email.entities.EmailHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface EmailHistoryRepository extends JpaRepository<EmailHistory, Long>, QuerydslPredicateExecutor<EmailHistory> {

}
