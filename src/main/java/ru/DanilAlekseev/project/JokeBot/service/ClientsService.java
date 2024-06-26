package ru.DanilAlekseev.project.JokeBot.service;

import ru.DanilAlekseev.project.JokeBot.model.ClientsRole;

import java.util.List;

public interface ClientsService {
    void registration(String username, String password);
    List<ClientsRole> getUserRoles(String username);
    void setUserRole(String username, ClientsRole role);
}