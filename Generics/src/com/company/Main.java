package com.company;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team mufc = new Team("Manchester United");
        mufc.addPlayer(joe);
        mufc.addPlayer(pat);
        mufc.addPlayer(beckham);

        System.out.println(mufc.numPlayers());

        
    }
}
