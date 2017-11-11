/**
 * Created by Misiek on 2017-10-13.
 */
public class TreeGenerator {
    Tree tree;

    public void generateTree(int numberOfLays, char sign, Direction direction )
    {
        switch (direction) {
            case UP:
                tree = new UpTree();
                break;
            case DOWN:
                tree = new DownTree();
                break;
            case LEFT:
                tree = new LeftTree();
                break;
            case RIGHT:
                tree = new RightTree();
                break;
        }
        tree.drawMyTree(numberOfLays,sign);

    }
}
