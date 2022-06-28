package turtleMovement;

import static turtleMovement.Directions.*;


public class Turtle {

    private Directions currentDirection = EAST;
    private boolean isPenUp = true;
    private Posittion currentPosition = new Posittion(0,0);


    public boolean isPenUp(){
        return isPenUp;
    }
    public void penDown() {
        this.isPenUp = false;
    }

    public void penUp() {
        this.isPenUp = true;
    }


    public void turnRight() {
        switch (currentDirection) {
            case EAST -> move(SOUTH);
            case SOUTH -> move(WEST);
            case WEST ->move(NORTH);
            case NORTH -> move(EAST);
        }

    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> move(NORTH);
            case NORTH -> move(WEST);
            case WEST -> move(SOUTH);
            case SOUTH -> move(EAST);
        }
    }
    private void move(Directions direction){
        currentDirection = direction;
    }

    public void moveFoward(int noOfSteps) {
        switch (currentDirection){
            case EAST -> increaseColumnBy(noOfSteps);
            case WEST -> increaseColumnBy(noOfSteps);
            case SOUTH -> increaseRowBy(noOfSteps);
            case NORTH -> increaseRowBy(noOfSteps);
        }

    }
    public void moveFoward(int noOfSteps, SketchPad sketchPad) {
        if (!isPenUp) writeOn(noOfSteps,sketchPad);
        moveFoward(noOfSteps);
    }

    private void increaseColumnBy(int noOfSteps){
        int currentColumn = currentPosition.getColumn();
        currentPosition.setColumn(noOfSteps + currentColumn);
    }
    private void increaseRowBy(int noOfSteps){
        int currentRow = currentPosition.getRow();
        currentPosition.setRow(noOfSteps + currentRow);
    }

    public Directions getCurrentDirection() {
        return currentDirection;
    }

    public Posittion getCurrentPosition() {
        return currentPosition;
    }

    public void writeOn (int noOfSteps, SketchPad sketchPad){
        int [][] floor = sketchPad.getFloor();
        int currentRow = currentPosition.getRow();
        int currentColumn = currentPosition.getColumn();
        switch (currentDirection){
            case EAST -> {
                for (int i = currentColumn; i < currentColumn + noOfSteps; i++) {
                   floor[currentRow][i] = 1;
                }
            }
            case SOUTH -> {
            for (int i = currentRow ; i < currentRow + noOfSteps; i++){
                floor [i][currentColumn] = 1;
            }
            }
            case WEST -> {
                for(int i = currentColumn; i<currentColumn +noOfSteps;i++){
                    floor [currentRow][i] = 1;
                }
            }
            case NORTH -> {
                for (int i = currentRow; i< currentRow + noOfSteps; i++){
                    floor[i][currentColumn] = 1;
                }
            }




        }
    }
}
