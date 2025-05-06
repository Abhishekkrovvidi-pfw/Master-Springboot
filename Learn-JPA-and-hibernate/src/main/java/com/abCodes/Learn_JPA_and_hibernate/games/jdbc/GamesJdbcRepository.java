package com.abCodes.Learn_JPA_and_hibernate.games.jdbc;
import com.abCodes.Learn_JPA_and_hibernate.games.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GamesJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

  private static  String INSERT_QUERY= """
            insert into games(id, name, company)
            values (?, ?, ?);
          """;
  private static  String DELETE_QUERY= """
            delete from games
            where id = ?
          """;
  private static  String SELECT_QUERY= """
            SELECT * from games
            where id = ?
          """;

  public void insert(Games games){
        springJdbcTemplate.update(INSERT_QUERY,
                games.getId(), games.getName(), games.getCompany());
  }

  public void  deleteById(Long id){
      springJdbcTemplate.update(DELETE_QUERY, id);
  }

  public Games findByID(Long id){
      return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Games.class), id);

  }
}
