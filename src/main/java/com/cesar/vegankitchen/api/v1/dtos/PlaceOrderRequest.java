package com.cesar.vegankitchen.api.v1.dtos;


import lombok.Data;

import java.util.List;


@Data
public class PlaceOrderRequest {

    private List<OrderItemRequest> items;

}