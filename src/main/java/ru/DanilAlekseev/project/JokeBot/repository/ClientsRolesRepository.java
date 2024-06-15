package ru.DanilAlekseev.project.JokeBot.repository;

import org.springframework.data.repository.CrudRepository;
import ru.DanilAlekseev.project.JokeBot.model.ClientsRole;


public interface ClientsRolesRepository extends CrudRepository<ClientsRole, Long> {
}