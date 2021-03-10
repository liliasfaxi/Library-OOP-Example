package library;

import java.util.Calendar;
import java.util.Date;

import library.utils.AccountState;
import library.utils.Address;
import library.utils.Format;
import library.utils.FullName;
import library.utils.Language;

public class Main {
    public static void main(String[] args){
        System.out.println("This is your library application!");

        Library lib = new Library("Borrow the World", new Address("18 St Paul's Street ", "West Yorkshire", "Leeds", "LS1 2TE", "UK"));
        
        Client sarah = new Client(new FullName("Sarah","Chloe","Anderson"), new Address("2 Sesame Street","Barbican","London","EC1A 7JQ", "UK"));
        Account account = new Account(Library.LAST_ACCOUNT_NUMBER++, Calendar.getInstance().getTime() , AccountState.Active, sarah);
        lib.addAccount(account);

        Calendar myDate = Calendar.getInstance();
        myDate.set(Calendar.YEAR, 1893);
        Author dP = new Author(new FullName("Dorothy", "", "Parker"), "Poet and Author", myDate.getTime());
        
        myDate.set(Calendar.YEAR, 1948);
        Author gRRM = new Author(new FullName("George", "R.R.", "Martin"), "Author", myDate.getTime());

        myDate.set(Calendar.YEAR, 1931);
        BookItem hereWeAre = new BookItem("1-86092-017-9", "Here we are", dP, "Comedy", myDate.getTime(), Language.English, "11111111", 130, Format.Paperback);
        
        myDate.set(Calendar.YEAR, 1991);
        BookItem aSongOfIceAndFire = new BookItem("9780739308684", "A Song Of Ice And Fire", gRRM, "Fantasy", myDate.getTime(), Language.English, "11111111", 694, Format.Hardcover);

        lib.addBook(hereWeAre);
        lib.addBook(aSongOfIceAndFire);

        Catalog c = lib.getCatalog();
        c.addRecord(aSongOfIceAndFire);

        c.searchByTitle("A Song Of Ice And Fire");

        c.searchByISBN("1-86092-017-9");

    }
}