package com.HaiN1.Service2.controller;


import com.HaiN1.Service2.model.Film;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilmController {

    @GetMapping("/films")
    public ResponseEntity<List<Film>> getAllFilm(){
        List<Film> books = new ArrayList<>();
        books.add(new Film("Tom & Jerry", "Tom, Jerry, Snoop"));
        books.add(new Film("Money Heist", "Professor, Berlin, Tokyo, Nairobi, Helsinki"));
        books.add(new Film("Làng Vũ Đại ngày ấy", "Chí Phèo, Thị Nở, Bá Kiến, Ông Giáo"));
        return ResponseEntity.ok().body(books);
    }
}
