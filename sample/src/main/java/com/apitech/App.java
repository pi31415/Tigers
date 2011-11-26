package com.apitech;

/**
 * Hello world!
 */
public class App {

    /**
     * Test String
     */
    private String testString;

    /**
     * Entry for running application
     * @param args Not used
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * Standard getter
     * @return
     */
    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }
}
