package com.example;

class CountryNotValidException extends Exception {
    // Custom exception class for invalid country
        public CountryNotValidException(String message) {
        super(message);//calling the constructor of parent class
    }
    }

