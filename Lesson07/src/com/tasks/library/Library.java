package com.tasks.library;

import java.util.*;

/**
 * Создать класс Библиотека, поля:
 * • Список книг (изначально пустой) методы:
 * • добавить книгу (принимает объект книги и добавляет его в список товаров).
 * При попытке добавить книгу с id уже существующем в списке, вставка производится не должна
 * • получить все книги (метод ВОЗВРАЩАЕТ список всех книг в библиотеке)
 * • удалить книгу (метод принимает id книги и удаляет из списка книгу с соответствующим id)
 * <p>
 * • редактировать книгу (принимает объект книги и редактирует их список товаров) Обратите внимание
 * что id книги и индекс книги в списке — это разные вещи, не перепутайте.
 * Id книги — это поле вашего объекта, вы при его создании его задаете.
 * А индекс книги в списке книг, это по сути её порядковый номер в списке(начинается с 0).
 */

public class Library {

    private List<Book> books;
    private final Map<Integer, Book> mapOfBooks;
    Scanner scanner = new Scanner(System.in);

    public Library() {
        books = new ArrayList<>();
        mapOfBooks = new LinkedHashMap<>();
    }


    public void addBook() {

        System.out.println("Please, enter id: ");
        Book book = new Book();
        book.setId(scanner.nextInt());
        System.out.println("Please, enter title: ");
        book.setTitle(scanner.next());
        System.out.println("Please, enter genre: ");
        book.setGenre(scanner.next());
        mapOfBooks.putIfAbsent(book.getId(), book);
        books = new ArrayList<>(mapOfBooks.values());
        System.out.println("Complete.");

        //  System.out.println(books);

    }

    public void getAllBooks() {

        books.forEach(System.out::println);
    }

    public void removeBook() {
        Iterator<Book> iterator = books.iterator();
        System.out.println("Please, enter id to remove the book: ");
        int id = scanner.nextInt();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (id == book.getId()) {
                iterator.remove();
                System.out.println("Book " + book.getTitle() + " have been removed from the library.");

            }
        }

    }

    public String editBook() {
        Iterator iterator = books.iterator();
        System.out.println("Please, enter id to edit the book: ");
        int id = scanner.nextInt();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            if (id == book.getId()) {
                System.out.println("Enter new id: ");
                book.setId(scanner.nextInt());
                System.out.println("Enter new title: ");
                book.setTitle(scanner.next());
                System.out.println("Enter new genre: ");
                book.setGenre(scanner.next());
                System.out.println("Book " + book.getTitle() + " has been removed from the library.");

            }

        }
        return "Library has been modified.";

    }

    public void sortedBooks() {
        books.sort(new TitleComparator());
        books.forEach(System.out::println);

    }

    public void sortedReverse() {
        books.sort(Comparator.reverseOrder());
        books.forEach(System.out::println);
    }

    public void getNewFirst() {
        Deque<Book> bookQueue = new LinkedList<>(books);

        while (!bookQueue.isEmpty()) {
            System.out.println(bookQueue.pollLast());
        }
    }

    public void enterLibrary() throws InterruptedException {
        System.out.println("Welcome to Library. What you are going to do? Please, make your choice: "
                + "\n1 - Watch books' collection."
                + "\n2 - Add new book."
                + "\n3 - Remove definite book."
                + "\n4 - Edit book's information."
                + "\n5 - Save and quite.");

        int userChoice = scanner.nextInt();
        while (userChoice < 1 || userChoice > 5) {
            System.out.println("Please, enter correct number (1-5)");
            enterLibrary();
        }
        switch (userChoice) {
            case 1: {
                getAllBooks();
                System.out.println("Would you like to sort this books by:"
                        + "\n1 - alphabetic order"
                        + "\n2 - reverse order"
                        + "\n3 - new first"
                        + "\nPlease, make your choice: ");
                userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        sortedBooks();
                        enterLibrary();

                    case 2:
                        sortedReverse();
                        enterLibrary();

                    case 3:
                        getNewFirst();
                        enterLibrary();

                }
            }
            case 2: {
                addBook();
                enterLibrary();
            }
            case 3: {
                removeBook();
                enterLibrary();
            }
            case 4: {
                editBook();
                enterLibrary();
            }


            case 5:
                System.out.println("Data saving...");
                Thread.sleep(1000);
                System.out.println("Bye-bye.");
                break;
        }
    }

}

