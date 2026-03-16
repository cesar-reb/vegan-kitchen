package com.cesar.vegankitchen.api.v1.dtos;


import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class PlaceOrderResponse {

    private Long orderId;
    private Long tabId;
    private BigDecimal orderTotal;

}