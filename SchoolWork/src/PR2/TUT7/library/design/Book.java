package PR2.TUT7.library.design;

import java.util.ArrayList;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private ArrayList<String> publishers;
    private String language;
    private int numberOfPages;
    private String subject;

    private boolean validateISBN(String isbn){
        return isbn.length()<10;
    }
    private boolean validateTitle(String title){
        return title.length()<60;
    }
    private boolean validateAuthor(String author) {
        return author.length() < 30;
    }
    private boolean validateLanguage(String language){
        return language.length()<20;
    }
    private boolean validateNumberOfPages(int numberOfPages){
        return numberOfPages>0;
    }

    public Book(String title, String ISBN, String author, String subject,ArrayList<String> publishers,String language, int numberOfPages){
        if(validateAuthor(author)){
            this.author=author;
        }
        if(validateISBN(ISBN)){
            this.ISBN= ISBN;
        }
        if(validateLanguage(language)){
            this.language = language;
        }
        if(validateTitle(title)){
            this.title=title;
        }
        if(validateNumberOfPages(numberOfPages)) {
            this.numberOfPages = numberOfPages;
        }
        this.publishers= publishers;
        this.subject = subject;
    }

}
