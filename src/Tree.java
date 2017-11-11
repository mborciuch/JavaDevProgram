/**
 * Created by Misiek on 2017-10-13.
 */
public abstract class Tree {

    protected void drawLine(int emptySpace ,int numberOfSigns,char sign){
        for(int i = 0; i < emptySpace; i++){
            System.out.print(" ");
        }
        for(int i = 0; i< numberOfSigns; i++){
            System.out.print(sign);
        }
        System.out.println();
    }

    protected void drawMyTree(int numberOfLays, char sign){};
}
