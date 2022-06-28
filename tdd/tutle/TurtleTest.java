package tutle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tutle.Direction.*;


class TurtleTest {
    private Turtle ijapa;

    private SketchPad sc;

    @BeforeEach
    public void setup() {
        ijapa = new Turtle();

        sc = new SketchPad(5,5);


    }

    @Test
    public void turtleCanBeCreatedTest() {

        assertNotNull(ijapa);
    }

    @Test
    public void penIsUpByDefaultTest() {
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest() {
        assertTrue(ijapa.isPenUp());
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void turtleCanBeTurnBackUpTest() {
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void whenFacingEast_turtleCanTurnRightTestTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        //assertEquals((Direction.SOUTH, ijapa.getCurrentDirection());
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void whenFacingSouth_turtleCanTurnRightTestTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void whenFacingWest_turtleCanTurnRightTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void whenFacingNorth_turtleCanTurnRightTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void whenFacingEast_turtleCanTurnLeftTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void whenFacingNorth_turtleCanTurnLeftTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void whenFacingWest_turtleCanTurnLeftTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

    }

    @Test
    public void whenFacingSouth_turtleCanTurnLeftTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());

    }

    @Test
    public void turnCanMoveForwardFacingEastTest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.moveFoward(5,sc);
        ijapa.moveFoward(5,sc);
        //   Position expectedPosition= new Position(0,5);

        assertEquals(new Position(0, 10), ijapa.getCurrentPosition());
    }
    @Test
    public void turnCanMoveForwardFacingSouthTest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        //assertEquals((Direction.SOUTH, ijapa.getCurrentDirection());

        ijapa.moveFoward(5,sc);
        ijapa.moveFoward(5,sc);

        assertEquals(new Position(10,0), ijapa.getCurrentPosition());
    }
    @Test
    public void turnCanMoveForwardFacingWestTest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.moveFoward(5,sc);
        ijapa.moveFoward(5,sc);
        assertEquals(new Position(0,10),ijapa.getCurrentPosition());
    }
    @Test
    public void turnCanMoveForwardFacingNorth(){
       ijapa.turnLeft();
        ijapa.moveFoward(5,sc);
        ijapa.moveFoward(5, sc);
       assertEquals(new Position(10,0),ijapa.getCurrentPosition());
    }
   @Test
    public void whenPenIsDown_turtleCanWriteWhileMovingEastTest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.penDown();
        int currentColumn = ijapa.getCurrentPosition().getColumn();
        int currentRow = ijapa.getCurrentPosition().getRow();
        SketchPad sc = new SketchPad(5,5);
        ijapa.moveFoward(5,sc);

        assertEquals(new Position(0,5), ijapa.getCurrentPosition());
        int[][] floor = sc.getFloor();
        for(int i = currentColumn; 1 < currentColumn + 5; i++){
           // assertEquals(1,floor.[currentColumn][i]);
        }
   }

//   @Test
//    public  void east(){
//        ijapa.penDown();
//        ijapa.moveFoward(5,sc);
//        assertEquals(new Position(0,5), ijapa.getCurrentPosition());
//        int currentColumn = ijapa.getCurrentPosition().getColumn();
//        int currentRow = ijapa.getCurrentPosition().getRow();
//
//        ijapa.turnRight();
//        ijapa.moveFoward(4,sc);
//        ijapa.penUp();
//        ijapa.turnRight();
//        ijapa.moveFoward(3,sc);
//        ijapa.turnRight();
//        ijapa.moveFoward(4,sc);
//        int [][]floor = sc.getFloor();
//        for (int i = currentRow; i < currentColumn + 3; i++){
//            assertEquals(1, floor[currentRow][i]);
//        }

//   }

}



