package com.cesar.vegankitchen.api.v1.dtos;


import lombok.Data;

import java.util.List;


@Data
public class OrderItemRequest {

    private Long menuItemId;
    private Integer quantity;

}