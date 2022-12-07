package com.HaiN1.Service1.controller;


import com.HaiN1.Service1.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    List<Book> books = new ArrayList<>();

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        books.add(new Book(1,"Dế Mèn Phiêu Lưu Ký", "Tô Hoài"));
        books.add(new Book(2,"Sherlock Homes", "Arthur Conan Doyle"));
        books.add(new Book(3,"Lược sử loài người", "Yuval Noah Harari"));
        return ResponseEntity.ok().body(books);
    }

    @PostMapping("/add")
    public String addBook(@RequestBody Book newBook){
        books.add(newBook);
        return "Add New Book Success";
    }
}
