package by.academy.it;

/**
 * Created by Kostya on 09.04.2016.
 */

/**
 * Class Book. B entity
 */
public class Book {

  private  String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String title) {
        this.title = title;
    }
}
