/**
 * Created by Misiek on 2017-10-13.
 */
public class DownTree extends  Tree {
    @Override
    protected void drawMyTree(int numberOfLays, char sign) {
        for (int i = numberOfLays -1; i >= 0; i--) {
            drawLine((numberOfLays - i), (2 * i) + 1, sign);
        }
    }
}
