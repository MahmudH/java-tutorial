package com.company;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> mufc = new Team<>("Manchester United");
        mufc.addPlayer(joe);
//        mufc.addPlayer(pat);
//        mufc.addPlayer(beckham);

        System.out.println(mufc.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

//        Team<String> stringTeam = new Team<>("should not work");

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("MUFC");
        soccerPlayerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordan");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(mufc, 3, 8);

        mufc.matchResult(fremantle, 2, 1);
//        mufc.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(mufc.getName() + ": " + mufc.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(mufc.compareTo(melbourne));
        System.out.println(mufc.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(mufc));
    }
}
