package entities;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private int bookCount;

    private final List<String> hasBooksName = new ArrayList<>();
    private final List<Integer> hasBooksIds = new ArrayList<>();

    public Author(String name) {
        this.name = name;
        this.bookCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseBookCount(){
        this.bookCount++;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public List<String> getHasBooksName() {
        return hasBooksName;
    }

    public void addHasBooksName(String booksName) {
        this.hasBooksName.add(booksName);
    }

    public List<Integer> getHasBooksIds() {
        return hasBooksIds;
    }

    public void addHasBooksIds(Integer booksIds) {
        this.hasBooksIds.add(booksIds);
    }
}
