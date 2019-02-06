package com.ak.algo.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlgorithmService {

    public long getNOrderAlgorithmResults(List<Integer> input) {
        long sum = 0, best = Integer.MIN_VALUE;
        for (int e : input) {
            sum = Math.max(e, sum);
            best = Math.max(sum, best);
        }
        return best;
    }

    public long getN2OrderAlgorithmResults(List<Integer> input) {
        long sum, best = Integer.MIN_VALUE;
        for (int i = 0; i < input.size(); i++) {
            sum = 0;
            for (int j = i; j < input.size(); j++) {
                sum += input.get(j);
                best = Math.max(best, sum);
            }
        }
        return best;
    }

    public long getN3OrderAlgorithmResults(List<Integer> input) {
        long sum, best = Integer.MIN_VALUE;
        for (int i = 0; i < input.size(); i++) {
            for (int j = i; j < input.size(); j++) {
                sum = 0;
                {
                    for (int k = i; k < j; k++) {
                        sum += input.get(k);
                    }
                    best = Math.max(best, sum);
                }
            }
        }
        return best;
    }
}