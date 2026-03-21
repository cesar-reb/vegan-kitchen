package com.cesar.vegankitchen.usecases;

import com.cesar.vegankitchen.adapters.in.rest.v1.dtos.OpenTabResponse;
import com.cesar.vegankitchen.domain.DiningTable;
import com.cesar.vegankitchen.domain.Tab;
import com.cesar.vegankitchen.domain.TabStatus;
import com.cesar.vegankitchen.mappers.GeneralMappers;
import com.cesar.vegankitchen.ports.KitchenDataBasePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class OpenTabUseCase {

    private final KitchenDataBasePort database;
    private final GeneralMappers mapper;

    public OpenTabResponse execute(Integer tableNumber) {
        log.info("Executing RequestMenuUseCase...");

        assertTabNotAlreadyOpen(tableNumber);
        var tab = Tab.builder()
                .table(DiningTable.builder()
                        .number(tableNumber)
                        .occupied(true)
                        .build())
                .openedAt(LocalDateTime.now())
                .status(TabStatus.OPEN)
                .build();

        log.info("Tab opened: {}", tab);
        tab = database.saveTab(tab);
        return mapper.tabToOpenTabResponse(tab);
    }

    private void assertTabNotAlreadyOpen(Integer tableNumber) {
        if (tableHasOpenTab(tableNumber)) {
            throw new IllegalStateException("Table " + tableNumber + " has tab already open");
        }
    }

    private boolean tableHasOpenTab(Integer tableNumber) {
        return database.getDiningTable(tableNumber).map(DiningTable::getOccupied).orElse(false);
    }

}
