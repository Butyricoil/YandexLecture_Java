package firstLecture;

public class SquarEquation {
    private int a, b, c;

    public SquarEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solveEquation() {
        double discriminant = b * b - 4 * a * c;
        if (a != 0) {
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                if (root1 < root2)
                    System.out.println(root1 + " " + root2);
                else
                    System.out.println(root2 + " " + root1);

            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println(root);
            } else
                System.out.println("I can't solve");

        } else if (b != 0) {
            double root = (-c / b);
            System.out.println(root);
        } else if (c != 0)
            System.out.println("there is no solution");
        else
            System.out.println("infinite numbers of solutions");
    }
}
