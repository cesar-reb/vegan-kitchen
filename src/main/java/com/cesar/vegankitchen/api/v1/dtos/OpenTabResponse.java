package com.cesar.vegankitchen.api.v1.dtos;


import com.cesar.vegankitchen.domain.ItemCategory;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class OpenTabResponse {

    private Long tabId;
    private Long tableId;
    private LocalDateTime openedAt;
    private String status;

}