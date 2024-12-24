package nested.test.ex1;

public class Library {
    static class Book {
        private String title;

        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "도서 제목: " + title + ", 저자: " + author;
        }
    }

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        this.bookCount = 0;
    }

    public void addBook(String title, String author) {
        //검증 로직 처리
        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        //정상 로직 처리
        books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].toString());
        }
    }
}
