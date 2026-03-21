package com.cesar.vegankitchen.adapters.in.rest.v1.dtos;


import lombok.Data;

@Data
public class OrderItemRequest {

    private Long menuItemId;
    private Integer quantity;

}