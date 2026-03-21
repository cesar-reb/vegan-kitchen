package com.cesar.vegankitchen.infrastructure.repositories;

import com.cesar.vegankitchen.domain.DiningTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DiningTableRepository extends JpaRepository<DiningTable, Long> {

    Optional<DiningTable> findByNumber(Integer number);
}
