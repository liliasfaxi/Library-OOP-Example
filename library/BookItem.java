package library;

import java.util.Date;

import library.utils.*;

public class BookItem extends Book{
    
    private String barCode;
    private String tag;
    private Boolean isReferenceOnly = false;
    private int numberOfPages;
    private Format format;
    private Date borrowed;
    private Date dueDate;
    private Boolean isOverdue;
    
    public BookItem(String ISBN, String title, Author author, String subject, Date publicationDate, Language lang, String barCode, int numberOfPages, Format format) {
        super(ISBN, title, author, subject, publicationDate, lang);
        this.barCode = barCode;
        this.numberOfPages = numberOfPages;
        this.format = format;
    }

    
    
}
