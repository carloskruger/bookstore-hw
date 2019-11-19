package co.ga.bookstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;

    /** this is the constructor for the book class
     *
     */
    public Book() {
    }

    /** This method is a setter that takes String title as a parm
     *
     * @param title
     * and sets up the title
     */

    public Book(String title) {
        this.title = title;
    }

    /**
     * This returns the Id
     * @return
     */

    public Long getId() {
        return id;
    }

    /**
     * This method takes id as a param
     * @param id
     * to set up the id value
     */


    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method takes no parm and
     * @return title
     */

    public String getTitle() {
        return title;
    }

    /**
     * This method takes
     * @param title
     * to set up the title value
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method takes
     * @return the contents of the book
     * object as a String
     */

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}