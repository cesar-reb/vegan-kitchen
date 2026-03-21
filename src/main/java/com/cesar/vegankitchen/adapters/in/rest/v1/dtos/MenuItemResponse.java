package com.cesar.vegankitchen.adapters.in.rest.v1.dtos;


import com.cesar.vegankitchen.domain.ItemCategory;
import com.cesar.vegankitchen.domain.MenuItem;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class MenuItemResponse {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private ItemCategory category;
    private String imageUrl;

}