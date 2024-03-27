package zerobase.weather.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zerobase.weather.dto.DiaryRequest;
import zerobase.weather.service.DiaryService;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class DiaryController {
    private final DiaryService diaryService;

    @PostMapping ("/create/diary")
    void createDiary(@RequestBody DiaryRequest request) {

        diaryService.createDiary(request.getDate(), request.getText());
    }

    @GetMapping("/test/diary")
    void testDiary() {
        diaryService.createDiary();
    }
}
