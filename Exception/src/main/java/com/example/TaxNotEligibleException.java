package com.example;

class TaxNotEligibleException extends Exception {
    // Custom exception class for tax not eligible
        public TaxNotEligibleException(String message) {
        super(message);//calling the constructor of parent class
    }
    }

