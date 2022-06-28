package turtleMovement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static turtleMovement.Directions.*;
//import static tutle.Direction.EAST;

class TurtleTest {
    private Turtle smallTurtle;
    private Posittion posittion;
    SketchPad sc;

    @BeforeEach
    void setUp() {
        smallTurtle = new Turtle();
        posittion = new Posittion(1,1);
        sc = new SketchPad(20,20);
    }
    @Test
    public void weCanCreateOurSmallTurtle(){
        assertNotNull(smallTurtle);
    }
    @Test
    public void penIsUpByDefaultTest(){
        assertTrue(smallTurtle.isPenUp());
    }

    private void assertTrue(boolean penUp) {
    }

    @Test
    public void turtleCanMovePenDown(){
        assertTrue(smallTurtle.isPenUp());
        smallTurtle.penDown();
        assertFalse(smallTurtle.isPenUp());
    }
    @Test
    public void turtleCanBeTurnBackUpTest(){
        assertTrue(smallTurtle.isPenUp());
        smallTurtle.penDown();
        assertFalse(smallTurtle.isPenUp());
        smallTurtle.penUp();
        assertTrue(smallTurtle.isPenUp());
    }
    @Test
    public void whenFacingEastTurtleCanTurnRightTest(){
        assertEquals(EAST, smallTurtle.getCurrentDirection());
        smallTurtle.turnRight();
        assertEquals(SOUTH, smallTurtle.getCurrentDirection());
    }

    @Test
    public void whenFacingSouthTurtleCanTurnRightTest(){
        assertEquals(EAST,smallTurtle.getCurrentDirection());
        smallTurtle.turnRight();
        smallTurtle.turnRight();
        assertEquals(WEST,smallTurtle.getCurrentDirection());

    }
    @Test
    public void whenFacingWestTurtleCanTurnRightTest(){
        assertEquals(EAST, smallTurtle.getCurrentDirection());
        smallTurtle.turnRight();
        smallTurtle.turnRight();
        smallTurtle.turnRight();
        assertEquals(NORTH, smallTurtle.getCurrentDirection());
    }
    @Test
    public void whenFacingNorthTurtleCanTurnRightTest(){
        assertEquals(EAST, smallTurtle.getCurrentDirection());
        smallTurtle.turnRight();
        smallTurtle.turnRight();
        smallTurtle.turnRight();
        smallTurtle.turnRight();
        assertEquals(EAST, smallTurtle.getCurrentDirection());
    }
    @Test
    public void whenFacingEastTurtleCanTurnLeftTest(){
        assertEquals(EAST, smallTurtle.getCurrentDirection());
        smallTurtle.turnLeft();
        assertEquals(NORTH, smallTurtle.getCurrentDirection());
    }

    @Test
    public void whenFacingNorthTurtleCanTurnLeftTest(){
        assertEquals(EAST,smallTurtle.getCurrentDirection());
        smallTurtle.turnLeft();
        smallTurtle.turnLeft();
        assertEquals(WEST,smallTurtle.getCurrentDirection());

    }
    @Test
    public void whenFacingWestTurtleCanTurnLeftTest(){
        assertEquals(EAST, smallTurtle.getCurrentDirection());
        smallTurtle.turnLeft();
        smallTurtle.turnLeft();
        smallTurtle.turnLeft();
        assertEquals(SOUTH, smallTurtle.getCurrentDirection());
    }
    @Test
    public void whenFacingSouthTurtleCanTurnLeftTest(){
        assertEquals(EAST, smallTurtle.getCurrentDirection());
        smallTurtle.turnLeft();
        smallTurtle.turnLeft();
        smallTurtle.turnLeft();
        smallTurtle.turnLeft();
        assertEquals(EAST, smallTurtle.getCurrentDirection());
    }
    @Test
    public  void turtleCanMoveForwardFacingEastTest(){
        assertEquals(EAST, smallTurtle.getCurrentDirection());
        smallTurtle.moveFoward(5);
        smallTurtle.moveFoward(5);
        assertEquals(new Posittion(0,10),smallTurtle.getCurrentPosition());

    }
    @Test
    public void turtleCanMoveForwardFacingSouthTest(){
        assertEquals(EAST,smallTurtle.getCurrentDirection());
        smallTurtle.turnRight();
        smallTurtle.moveFoward(5);
        smallTurtle.moveFoward(5);
        assertEquals(new Posittion(10,0),smallTurtle.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveForwardFacingWestTest(){
        assertEquals(EAST, smallTurtle.getCurrentDirection());
        smallTurtle.turnRight();
        smallTurtle.turnRight();
        smallTurtle.moveFoward(10);
        assertEquals(new Posittion(0,10), smallTurtle.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveForwardFacingNorthTest(){
        assertEquals(EAST, smallTurtle.getCurrentDirection());
        smallTurtle.turnLeft();
        smallTurtle.moveFoward(10);
        assertEquals(new Posittion(10,0), smallTurtle.getCurrentPosition());
    }
    @Test
    public void whenPenIsDownturtleCanWriteWhileMovingEastTest(){
        assertEquals(EAST, smallTurtle.getCurrentDirection());
        smallTurtle.penDown();




        smallTurtle.moveFoward(4,sc);
        assertEquals(new Posittion(0,4), smallTurtle.getCurrentPosition());
        int currentColumn = smallTurtle.getCurrentPosition().getColumn();
        int currentRow = smallTurtle.getCurrentPosition().getRow();
        int [][] floor = sc.getFloor();

        for (int i = currentColumn; i<currentColumn  ; i++){
            System.out.println(Arrays.deepToString(floor));
            assertEquals(1,floor[i][currentColumn]);
            System.out.println(Arrays.deepToString(floor));

        }
    }
    @Test
    public void whenPenIsDown_turtleCanWriteWhileMovingSouthTest(){
        assertEquals(EAST, smallTurtle.getCurrentDirection());
        smallTurtle.penDown();
        smallTurtle.moveFoward(4,sc);
        smallTurtle.turnRight();
        smallTurtle.moveFoward(4,sc);
        smallTurtle.turnLeft();
        smallTurtle.moveFoward(4,sc);
      //  assertEquals(SOUTH, smallTurtle.getCurrentDirection());
//
//        smallTurtle.moveFoward(8,sc);
       // assertEquals(new Posittion(0,8),smallTurtle.getCurrentPosition());
        int currentColumn = smallTurtle.getCurrentPosition().getColumn();
        int currentRow = smallTurtle.getCurrentPosition().getRow();
        int [][] floor = sc.getFloor();
        //System.out.println(Arrays.deepToString(floor));
        sc.displaySketchPad();
//        for (int i =currentColumn ; i < currentColumn ; i++){
//            assertEquals(1,floor[currentRow][i]);
//        }


    }

}