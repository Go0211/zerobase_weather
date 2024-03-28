package zerobase.weather.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import zerobase.weather.domain.Diary;
import zerobase.weather.dto.DateRequest;
import zerobase.weather.dto.DiaryRequest;
import zerobase.weather.service.DiaryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DiaryController {
    private final DiaryService diaryService;

    @PostMapping("/create/diary")
    void createDiary(@RequestBody DiaryRequest request) {
        diaryService.createDiary(request.getDate(), request.getText());
    }

    @GetMapping("/read/diary")
    List<Diary> readDiary(@RequestBody DiaryRequest request) {
        return diaryService.readDiary(request.getDate());
    }

    @GetMapping("/read/diaries")
    List<Diary> readDiaries(@RequestBody DateRequest request) {
        return diaryService.readDiaries(request.getStartDate(), request.getEndDate());
    }

    @PutMapping("/update/diary")
    void updateDiary(@RequestBody DiaryRequest request) {
        diaryService.updateDiary(request.getDate(), request.getText());
    }

    @DeleteMapping("/delete/diary")
    void deleteDiary(@RequestBody DiaryRequest request) {
        diaryService.deleteDiary(request.getDate());
    }
}
