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

    } // end of constructor

} // end of class
