package school;

public class SchoolBook implements Comparable<SchoolBook>{
    private String name;
    private String author;
    private float rating;

    public SchoolBook(String name, String author, float rating){
        this.name = name;
        this.author = author;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "SchoolBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(SchoolBook o) {
        return Integer.compare(o.name.length(), this.name.length());
    }
}
