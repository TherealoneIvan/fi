package com.example.fi.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
class FibbonachiImp implements FibbonachiService {

    public static final String INPUT_INTEGER_LESS_THA_ZERO = "Input Integer less tha zero";

    @Override
    public int f(int n) throws ResponseStatusException {
        if (n < 0) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, INPUT_INTEGER_LESS_THA_ZERO);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; ++i) {
                int next = a + b;
                a = b;
                b = next;
            }
            return b;
        }
    }
}