package com.abCodes.Learn_JPA_and_hibernate.games.jpa;

import com.abCodes.Learn_JPA_and_hibernate.games.Games;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jdk.jfr.TransitionTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.awt.font.GlyphMetrics;

@Repository
public class GamesJPARepository {
    @PersistenceContext
    private EntityManager entityManager ;

    @Transactional
    public void insert(Games games){
        entityManager.merge(games);
    }
    public Games findById(long id){
        return entityManager.find(Games.class, id);
    }
    @Transactional
    public void deleteById(long id){
        Games games = entityManager.find(Games.class, id);
        entityManager.remove(games);
    }
}
