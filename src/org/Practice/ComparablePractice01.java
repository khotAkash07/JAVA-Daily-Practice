package org.Practice;
import java.util.*;
public class ComparablePractice01 {
    public static void main(String[] args) {
        List<Player> pl = new ArrayList<>();
        pl.add(new Player(1,2000,"Akash1"));
        pl.add(new Player(2,30000,"Akash2"));
        pl.add(new Player(3,4000,"Akash3"));
        pl.add(new Player(4,5000,"Akash4"));
        pl.add(new Player(5,6000,"Akash5"));
        pl.add(new Player(6,7000,"Akash6"));
        pl.add(new Player(7,8000,"Akash7"));

        Collections.sort(pl);

        Iterator<Player> i = pl.iterator();

        while(i.hasNext()){
            Player pj = i.next();
            System.out.println(pj.getId()+" "+pj.getRun()+" "+pj.getName());
        }
    }
}
