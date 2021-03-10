package library;

import java.util.Date;

import library.utils.FullName;

public class Author {
    private FullName name;
    private String bibliography;
    private Date birthDate;
    
    public Author(FullName name, String bibliography, Date birthDate) {
        this.name = name;
        this.bibliography = bibliography;
        this.birthDate = birthDate;
    }
}
