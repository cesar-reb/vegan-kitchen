package com.cesar.vegankitchen.mappers;

import com.cesar.vegankitchen.api.v1.dtos.MenuItemResponse;
import com.cesar.vegankitchen.domain.MenuItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GeneralMappers {

    MenuItemResponse menuItemToDTO(MenuItem menuItem);
}
