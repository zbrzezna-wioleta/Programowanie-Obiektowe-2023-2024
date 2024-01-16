package zoo;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] list = {new Cat(),new Dog(),new Dog(), new Cat(), new Dog()};
            for(Animal a : list)
        {
            System.out.println(a.makeSound());
        }

    }
}
