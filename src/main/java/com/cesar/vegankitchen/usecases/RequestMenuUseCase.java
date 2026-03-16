package com.cesar.vegankitchen.usecases;

import com.cesar.vegankitchen.api.v1.dtos.MenuItemResponse;
import com.cesar.vegankitchen.infrastructure.KitchenDataBase;
import com.cesar.vegankitchen.mappers.GeneralMappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestMenuUseCase {

    private final KitchenDataBase dataBase;
    private final GeneralMappers mapper;

    public List<MenuItemResponse> getMenu() {
        return  dataBase.getMenu()
                .stream()
                .map(mapper::menuItemToDTO).toList();
    }


}
