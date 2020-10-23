package com.will;

public class Main {

    public static void main(String[] args) {
        var textBox1 = new TextBox(); // creates a new object or instance of the textBox class and saves a reference of it in the stack
        textBox1.setText("Box 1"); // sets the value within the object
        System.out.println(textBox1.text.toUpperCase()); // textBox1 is the location in memory .text give you the actual value of textBox1

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
    }
}
