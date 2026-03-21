package com.cesar.vegankitchen.usecases;

import com.cesar.vegankitchen.adapters.in.rest.v1.dtos.CloseTabResponse;
import com.cesar.vegankitchen.domain.TabStatus;
import com.cesar.vegankitchen.mappers.GeneralMappers;
import com.cesar.vegankitchen.ports.KitchenDataBasePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GetTabUseCase {

    private final KitchenDataBasePort database;
    private final GeneralMappers mapper;

    public CloseTabResponse execute(Integer tableNumber) {
        log.info("GetTabUseCase called");

        var tab = database.getTabByStatusAndTableNumber(TabStatus.OPEN, tableNumber)
                .orElseThrow(() -> new IllegalStateException("Table " + tableNumber + " has no open tab"));

        return mapper.tabToCloseTabResponse(tab);

    }

}
