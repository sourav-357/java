package Section7_Classes_Objects;

public class Challenge35 {
    private double real;
    private double imaginary;

    // Constructor
    public Challenge35(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter for real
    public double getReal() {
        return this.real;
    }

    // Getter for imaginary
    public double getImaginary() {
        return this.imaginary;
    }

    // Add with two double parameters
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    // Add with Challenge35 parameter
    public void add(Challenge35 other) {
        add(other.getReal(), other.getImaginary());
    }

    // Subtract with two double parameters
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // Subtract with Challenge35 parameter
    public void subtract(Challenge35 other) {
        subtract(other.getReal(), other.getImaginary());
    }
}


// A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers,
//  and i is a solution of the equation x2 = −1. Because no real number satisfies this equation,
//  i is called an imaginary number. For the complex number a + bi, a is called the real part,
//  and b is called the imaginary part. To add or subtract two complex numbers, 
// just add or subtract the corresponding real and imaginary parts. For instance,
//  the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.

// Write a class with the name Challenge35. The class needs two fields (instance variables) with name real 
// and imaginary of type double. It represents the Complex Number.

// The class needs to have one constructor. The constructor has parameters real and imaginary of type double
//  and it needs to initialize the fields.

// Write the following methods (instance methods):
// * Method named getReal without any parameters, it needs to return the value of real field.
// * Method named getImaginary without any parameters, it needs to return the value of imaginary field.
// * Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields. In other words, it needs to do a complex number add operation as described above.
// * Method named add with one parameter of type Challenge35. It needs to add the Challenge35 parameter to the corresponding instance variables.
// * Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters from fields, in other words, it needs to do a complex number subtract operation as described above.
// * Method named subtract with one parameter other of type Challenge35. It needs to subtract the other parameter from this complex number.


// TEST EXAMPLE

// → TEST CODE:
// Challenge35 one = new Challenge35(1.0, 1.0);
// Challenge35 number = new Challenge35(2.5, -1.5);
// one.add(1,1);
// System.out.println("one.real= " + one.getReal());
// System.out.println("one.imaginary= " + one.getImaginary());
// one.subtract(number);
// System.out.println("one.real= " + one.getReal());
// System.out.println("one.imaginary= " + one.getImaginary());
// number.subtract(one);
// System.out.println("number.real= " + number.getReal());
// System.out.println("number.imaginary= " + number.getImaginary());

// → OUTPUT

// one.real= 2.0
// one.imaginary= 2.0
// one.real= -0.5
// one.imaginary= 3.5
// number.real= 3.0
// number.imaginary= -5.0
