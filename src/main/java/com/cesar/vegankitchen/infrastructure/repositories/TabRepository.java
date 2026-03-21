package com.cesar.vegankitchen.infrastructure.repositories;

import com.cesar.vegankitchen.domain.Tab;
import com.cesar.vegankitchen.domain.TabStatus;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TabRepository extends CrudRepository<Tab, Long> {
    Optional<Tab> findByStatusAndTableNumber(TabStatus status, Integer tableNumber);
}
