/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication31;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Acer
 */
public class BookLinkedList {
    private LinkedList<Book> bookList = new LinkedList<>();

    public class Book {
        String name;
        int position;

        public Book(String name, int position) {
            this.name = name;
            this.position = position;
        }

        public String getName() {
            return name;
        }

        public int getPosition() {
            return position;
        }

        @Override
        public String toString() {
            return name + " (Position: " + position + ")";
        }
    }

    public void addBook(String name, int position) {
        Book newBook = new Book(name, position);
        bookList.add(newBook);
    }

    public void removeBook(int position) {
        Book bookToRemove = null;
        for (Book book : bookList) {
            if (book.position == position) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            bookList.remove(bookToRemove);
        }
    }

    public String searchBookByPosition(int position) {
        for (Book book : bookList) {
            if (book.getPosition() == position) {
                return book.getName();
            }
        }
        return "Book not found at position " + position;
    }

    public String displayBooks() {
    StringBuilder displayText = new StringBuilder();
    
  
    ListIterator<Book> listIterator = bookList.listIterator(bookList.size());
    while (listIterator.hasPrevious()) {
        Book book = listIterator.previous();
        displayText.append(book.toString()+"\n");
    }
    
    return displayText.toString();
}
}
