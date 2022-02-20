package readers;

public class MainReader {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В. В.", 110023, "ФКП", "25.08.2001", 76544567);
        Reader reader2 = new Reader();
        reader2.setFIO("Иванов П. П.");
        reader2.setStudent_number(983723);
        reader2.setFaculty("ФИТУ");
        reader2.setDate_of_birth("03.12.2001");
        reader2.setPhone_number(72683682);
        Book book1 = new Book("Убийство в восточном экспрессе", "Кристи А.");
        Book book2 = new Book();
        book2.setName_of_book("Мастер и Маргарита");
        book2.setAuthor_of_book("Булгаков М.");
        reader1.takeBook(3);
        reader1.takeBook("Евгений Онегин", "Отцы и дети", "Денискины рассказы");
        reader1.takeBook(book1);
        reader1.returnBook("Евгений Онегин", "Отцы и дети", "Денискины рассказы");
        reader2.returnBook(3);
        reader2.returnBook(book1, book2);
    }
}
