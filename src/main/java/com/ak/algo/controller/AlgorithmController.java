package com.ak.algo.controller;

import com.ak.algo.Service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlgorithmController {

    @Autowired
    private AlgorithmService algorithmService;

    @GetMapping("/getNOrderAlgoResults")
    public long getNOrderAlgoResults(@RequestParam("input") List<Integer> input){
        return algorithmService.getNOrderAlgorithmResults(input);
    }

    @GetMapping("/getN2OrderAlgoResults")
    public long getN2OrderAlgoResults(@RequestParam("input") List<Integer> input){
        return algorithmService.getN2OrderAlgorithmResults(input);
    }

    @GetMapping("/getN3OrderAlgoResults")
    public long getN3OrderAlgoResults(@RequestParam("input") List<Integer> input){
        return algorithmService.getN3OrderAlgorithmResults(input);
    }
}
