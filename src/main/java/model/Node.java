package model;

public class Node {
    private Direction direction;

    public Node(Direction direction){
        this.direction = direction;
    }
    public static Node of(Direction direction){
        Node n = new Node(direction);
        return n;
    }
    
    public Direction getDirection(){
        return direction;
    }

    public int move(int position) {
        if(isLeft(position)){
            position += -1;
        }
        if(isRight(position)){
            position += 1;
        }
        return position;
    }
    private boolean isLeft(int position) {
        return direction.getDirect() == -1;
    }

    private boolean isRight(int position) {
        return direction.getDirect() == 1;
    }
}
