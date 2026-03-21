package com.cesar.vegankitchen.mappers;

import com.cesar.vegankitchen.adapters.in.rest.v1.dtos.CloseTabResponse;
import com.cesar.vegankitchen.adapters.in.rest.v1.dtos.MenuItemResponse;
import com.cesar.vegankitchen.adapters.in.rest.v1.dtos.OpenTabResponse;
import com.cesar.vegankitchen.domain.MenuItem;
import com.cesar.vegankitchen.domain.Tab;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GeneralMappers {

    MenuItemResponse menuItemToDTO(MenuItem menuItem);

    @Mapping(source = "table.number", target = "tableNumber")
    OpenTabResponse tabToOpenTabResponse(Tab tab);

    @Mapping(source = "id", target = "tabId")
    @Mapping(source = "table.number", target = "tableNumber")
    @Mapping(source = "status", target = "status")
    CloseTabResponse tabToCloseTabResponse(Tab tab);
}
