package Interfejsy.Comparable.zad12;

import java.util.ArrayList;

public class TestOrder {
    public static void main(String[] args) {
        Order o1= new Order("mleko",4,2.5);
        Order o2= new Order("mleko",3,4.2);
        Order o3= new Order("mleko",2,3.1);
        Order o4= new Order("mleko",1,2.5);
        ArrayList<Order>list=new ArrayList<>();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.sort(null);

        for(int i =0;i<4;i++){
            System.out.println(list.get(i).toString());
        }
    }
}
