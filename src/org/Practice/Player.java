package org.Practice;

public class Player implements Comparable{
    int id,run;
    String name;
    Player(int id, int run, String name){
        this.id = id;
        this.run = run;
        this.name = name;
    }
    public int getId(){return id;}
    public int getRun(){return run;}
    public String getName(){return name;}

    public int compareTo(Object obj){
        Player p1 = (Player) obj;
        if(this.run < p1.run) return 1;
        else if(this.run > p1.run) return -1;
        else return 0;
    }
}
