package com.cesar.vegankitchen.infrastructure;

import com.cesar.vegankitchen.domain.MenuItem;

import java.util.List;

public interface KitchenDataBase {

    List<MenuItem> getMenu();
}
