package TortinhasQuixotescas.util;

public class Author {
    private final String name;
    private final String surname;
    private final String registrationNumber;
    private final String email;

    private Author(String name, String surname, String registrationNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.registrationNumber = registrationNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getEmail() {
        return email;
    }

    public static Author[] getAuthors() {
        Author author1 = new Author(
                "Gabriel",
                "Dutra Almeida Malosto",
                "202176002",
                "gabriel.malosto@estudante.ufjf.br");
        Author author = new Author(
                "Lucas",
                "Paiva dos Santos",
                "202176026",
                "lucas.paiva@estudante.ufjf.br");
        Author[] authors;
        authors = new Author[]{author1, author};
        return authors;
    }
}

