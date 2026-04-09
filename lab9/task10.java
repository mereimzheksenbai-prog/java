

class Library {
    class Book {
        String title;
        Book(String title) {
            this.title = title;
        }

        void showTitle() {
            System.out.println("Кітап атауы: " + title);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Library.Book b = lib.new Book("Java негіздері");
        b.showTitle();
    }
}
