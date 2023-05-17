package com.example.namify_rest.controller;

import com.example.namify_rest.model.DataResult;
import com.example.namify_rest.model.NameRequest;
import com.example.namify_rest.service.DataFetchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class DataController {
    private final DataFetchingService dataFetchingService;

    @Autowired
    public DataController(DataFetchingService dataFetchingService) {
        this.dataFetchingService = dataFetchingService;
    }

    @PostMapping("/data")
    public ResponseEntity<DataResult> fetchData(@RequestBody NameRequest nameRequest) {
        String name = nameRequest.getName();
        DataResult result = dataFetchingService.fetchAllData(name);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}


