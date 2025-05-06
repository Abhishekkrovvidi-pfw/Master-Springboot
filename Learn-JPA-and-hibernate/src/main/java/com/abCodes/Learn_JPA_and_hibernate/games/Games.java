package com.abCodes.Learn_JPA_and_hibernate.games;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Games {
    @Id
    private Long id;
    //@Column(name = "name")
    private String name;
    //IF the entity and bean names are different we can map using this annotation @Column(name = "company")
    private String company;

    public Games(){
        //no args constructor
    }

    public Games(long id, String name, String company){
        super();
        this.id = id;
        this.name  = name;
        this.company = company;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
