package education;

import java.util.Objects;

class Library {
    private String name;
    private String location;
    private int books;

    public Library(String name, String location, int books) {
        this.name = (name==null || name.isEmpty())?"Biblioteka Miejsca":name;
        this.location = (location==null||name.isEmpty())?"ul. WIedzy 123, 00-001":location;
        this.books = books<0?1000:books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null||!name.isEmpty())
            this.name=name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if(location!=null||!location.isEmpty())
            this.location=location;
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        if(books>=0)
            this.books=books;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": Name: " + name +
                ". Location: " + location +
                ". Number of books: " + books +
                ".";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return books == library.books && Objects.equals(name, library.name) && Objects.equals(location, library.location);
    }

    @Override
    public int hashCode() {
        int result=name.hashCode();
        result=31*result+ location.hashCode();
        return 31*result+books;
    }
    void addBooks(int x)
    {
        this.books+=x;
        if(this.books>5000)
            this.books=5000;
    }
    static void checkBookCapacity(Library l1)
    {
        System.out.println("Aktualna liczba ksiazek: "+l1.getBooks()+"Do limitu zostalo: "+(5000-l1.getBooks()));
    }
}
