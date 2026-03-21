package com.cesar.vegankitchen.adapters.in.rest.v1.dtos;


import com.cesar.vegankitchen.domain.TabStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class CloseTabResponse {

    private Long tabId;
    private Long tableNumber;
    private TabStatus status;
    private LocalDateTime openedAt;
    private LocalDateTime closedAt;
    private BigDecimal totalAmount;

}