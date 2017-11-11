package Validation;

import java.util.Scanner;

public class Validatior {
    public Validatior() {
        this.inputScanner = new Scanner(System.in);
    }

    private Scanner inputScanner;
    private String numberOfLays;
    private String direction;
    private char signOfTree;

        public Boolean isType(String testStr, String type) {
            try {
                 if (type.equalsIgnoreCase("int")) {
                    Integer.parseInt(testStr);
                } else if (type.equalsIgnoreCase("double")) {
                    Double.parseDouble(testStr);
                }
                return true;
            } catch(Exception e) {
                return false;
            }

    }
    public int validateNumberOfLays(){
        Boolean error = false;
        numberOfLays = "";
        int result = -1 ;
        do {
            numberOfLays = inputScanner.nextLine();
            if(!this.isType(numberOfLays, "int")) {
                error = true;
                System.out.println("Podana wartość musi być liczbą");
            }
            else {
                error = false;
                result = Integer.parseInt(numberOfLays);
                if(result <= 0) {
                    error = true;
                    System.out.println("Podana wartość musi być większa od zera");
                }
                else {
                    error = false;
                }
            }
            return result;
        } while(error = true);

    }
    public int validateDirection(){
        Boolean error = false;
        direction = "";
        int result = -1;
        do{
            direction = inputScanner.nextLine();
            if(!this.isType(direction, "int")) {
                error = true;
                System.out.println("Podana wartość musi być liczbą");
            }
            else {
                error = false;
                result = Integer.parseInt(direction);
                if (result <= 0 || result > 4) {
                    error = true;
                    System.out.println("Podana wartość musi być większa od zera i mniejsza bądź równa 4");
                } else {
                    error = false;
                }
            }
            return result;
        } while(error = true);

    }
    public char validateSign(){
        signOfTree = ' ';
        signOfTree = inputScanner.next().charAt(0);
        return  signOfTree;
    }

}
