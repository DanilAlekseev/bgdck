package ru.DanilAlekseev.project.JokeBot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.DanilAlekseev.project.JokeBot.model.ClientsRole;
import ru.DanilAlekseev.project.JokeBot.service.ClientsService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientsController {
    private final ClientsService clientsService;

    @PutMapping("/{username}/role")
    public ResponseEntity<Void> setUserRole(@PathVariable String username, @RequestBody ClientsRole role) {
        clientsService.setUserRole(username, role);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/{username}/roles")
    public ResponseEntity<List<ClientsRole>> getUserRoles(@PathVariable String username) {
        List<ClientsRole> roles = clientsService.getUserRoles(username);
        return ResponseEntity.ok(roles);
    }

}