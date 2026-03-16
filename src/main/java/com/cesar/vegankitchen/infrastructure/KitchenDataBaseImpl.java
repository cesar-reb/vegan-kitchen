package com.cesar.vegankitchen.infrastructure;

import com.cesar.vegankitchen.domain.MenuItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class KitchenDataBaseImpl implements KitchenDataBase {

    private final MenuRepository menuRepository;

    @Override
    public List<MenuItem> getMenu() {
        return  menuRepository.findAll();
    }
}
