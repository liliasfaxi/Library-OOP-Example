package library.interfaces;

import library.Book;

public interface Search {
    Book searchByISBN(String ISBN);
    Book searchByTitle(String title);
}
