/**
 * Created by Misiek on 2017-10-13.
 */
public class UpTree extends Tree {
    @Override
    protected void drawMyTree(int numberOfLays, char sign) {
        for (int i = 0; i < numberOfLays; i++) {
            drawLine((numberOfLays - i), (2 * i) + 1, sign);
        }
    }
}

