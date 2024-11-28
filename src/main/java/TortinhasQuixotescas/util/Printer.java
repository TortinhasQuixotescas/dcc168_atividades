package TortinhasQuixotescas.util;

public class Printer {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void printAuthors() {
        Author[] authors = Author.getAuthors();
        for (int i = 0; i < authors.length; i++) {
            System.out.println(authors[i].getName() + " " + authors[i].getSurname()
                    + "\n" +
                    "Matrícula: " + authors[i].getRegistrationNumber()
                    + "\n" +
                    "E-mail: " + authors[i].getEmail()
            );
            if (i == authors.length - 2) {
                System.out.println("e ");
            } else if (i == authors.length - 1) {
                return;
            } else {
                System.out.println(", ");
            }
        }

    }
}
