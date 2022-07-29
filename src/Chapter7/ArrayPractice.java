package Chapter7;

public class ArrayPractice {

    String[] names = {"David", "Melina", "Esther", "Jon"};
    String[] foodList = new String[4];
    String[] foods = {"pizza", "burger", "fries", "pancakes"};
    int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 70, 60, 37};

    public ArrayPractice (){

        for(int index = 0; index < names.length; index++){
            System.out.println(names[index]);
        }

        for (int index = 0; index < foodList.length; index++){
            foodList[index] = foods[index];
            System.out.println(foodList[index]);
        }

        int counter = 0;
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int a: array){
            System.out.printf("%5d%5d%n", counter, a);
            counter++;
        }

        barChart();
    } // end of constructor


    public void barChart(){
        int[] grades = {0, 0 , 0, 7, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("Grade Distribution:");

        for (int counter = 0; counter < grades.length; counter++){

            if (counter == 10){
                System.out.printf("%5d: ", 100);

            } else {
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
            }

            for (int index = 0; index < grades[counter]; index++){
                System.out.print(" * ");
            }
            System.out.println();

        } // end of for loop

        System.out.println();


    } // end of barChart

} // end of class
