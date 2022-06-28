package turtleMovement;

public class SketchPad {
    private int [][] floor;
    public SketchPad(int length, int breadth){
        floor = new int[breadth][length];
    }

    public int[][] getFloor() {
        return floor;
    }
    public void displaySketchPad(){

        for (int[] ints : floor) {
            for (int j = 0; j < floor.length; j++) {
                if(ints[j] ==1){
                    System.out.print("*  ");
                }else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
