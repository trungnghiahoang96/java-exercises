package entities;

import java.util.List;

public class Book {
    private final int book_id;
    private final String title;
    private final int publicationYear;
    private final double averageRating;
    private final List<Author> authors;
    private final int count;

    public Book(int book_id, String title, int publicationYear, double averageRating, List<Author> authors, int count) {
        this.title = title;
        this.book_id = book_id;
        this.publicationYear = publicationYear;
        this.averageRating = averageRating;
        this.authors = authors;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public int getCount() {
        return count;
    }

    public int getBook_id() {
        return book_id;
    }
}
