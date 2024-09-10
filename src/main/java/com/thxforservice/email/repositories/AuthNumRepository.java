package com.thxforservice.email.repositories;

import com.thxforservice.email.entities.AuthNum;
import org.springframework.data.repository.CrudRepository;

public interface AuthNumRepository extends CrudRepository<AuthNum, String> {
}
