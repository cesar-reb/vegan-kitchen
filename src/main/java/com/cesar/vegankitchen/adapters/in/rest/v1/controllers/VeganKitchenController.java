package com.cesar.vegankitchen.adapters.in.rest.v1.controllers;

import com.cesar.vegankitchen.adapters.in.rest.v1.dtos.CloseTabResponse;
import com.cesar.vegankitchen.adapters.in.rest.v1.dtos.MenuItemResponse;
import com.cesar.vegankitchen.adapters.in.rest.v1.dtos.OpenTabResponse;
import com.cesar.vegankitchen.usecases.CloseTabUseCase;
import com.cesar.vegankitchen.usecases.GetTabUseCase;
import com.cesar.vegankitchen.usecases.OpenTabUseCase;
import com.cesar.vegankitchen.usecases.RequestMenuUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v{version}")
@RequiredArgsConstructor
public class VeganKitchenController {

    private final RequestMenuUseCase requestMenuUseCase;
    private final OpenTabUseCase openTabUseCase;
    private final GetTabUseCase getTabUseCase;
    private final CloseTabUseCase closeTabUseCase;

    @GetMapping(path = "/menu", version = "1")
    public ResponseEntity<List<MenuItemResponse>> getMenu() {
        var result = requestMenuUseCase.execute();
        return ResponseEntity.ok(result);
    }

    @PostMapping(value = "/tables/{tableId}/tabs/open", version = "1")
    public ResponseEntity<OpenTabResponse> openTab(@PathVariable Integer tableId) {
        var result = openTabUseCase.execute(tableId);
        return ResponseEntity.ok(result);
    }

    @PostMapping(value = "/tables/{tableId}/tabs/close", version = "1")
    public ResponseEntity<CloseTabResponse> closeTab(@PathVariable Integer tableId) {
        var result = closeTabUseCase.execute(tableId);
        return ResponseEntity.ok(result);
    }

    @PostMapping(value = "/tables/{tableId}/orders", version = "1")
    public ResponseEntity<OpenTabResponse> postOrder(@PathVariable Integer tableId) {
//        var result = closeTabUseCase.execute(tableId); TODO
        return ResponseEntity.ok(null);
    }

    @GetMapping(path = "/tables/{tableId}/tabs", version = "1")
    public ResponseEntity<CloseTabResponse> getTab(@PathVariable Integer tableId) {
        var result = getTabUseCase.execute(tableId);
        return ResponseEntity.ok(result);

    }


}
