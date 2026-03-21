package com.cesar.vegankitchen.ports;

import com.cesar.vegankitchen.domain.DiningTable;
import com.cesar.vegankitchen.domain.MenuItem;
import com.cesar.vegankitchen.domain.Tab;
import com.cesar.vegankitchen.domain.TabStatus;

import java.util.List;
import java.util.Optional;

public interface KitchenDataBasePort {

    List<MenuItem> getMenu();

    Tab saveTab(Tab tab);

    Optional<Tab> getTab(Tab tab);

    Optional<Tab> getTabByStatusAndTableNumber(TabStatus tabStatus, Integer tableNumber);

    Optional<DiningTable> getDiningTable(Integer tableNumber);
}
