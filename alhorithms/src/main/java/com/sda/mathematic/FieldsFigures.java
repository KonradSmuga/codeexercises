package com.sda.mathematic;

public class FieldsFigures {

/*


    a) kwadratu
    b) prostokąta
    c) równoległoboku
    d) trapezu
    e) trójkąta
    f) rombu
Jak wyżej - uwzględnienie możliwości popełnienia błędu przez użytkownika
 */

    public double fieldOfSquare(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException();
        }
        return a * a;
    }

    public double fieldOfRectangle(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException();
        }

        return a * b;
    }

    public double fieldOfParallelogram(double sideA, double heightOfParalleloram) {
        if (sideA <= 0 || heightOfParalleloram <= 0) {
            throw new IllegalArgumentException();
        }

        return sideA * heightOfParalleloram;
    }

    public double fieldOfTriangle(double sideA, double heighbOfTriangle) {
        if (sideA <= 0 || heighbOfTriangle <= 0) {
            throw new IllegalArgumentException();
        }

        return (sideA * heighbOfTriangle) / 2;
    }

    public double fieldOfDiamond(double sideA, double heighbOfTriangle) {
        if (sideA <= 0 || heighbOfTriangle <= 0) {
            throw new IllegalArgumentException();
        }

        return sideA * heighbOfTriangle;
    }

}
