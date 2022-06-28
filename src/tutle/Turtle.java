package tutle;

import static tutle.Direction.*;

public class Turtle {
    private boolean isPenUp = true;
    private  Position currentPosition = new Position(0,0);
    private Direction currentDirection = EAST;

    public boolean isPenUp(){
        return isPenUp;
    }
    public  void penDown(){
        isPenUp = false;
    }

    public void penUp(){
        isPenUp = true;

    }
    public Direction getCurrentDirection(){
        return currentDirection;
    }
    public void turnRight() {
        switch (currentDirection) {
            case EAST -> move(SOUTH);
            case SOUTH -> move(WEST);
            case WEST -> move(NORTH);
            case NORTH ->move(EAST);
        }
    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> move(NORTH);
            case NORTH -> move(WEST);
            case WEST ->move(SOUTH);
            case SOUTH ->move(EAST);
        }


    }
    private void move(Direction direction){
       this.currentDirection = currentDirection;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }


    public void moveFoward(int noOfSteps,SketchPad sketchPad ) {
        if(!isPenUp) writeOn(sketchPad, noOfSteps);
        moveFoward(noOfSteps);


    }

    public void writeOn(SketchPad sketchPad,int noOfSteps){
        int [][]floor = sketchPad.getFloor();
        int currentRow =currentPosition.getRow();
        int currentColumn = currentPosition.getColumn();
        switch (currentDirection){
            case EAST ->  {
                for (int i =currentColumn; i < currentColumn+noOfSteps; i++){
                    floor[currentRow][i]= 1;
                }
            }
        }
    }
    private void moveFoward(int noOfSteps){
       // if(currentDirection == EAST) increaseColumnBy(noOfSteps);
        switch (currentDirection) {
            case SOUTH -> increaseRowBy(noOfSteps);
            case EAST -> increaseColumnBy(noOfSteps);
            case WEST -> increaseColumnBy(noOfSteps);
            case NORTH -> increaseRowBy(noOfSteps);

//            i (currentDirection == SOUTH) increaseRowBy(noOfSteps);
//            if (currentDirection == WEST) increaseColumnBy(noOfSteps);
//            if (currentDirection == NORTH) increaseRowBy(noOfSteps);
//            if (currentDirection == EAST) increaseColumnBy(noOfSteps);
        }

    }

    private  void increaseColumnBy(int noOfSteps){
        int currentColumn = currentPosition.getColumn();
        currentPosition.setColumn(noOfSteps + currentColumn);

    }
    private void increaseRowBy(int noOfSteps){
        int currentRow = currentPosition.getRow();
        currentPosition.setRow(noOfSteps + currentRow);

    }


}
