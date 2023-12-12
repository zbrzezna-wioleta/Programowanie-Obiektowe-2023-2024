package zlozonepola.zad3lt;

import java.util.ArrayList;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private ArrayList<Double> reviews;

    public Book(String title, String author, ArrayList<Double> reviews) {
        this.title = title;
        this.author = author;
        this.reviews = reviews == null ? new ArrayList<>() : new ArrayList<>(reviews);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<Double> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Double> reviews) {
        if (reviews != null)
            this.reviews = new ArrayList<>(reviews);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!Objects.equals(title, book.title)) return false;
        if (!Objects.equals(author, book.author)) return false;
        return Objects.equals(reviews, book.reviews);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (reviews != null ? reviews.hashCode() : 0);
        return result;
    }
    public void addReviews(double newReview){
        reviews.add(newReview);
    }
    public void removeLast(){
        if (!reviews.isEmpty()){
            reviews.remove(reviews.size()-1);
        }
    }
}
