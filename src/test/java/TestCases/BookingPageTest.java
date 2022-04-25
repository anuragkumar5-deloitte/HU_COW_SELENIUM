package TestCases;

import org.testng.annotations.Test;
import PageObjects.BookingPage;

public class BookingPageTest {
    BookingPage book = new BookingPage();

    @Test(priority = 6)
    public void validateContinueBooking() {
        try {
            book.explore();
            book.continueBooking();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 7)
    public void  validateConfirmBookingPage(){
        try{
            book.enterHours();
            book.clickConfirmBooking();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
