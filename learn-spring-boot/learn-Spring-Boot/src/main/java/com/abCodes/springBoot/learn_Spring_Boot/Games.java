package com.abCodes.springBoot.learn_Spring_Boot;


public class Games {
    private int id;
    private String gameName;
    private String creators;
    public Games(int id, String gameName, String creators) {
        super();
        this.id = id;
        this.gameName = gameName;
        this.creators = creators;
    }

    public int getId() {
        return id;
    }

    public String getGameName() {
        return gameName;
    }

    public String getCreators() {
        return creators;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", gameName='" + gameName + '\'' +
                ", creators='" + creators + '\'' +
                '}';
    }
}
