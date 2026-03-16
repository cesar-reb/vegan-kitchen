package com.cesar.vegankitchen.api.v1.controllers;

import com.cesar.vegankitchen.api.v1.dtos.MenuItemResponse;
import com.cesar.vegankitchen.usecases.RequestMenuUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class VeganKitchenController {

    private final RequestMenuUseCase requestMenuUseCase;

    @GetMapping("/menu")
    public ResponseEntity<List<MenuItemResponse>> getMenu() {
        var result = requestMenuUseCase.getMenu();
        return ResponseEntity.ok(result);
    }


}
