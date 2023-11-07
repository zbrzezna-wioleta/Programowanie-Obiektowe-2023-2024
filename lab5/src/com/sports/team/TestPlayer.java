package com.sports.team;

public class TestPlayer {
    static public void main(String[] args){
        Player player = new Player("Marek",16);
        player.setName("Michał");
        player.setNumber(96);
        System.out.println(player.getName()+" "+player.getNumber());
    }
}
