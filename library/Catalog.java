package library;

import java.util.ArrayList;
import java.util.List;

import library.interfaces.*;

public class Catalog implements Search, Manage{

    private List<BookItem> records;

    public Catalog(){
        records = new ArrayList<BookItem>();
    }

    public void addRecord(BookItem book){
        records.add(book);
        System.out.println("Book ("+book.getTitle()+") added to Catalog");
    }

    @Override
    public void manage(Book book) {
        System.out.println("Managing the book: "+book.getTitle());
        System.out.println("....");
        System.out.println("Book Managed!");
    }

    @Override
    public Book searchByISBN(String ISBN) {
        System.out.println("Searching the book with ISBN: "+ISBN);
        for (BookItem record:records){
            if (record.getISBN().equals(ISBN)){
                System.out.println("--> Book found!");
                return record;
            }
        }
        System.out.println("--> Book not found...");
        return null;
    }

    @Override
    public Book searchByTitle(String title) {
        System.out.println("Searching the book with title: "+title);
        for (BookItem record:records){
            if (record.getTitle().equals(title)){
                System.out.println("--> Book found!");
                return record;
            }
        }
        System.out.println("--> Book not found...");
        return null;
    }
    
}
