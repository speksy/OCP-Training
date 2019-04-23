package com.speksy.ocp.chapter6.rethrowingExceptions;

import java.io.IOException;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class RethrowingDemo {
    public static void main(String[] args) {

    }
    // Common pattern for log then throw the same exception
    public void multiCatch() throws SQLException, DateTimeParseException {
        try {
            parseData();
        } catch (SQLException | DateTimeParseException e) {
            System.err.println(e);
            throw e;
        }
    }

    // add IOException in method signiture without change anything else
    // We are allowed to throw extra exceptions not explicitly defined in catch clause
    public void multiCatch2() throws IOException, SQLException,
            DateTimeParseException {
        try {
            parseData2();
        } catch (IOException | DateTimeParseException e) {
            System.err.println(e);
            throw e;
        }
    }

    // prevents duplication of "SQLException, DateTimeParseException"
    public void rethrowing() throws SQLException, DateTimeParseException {
        try {
            parseData();
        } catch (Exception e) {
            System.err.println(e);
            throw e;
        }
    }

    // later if code in try block throws more exceptions just add them to method signature
    public void rethrowing2() throws IOException, SQLException, DateTimeParseException {
        try {
            parseData2();
        } catch (Exception e) {
            System.err.println(e);
            throw e;
        }
    }

    private void parseData2() throws IOException, SQLException, DateTimeParseException {
    }

    private void parseData() throws SQLException, DateTimeParseException {
    }
}
