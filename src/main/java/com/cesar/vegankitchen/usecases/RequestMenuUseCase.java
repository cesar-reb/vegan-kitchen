package com.cesar.vegankitchen.usecases;

import com.cesar.vegankitchen.adapters.in.rest.v1.dtos.MenuItemResponse;
import com.cesar.vegankitchen.ports.KitchenDataBasePort;
import com.cesar.vegankitchen.mappers.GeneralMappers;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RequestMenuUseCase {

    private final KitchenDataBasePort dataBase;
    private final GeneralMappers mapper;

    public List<MenuItemResponse> execute() {
        log.info("Executing RequestMenuUseCase...");
        return  dataBase.getMenu()
                .stream()
                .map(mapper::menuItemToDTO).toList();
    }


}
