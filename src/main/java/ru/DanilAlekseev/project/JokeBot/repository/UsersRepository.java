package ru.DanilAlekseev.project.JokeBot.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.DanilAlekseev.project.JokeBot.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Page<Users> findAll(Pageable pageable);
}