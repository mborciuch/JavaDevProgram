/**
 * Created by Misiek on 2017-10-13.
 */
public enum Direction {
    UP("1"),DOWN("2"),LEFT("3"),RIGHT("4");
    String directionNumber;
    Direction(String directionNumber) {
        this.directionNumber = directionNumber;

    }
    public static Direction getEnum(int i)
    {
        switch (i){
            case 1:
                return UP;
            case 2:
                return DOWN;
            case 3:
                return LEFT;
            case 4:
                return RIGHT;
            default:
                return null;
        }

    }
}
