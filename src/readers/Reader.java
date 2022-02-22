package readers;

public class Reader {
    String FIO;
    int student_number;
    String faculty;
    String date_of_birth;
    int phone_number;

    public Reader() {

    }

    public Reader(String FIO, int student_number, String faculty, String date_of_birth, int phone_number) {
        this.FIO = FIO;
        this.student_number = student_number;
        this.faculty = faculty;
        this.date_of_birth = date_of_birth;
        this.phone_number = phone_number;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getFIO() {
        return FIO;
    }

    public int getStudent_number() {
        return student_number;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void takeBook(int number_of_books) {
        System.out.println(this.FIO + " взял " + number_of_books + " книги");
        System.out.println();
    }

    public void takeBook(String... books) {
        System.out.println(this.FIO + " взял книги:");
        for (String book:books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.FIO + " взял книги:");
        for (Book book:books) {
            System.out.println(book.name_of_book);
        }
        System.out.println();
    }

    public void returnBook(int number_of_books) {
        System.out.println(this.FIO + " вернул " + number_of_books + " книги");
        System.out.println();
    }

    public void returnBook(String... books) {
        System.out.println(this.FIO + " вернул книги:");
        for (String book:books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.FIO + " вернул книги:");
        for (Book book:books) {
            System.out.println(book.name_of_book);
        }
        System.out.println();
    }
}

