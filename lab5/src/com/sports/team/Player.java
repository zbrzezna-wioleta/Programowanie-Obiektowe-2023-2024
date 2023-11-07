package com.sports.team;

public class Player {
    private String name;
    private int number;
    
    public Player(String name, int number){
        this.name = name;
        if(number<0){
            this.number = 10;
        }else{
            this.number = number;
        }



    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setNumber(int newNumber) {
        if(newNumber<0){
            this.number = 0;
        }else{
            this.number = newNumber;
        }


    }


}
