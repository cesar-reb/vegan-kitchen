package com.cesar.vegankitchen.adapters.out.database;

import com.cesar.vegankitchen.domain.DiningTable;
import com.cesar.vegankitchen.domain.MenuItem;
import com.cesar.vegankitchen.domain.Tab;
import com.cesar.vegankitchen.domain.TabStatus;
import com.cesar.vegankitchen.infrastructure.repositories.DiningTableRepository;
import com.cesar.vegankitchen.infrastructure.repositories.MenuRepository;
import com.cesar.vegankitchen.infrastructure.repositories.TabRepository;
import com.cesar.vegankitchen.ports.KitchenDataBasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class KitchenDataBaseAdapter implements KitchenDataBasePort {

    private final MenuRepository menuRepository;
    private final TabRepository tabRepository;
    private final DiningTableRepository diningTableRepository;

    @Override
    public List<MenuItem> getMenu() {
        return  menuRepository.findAll();
    }

    @Override
    public Tab saveTab(Tab tab) {
        return tabRepository.save(tab);
    }

    @Override
    public Optional<Tab> getTab(Tab tab) {
        return tabRepository.findById(tab.getId());
    }

    @Override
    public Optional<Tab> getTabByStatusAndTableNumber(TabStatus tabStatus, Integer tableNumber) {
        return tabRepository.findByStatusAndTableNumber(tabStatus, tableNumber);
    }

    @Override
    public Optional<DiningTable> getDiningTable(Integer tableNumber) {
        return diningTableRepository.findByNumber(tableNumber);
    }
}
