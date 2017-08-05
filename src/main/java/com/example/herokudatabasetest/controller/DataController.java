package com.example.herokudatabasetest.controller;

import com.example.herokudatabasetest.entity.Data;
import com.example.herokudatabasetest.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class DataController {

    @Autowired private DataRepository dataRepository;

    @PostMapping
    public void init() {
        List<Data> dataList = this.dataRepository.save(Arrays.asList(
            new Data(null, "test1"),
            new Data(null, "test2")
        ));
        System.out.println(dataList);
    }

    @GetMapping
    public List<Data> getDataList() {
//        return this.dataRepository.findAll();
        return Arrays.asList(new Data(1L, "ebiahr"));
    }
}
