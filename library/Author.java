package library;

import java.util.Date;

import library.utils.FullName;

public class Author {
    private FullName name;
    private String biography;
    private Date birthDate;
    
    public Author(FullName name, String biography, Date birthDate) {
        this.name = name;
        this.biography = biography;
        this.birthDate = birthDate;
    }
}
