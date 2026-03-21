package com.cesar.vegankitchen.adapters.in.rest.v1.dtos;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class PlaceOrderResponse {

    private Long orderId;
    private Long tabId;
    private BigDecimal orderTotal;

}