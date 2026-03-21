package com.cesar.vegankitchen.adapters.in.rest.v1.dtos;


import lombok.Data;
import java.time.LocalDateTime;


@Data
public class OpenTabResponse {

    private Long id;
    private Long tableNumber;
    private LocalDateTime openedAt;
    private String status;

}