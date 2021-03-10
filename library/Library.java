package library;

import java.util.ArrayList;
import java.util.List;

import library.utils.Address;

public class Library {

    public static int LAST_ACCOUNT_NUMBER = 0;
    
    private String name;
    private Address address;

    private List<Account> accounts;
    private List<BookItem> books;

    private Catalog catalog;

    public Library(String name, Address address) {
        this.name = name;
        this.address = address;
        setCatalog(new Catalog());
        accounts = new ArrayList<Account>();
        books = new ArrayList<BookItem>();
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void addBook(BookItem book){
        books.add(book);
    }

    
    
    
    
}
