package library;

import java.lang.reflect.Array;
import java.util.Date;

import library.utils.AccountState;

public class Account {
    private int number;
    private Date opened;
    private AccountState state;
    private Client owner;

    private BookItem[] borrowed = new BookItem[12];
    private BookItem[] reserved = new BookItem[3];

    private int nbBorrowed = 0;
    private int nbReserved = 0;
    
    public Account(int number, Date opened, AccountState state, Client owner) {
        this.number = number;
        this.opened = opened;
        this.state = state;
        this.owner = owner;
    }

    public void borrow(BookItem book){
        if (nbBorrowed <= 12){
            borrowed[nbBorrowed-1] = book;
            nbBorrowed++;
            System.out.println("The book "+book.getTitle()+" was borrowed by "+ this.owner.getFullName());
        }else{

        }
    }

    public void reserve(BookItem book){
        if (nbBorrowed <= 3){
            reserved[nbReserved-1] = book;
            nbReserved++;
            System.out.println("The book "+book.getTitle()+" was reserved by "+ this.owner.getFullName());
        }else{

        }
    }
}
