package com.abCodes.Learn_JPA_and_hibernate.games.springDataJpa;

import com.abCodes.Learn_JPA_and_hibernate.games.Games;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GamesSpringDataJpaRepository extends JpaRepository<Games,Long> {

    List<Games> findByCompany(String company);
}
