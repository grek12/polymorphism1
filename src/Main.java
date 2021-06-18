public class Main {

    public static void main(String[] args) {
	// write your code here
        Book book = new Book("OOO", "Dolgov");
        Journal journal = new Journal("OOO",150);
        book.print();
        journal.print();
    }
}
