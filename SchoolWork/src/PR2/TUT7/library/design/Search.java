package PR2.TUT7.library.design;

public interface Search {
    void searchByTitle(String title);
    void searchByAuthor(String author);
    void searchBySubject(String subject);
    void searchByFormat(BookItem.BookFormat format);
}
