/**
 * Created by Misiek on 2017-10-13.
 */
public class LeftTree extends Tree {
    @Override
    protected void drawMyTree(int numberOfLays, char sign) {
        for (int i = 0; i < 2*numberOfLays - 1; i++) {
            drawLine((Math.abs(numberOfLays - 1 - i )),(numberOfLays - 1) -Math.abs((numberOfLays - 1 ) - i) +1  , sign);
        }
    }
}
