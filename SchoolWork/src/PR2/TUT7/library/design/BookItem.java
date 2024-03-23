package PR2.TUT7.library.design;

public class BookItem {
    public enum BookItemStatus {
        AVAILABLE,
        RESERVED,
        LOANED,
        LOST
    }
    public enum BookFormat {
        HARDCOVER,
        PAPERBACK,
        AUDIOBOOK,
        EBOOK,
        NEWSPAPER,
        MAGAZINE,
        JOURNAL
    }
    private Book book;
    private String barcode;
    private double price;
    private String dateOfPurchase;
    private String dateOfPublication;
    public BookFormat format;
    public BookItemStatus status;

    private boolean validateBarcode(String barcode) {
        return !barcode.isEmpty() && barcode.length() < 50;
    }

    private boolean validatePrice(double price) {
        return price > 0;
    }



    private boolean validateStatus(String status) {
        return status.equals("available") || status.equals("reserved") || status.equals("loaned") || status.equals("lost");
    }

    private boolean validateDateOfPurchase(String dateOfPurchase) {
        return !dateOfPurchase.isEmpty() && dateOfPurchase.length() < 10;
    }

    private boolean validateDateOfPublication(String dateOfPublication) {
        return !dateOfPublication.isEmpty() && dateOfPublication.length() < 10;
    }

    public BookItem(Book book, String barcode, double price, BookFormat format, BookItemStatus status) {
        this.book = book;
        if (validateBarcode(barcode)) {
            this.barcode = barcode;
        }
        if (validatePrice(price)) {
            this.price = price;
        }
        this.status = status;
        this.format = format;
    }

    public void setDateOfPublication(String dateOfPublication) {
        if(validateDateOfPublication(dateOfPublication)){
        this.dateOfPublication = dateOfPublication;
        }
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        if(validateDateOfPurchase(dateOfPurchase)){
        this.dateOfPurchase = dateOfPurchase;
        }
    }
}
