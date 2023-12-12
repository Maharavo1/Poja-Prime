package com.hei.school.endpoint.rest.controller;

import com.hei.school.PojaGenerated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Random;
@RestController
@PojaGenerated
public class GetPrimeNumberController {
    @GetMapping("/Prime-Number")
    public static BigInteger getPrime(){
        BigInteger prime = BigInteger.probablePrime(24, new Random());
        return prime;
    }
}
