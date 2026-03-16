package com.cesar.vegankitchen.api.v1.dtos;


import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class CloseTabResponse {

    private Long tabId;
    private Long tableId;

    private LocalDateTime openedAt;
    private LocalDateTime closedAt;

    private BigDecimal totalAmount;

}