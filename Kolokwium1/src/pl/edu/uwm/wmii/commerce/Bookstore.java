package pl.edu.uwm.wmii.commerce;

public class Bookstore extends Store{
    private String genre;
    private int booksInStock;

    public Bookstore(String name, String address, int employees, String genre, int booksInStock) {
        super(name, address, employees);
        this.genre = (genre == null || genre.isEmpty()) ? "ogolny" : genre;;
        this.booksInStock = booksInStock > 0 ? booksInStock : 250;
    }

    public String getGenre() {
        return genre;
    }

    public int getBooksInStock() {
        return booksInStock;
    }

    public void setGenre(String genre) {
        if(genre == null || genre.isEmpty()){

        }
        else
            this.genre = genre;
    }

    public void setBooksInStock(int booksInStock) {
        if(booksInStock < 0){

        }
        else
            this.booksInStock = booksInStock;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Genre: " + genre  +
                ". Number of books in stock: " + booksInStock + ".";
    }

    public void hireEmployees(int employees){
         setEmployees(getEmployees()+employees > 75? 75 : getEmployees()+employees);
         this.booksInStock += 10*employees;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Bookstore bookstore = (Bookstore) o;

        return genre.equals(bookstore.genre);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + genre.hashCode();
        return result;
    }
    public static int checkCapacity(Bookstore arg){
        return 75 - arg.getEmployees();
    }

}
