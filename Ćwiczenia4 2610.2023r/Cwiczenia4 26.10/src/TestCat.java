public class TestCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = cat1.createCat("Azor");
        System.out.println(cat2.name);
        Cat cat3 = cat1.createCat(null);
        System.out.println(cat3);
    }
}
class Cat{
    String name;
    Cat createCat(String value){
        Cat temp=new Cat();
        if(value == null){
            return null;
        }
        temp.name = value;
        return temp;
    }
}