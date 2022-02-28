package Homework_20220228;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    private boolean isTriangleValid() {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    public static void check(Triangle triangle) {
        if (triangle.isTriangleValid()) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is not valid.");
        }
    }

    public boolean isTriangleRight() {
        if ((sideA == sideB && sideA > sideC) || (sideA == sideC && sideA > sideB) || (sideB == sideC && sideB > sideA)) {
            return false;
        }

        int[] sides = trianglesSidesChoosing();

        return powOfNumber(sides[0], 2) == (powOfNumber(sides[1], 2) + powOfNumber(sides[2], 2));
    }

    public int[] trianglesSidesChoosing() {
        int hypotenuse;
        int perpendicular;
        int base;
        int[] sides = new int[3];

        if (sideA > sideB) {
            if (sideA > sideC) {
                hypotenuse = sideA;
                perpendicular = sideB;
                base = sideC;
            } else {
                hypotenuse = sideC;
                perpendicular = sideA;
                base = sideB;
            }
        } else if (sideB > sideC) {
            hypotenuse = sideB;
            perpendicular = sideA;
            base = sideC;
        } else {
            hypotenuse = sideC;
            perpendicular = sideA;
            base = sideB;
        }
        sides[0] = hypotenuse;
        sides[1] = perpendicular;
        sides[2] = base;

        return sides;
    }

    private int powOfNumber(int num, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }


}
