package com.endava.jpademo.service;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find user with ID: " + id);
    }
}
