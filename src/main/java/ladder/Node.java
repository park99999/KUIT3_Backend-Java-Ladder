package ladder;

public class Node {
    private Direction direction;
    private Node(Direction direction) {
        this.direction = direction;
    }
    public static Node of(Direction direction) {
        return new Node(direction);
    }
    public Position move(Position position) {

        if (isRight()) {
            return position.next();
        }
        if (isLeft()) {
            return position.prev();
        }
        return position;
    }

     public boolean isLeft() {
        return Direction.left == direction;
    }

    public boolean isRight() {
        return Direction.right == direction;
    }
}
