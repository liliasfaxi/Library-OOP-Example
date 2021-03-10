package library;

import java.util.Date;

import library.utils.Language;

public abstract class Book{

    protected String ISBN;
    protected String title;
    protected String subject;
    protected String overview;
    protected Date publicationDate;
    protected Language lang;

    protected Author author;

    public Book(String iSBN, String title, Author author, String subject, Date publicationDate, Language lang) {
        ISBN = iSBN;
        this.title = title;
        this.subject = subject;
        this.publicationDate = publicationDate;
        this.lang = lang;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    
    public Object getISBN() {
        return ISBN;
    }
}