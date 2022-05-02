import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static Multidimensional multidimensional;

    public static void createObj(int a, int b){
        if(a == b) multidimensional = new Multidimensional(a,b);

        else {
            System.out.println("Try again");
            System.out.print("columnSize: ");
            int columnCount = scanner.nextInt();
            System.out.print("rowSize: ");
            int rowCount = scanner.nextInt();
            createObj(columnCount, rowCount);
        }
    }

    public static void main(String[] ar){
        Scanner scanner = new Scanner(System.in);
      Object o = new Object();

        System.out.print("columnSize: ");
       int columnCount = scanner.nextInt();
        System.out.print("rowSize: ");
        int rowCount = scanner.nextInt();
        createObj(columnCount ,rowCount);

        multidimensional.enterValues();

       System.out.println(multidimensional.findFirstDiogonalElements());
       System.out.println(multidimensional.findSecondDiogonalElements());
        System.out.println(multidimensional.printArrayElementsMatrixFormat());
    }
}
