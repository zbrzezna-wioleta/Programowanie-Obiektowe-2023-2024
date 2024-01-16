package education;

import java.util.ArrayList;
import java.util.Objects;

class TestLibrary {
    public static void main(String[] args) {
        Library l1=new Library("aaa","oln",40);
        Library l2=new Library("bbb","wwa",-20);
        Library l3=new Library("ccc","pzn",4900);
        SchoolLibrary sl1 = new SchoolLibrary("111","kar",30,"technikum",1);
        SchoolLibrary sl2 = new SchoolLibrary("222","chnw",2900,"technikum",5);
        ArrayList<Library>lista = new ArrayList<Library>();
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(sl1);
        lista.add(sl2);

        for(Library l : lista)
        {
            l.addBooks(200);
            System.out.println(l.toString());
        }
    }
}
