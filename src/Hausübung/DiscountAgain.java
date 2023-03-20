package Hausübung;

public class DiscountAgain {
    public static void main(String[] args) {


        int fiction = 2;
        int nonFiction = 2;

        double bookDiscount = 0.9;
        double bookInvoice = 15 + 18 + 23 + 28;

        double busFullPrice = 3.20;

        double ednaBusDiscount = getBusDiscount(true, false, false, busFullPrice);
        double lolaBusDiscount = getBusDiscount(false, true, false, busFullPrice);
        double paulBusDiscount = getBusDiscount(false, false, true, busFullPrice);


        double totalBusDiscount = (busFullPrice * 6) - ((paulBusDiscount + lolaBusDiscount + ednaBusDiscount) * 2);
        System.out.println(totalBusDiscount);

        double booksDiscount = getBookDiscount(2, 2, bookDiscount, bookInvoice);
        double totalBookDiscount = bookInvoice - booksDiscount;
        System.out.println("TotalBookDiscount " + totalBookDiscount);


        double totalDiscount = totalBusDiscount + totalBookDiscount;
        System.out.println(totalDiscount);

        getBookDiscount(3, 3, bookDiscount, bookInvoice);
        System.out.println(getBookDiscount(3, 3, bookDiscount, bookInvoice));

    }

    public static double getBusDiscount(boolean senior, boolean dog, boolean student, double busFullPrice) {
        double discountedBusTicket;

        if (senior) {
            discountedBusTicket = busFullPrice * 0.85;
        } else if (dog) {
            discountedBusTicket = busFullPrice * 0.80;
        } else if (student) {
            discountedBusTicket = busFullPrice * 0.90;
        } else {
            discountedBusTicket = busFullPrice;
        }
        return (discountedBusTicket);

    }

    public static double getBookDiscount(int fiction, int nonFiction, double bookDiscount, double bookInvoice) {
        double discountedPriceBook;

        if (1 <= fiction && nonFiction > 2) {
            discountedPriceBook = bookInvoice * bookDiscount;
        } else {
            discountedPriceBook = bookInvoice;
        }
        return (discountedPriceBook);
    }
}
