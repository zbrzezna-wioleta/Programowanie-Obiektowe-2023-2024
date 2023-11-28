package store;

public class TestProduct {
    public static void main(String[] args) {
        Product[] arr = new Product[5];
        arr[0] = new Book();
        arr[1] = new Clothing();
        arr[2] = new Clothing();
        arr[3] = new Book();
        arr[4] = new Clothing();

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].getPrice());
        }
    }
}
