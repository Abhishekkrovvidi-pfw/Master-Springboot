package com.abCodes.Learn_JPA_and_hibernate.games.jdbc;

import com.abCodes.Learn_JPA_and_hibernate.games.Games;
import com.abCodes.Learn_JPA_and_hibernate.games.jpa.GamesJPARepository;
import com.abCodes.Learn_JPA_and_hibernate.games.springDataJpa.GamesSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GamesJdbcCommandLineRunner  implements CommandLineRunner {
   // @Autowired
  //  private GamesJdbcRepository repository;

    //@Autowired
    //private GamesJPARepository repository;
/*repository.insert(new Games(1, "Assasins Creed Rogue", "UBI SOFT"));
    we use insert if its SPring jdbc or JPA  */
    @Autowired
    private GamesSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Games(1, "Assasins Creed Rogue", "UBI SOFT"));
        repository.save(new Games(2, "UFC", "EA SPORTS"));
        repository.save(new Games(3, "League of legends", "RIOT GAMES"));
        repository.deleteById(2L);
        System.out.println (repository.findById(1L));
        System.out.println (repository.findAll());
        System.out.println (repository.count());
        System.out.println(repository.findByCompany("RIOT GAMES"));



    }
}
