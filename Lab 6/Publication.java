class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public void displayPublication() {
        System.out.println("Author: " + authorName);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        System.out.println("Book Title: " + title);
        super.displayPublication();
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        System.out.println("Paper Title: " + title);
        super.displayPublication();
    }
}

public class Publication {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java PublicationDemo <authorName> <bookTitle> <paperTitle>");
            return;
        }

        String authorName = args[0];
        String bookTitle = args[1];
        String paperTitle = args[2];

        BookPublication book = new BookPublication(authorName, bookTitle);
        PaperPublication paper = new PaperPublication(authorName, paperTitle);

        // Dynamic method dispatch
        Book publication1 = book;
        Book publication2 = paper;

        publication1.displayPublication(); // Calls overridden method in BookPublication
        publication2.displayPublication(); // Calls overridden method in PaperPublication
    }
}