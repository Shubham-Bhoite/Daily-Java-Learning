class Book {
    private String title;
    private int pages;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("Page count must be positive.");
        }
    }

    public int getPages() {
        return pages;
    }
}

public class Page {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Java Programming");
        book.setPages(500);

        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Number of Pages: " + book.getPages());
    }
}
