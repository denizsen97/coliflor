package ProductManager.Product.BookRental;

import ProductManager.CommonalityManager.BookPlace.BookPlace;
import ProductManager.CommonalityManager.BookWork.BookWork;
import RentalSystemManager.Filter;
import RentalSystemManager.Publication;
import RentalSystemManager.Rental;
import RentalSystemManager.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookRental extends Rental implements BookWork, BookPlace, Filter {

    public static void addFund(BookUser user, double amount){

    }
    public static boolean penaltyPayment(BookUser user, BookPublication publication){

        return true;
    }
    public static List<Book> listMostRented(){
        return null;
    }

    @Override
    public ArrayList<Publication> giveRecommendation(User user) {
        return null;
    }

    @Override
    public void shareInSocialMedia(User user, Publication publication, String socialMedia) {

    }

    @Override
    public boolean checkCurrentAvailability(Publication publication, Date currentDate) {
        return false;
    }

    @Override
    public ArrayList<Publication> filter(String filterType, String filterOptions) {
        return null;
    }
}