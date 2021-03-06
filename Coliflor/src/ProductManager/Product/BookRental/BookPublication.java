package ProductManager.Product.BookRental;

import RentalSystemManager.Product;
import RentalSystemManager.Publication;

import java.util.Date;

public class BookPublication extends Publication implements Comparable<Publication>{
    private int bookNumber;
    private int rentNumber;


    public BookPublication(Product product, String title, Date publicationDate, boolean currentlyAvailable, int id, int bookNumber) {
        super(product, title,  publicationDate, currentlyAvailable, id);
        this.rentNumber = 0;
        this.bookNumber = bookNumber;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public int getRentNumber() {
        return rentNumber;
    }

    public void setRentNumber(int rentNumber) {
        this.rentNumber = rentNumber;
    }
    @Override
    public int compareTo(Publication o) {
        return (int)(this.rentNumber- ((BookPublication)o).getRentNumber());
    }
}

