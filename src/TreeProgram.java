import Validation.Validatior;

import java.util.Scanner;

/**
 * Created by Misiek on 2017-10-14.
 */
public class TreeProgram {
    private int numberOfLays;
    private int direction;
    private Direction enumDirection;
    private char signOfTree;
    private TreeGenerator treeGenerator;
    private Validatior validatior;

    public TreeProgram(){
        this.treeGenerator = new TreeGenerator();
       this.validatior = new Validatior();
    }

    public  void runTreeProgram() {

                System.out.println("Program do rysowania choinek");
                numberOfLays = getNumberOfLays();
                direction = getDirection();
                enumDirection = Direction.getEnum(direction);
                getSymbol();
                generateTree();



    }

    private void getSymbol() {

        System.out.println("Podaj symbol, z którego składa się choinka ");
        signOfTree = validatior.validateSign();
    }

    private void generateTree() {
        System.out.println("Twoja choinka: ");
        treeGenerator.generateTree(numberOfLays,signOfTree, enumDirection);
    }

    private  int getDirection() {
        System.out.println("Podaj kierunek: Góra: 1 , Dół : 2, Lewo : 3, Prawo : 4");
        direction = validatior.validateDirection();
        return direction;
    }
    private  int getNumberOfLays() {
        System.out.println("Podaj liczbę warstw (większa od 0) ");
        numberOfLays = validatior.validateNumberOfLays();
        return  numberOfLays;
    }

}
