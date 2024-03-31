public class ConstructorAndMethods {
    final int LENGTHARR = 5,B1 = 5,NEWVECTOR = 3;
    private final int[] a;

    public ConstructorAndMethods() {
        this.a = new int[LENGTHARR];
    }

    public void setA() {
        int[] list = {-5, 2, 10, 14, 23, 9, -54, 102, 79, 33}, a1 = new int[a.length];
        System.out.print("Example elements: ");
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.print("\nChanged elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = list[i];
            System.out.print(a[i]+" ");
        }
        System.out.print("\n\nVector 1: ");
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.print("\nVector 2: ");
        for (int i = 0; i < a.length; i++) {
            a1[i]=a[i] * NEWVECTOR;
            System.out.print(a1[i]+" ");
        }
    }

    public void lengthA() {
        System.out.println("\n\nVector's length: " + a.length);
    }

    public void MinMaxA() {
        int min = a[0], max = a[0];

        for (int i = 0; i < a.length; ) {
            int c = min > a[i] ? min = a[i] : i++;
            i--;
            int c1 = max < a[i] ? max = a[i] : i++;
        }

        System.out.println("Minimal element: " + min
                + "\nMaximal element: " + max);
    }

    public void sortA() {
        System.out.print("Sorted example: ");
        int b;
        int[] a1 = new int[a.length];

        System.arraycopy(a, 0, a1, 0, a.length);

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a1[i] > a1[i + 1]) {
                    b = a1[i];
                    a1[i] = a1[i + 1];
                    a1[i + 1] = b;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a1[i] + " ");
        }
    }

    public void euclidnorm() {
        int a1 = 0;
        for (int j : a) {
            a1 += j * j;
        }
        System.out.println("\nEuclidean norm: " + Math.sqrt(a1));
    }

    public void multiplicationVectorOnNumber() {
        System.out.print("Multiplying vector on a number: ");
        int[] a1 = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            a1[i] = a[i] * B1;
        }
        for (int j : a1) {
            System.out.print(j + " ");
        }
    }

    public void sumVectors() {
        System.out.print("\nVectors' sum: ");
        int[] a1 = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a1[i] = a[i] * NEWVECTOR;
            System.out.print(a1[i] + a[i] + " ");
        }
    }

    public void scalarMultiplication() {
        System.out.print("\nVectors' scalar multiplying: ");
        int[] a1 = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a1[i] = a[i] * NEWVECTOR;
            System.out.print(a1[i] * a[i] + " ");
        }
    }
}
