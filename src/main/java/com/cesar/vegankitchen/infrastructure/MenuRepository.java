package com.cesar.vegankitchen.infrastructure;

import com.cesar.vegankitchen.domain.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuItem, Long> {
}
