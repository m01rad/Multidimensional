package Multidimensional;

import java.util.Scanner;

public class Multidimensional {
    public int columnSize ;
    public int rowSize;
    public int[][] array;
    static Multidimensional n = null;
    private Scanner scanner = new Scanner(System.in);
    public String fDE = "";

    public String sDE = "";
    public String string = "";

    public Multidimensional(int columnSize, int rowSize){

        this.array = new int[columnSize][rowSize];
    }

    public void enterValues(){
        for(int i = 0 ; i<this.array.length;i++){
            for (int j= 0 ; j<this.array[i].length ;j++){

                this.array[i][j] = scanner.nextInt();
                fDE= i == j  ? fDE + this.array[i][j] +" " :fDE;
                sDE =i == (this.array.length-1) -j ? sDE+ this.array[i][j] +" " : sDE;
            }
        }

    }

    public String findFirstDiogonalElements(){

           return "firstDigonalElem: " +fDE;
    }
    public String findSecondDiogonalElements(){

        return  "seconDigonalElements: "+ sDE;
    }
     public String printArrayElementsMatrixFormat(){
         for (int[] arrays: this.array
              ) {
             for (int elem: arrays
                  ) {
                 string += elem + " ";
             }
             string +='\n';
         }
         return string;
     }

    @Override

    public String toString(){
        return ("Multidimensional.Multidimensional{" + '\n'+
                    "   rowSize: " + rowSize + '\n'+
                    "   columnSize: " +columnSize + '\n'+
                 "}" );
    }

}
