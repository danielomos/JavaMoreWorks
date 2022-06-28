package turtleMovement;


import java.util.Scanner;

public class Main {
 static   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SketchPad sketchPad = new SketchPad(21,21);
        Turtle smallturtle = new Turtle();
        int input;
        String prompt = """
                Welcome:-
                1 -> PenUp
                2 -> PenDown
                3 -> TurnRignt
                4 -> TurnLeft
                5 -> Move
                6 -> Display Board
                7 -> Exit
                """;
        System.out.println(prompt);
        do {

            input = scanner.nextInt();
            switch (input) {
                case 1 ->{
                    smallturtle.penUp();
                }
                case 2 ->{
                    smallturtle.penDown();
                }
                case 3 ->{
                    smallturtle.turnRight();
                }
                case 4 -> {
                    smallturtle.turnLeft();
                }
                case 5 -> {
                    System.out.println("For How Many Steps");
                    int steps = scanner.nextInt();
                   smallturtle.moveFoward(steps,sketchPad);
                }
                case 6 ->{
                    sketchPad.displaySketchPad();
                }
                default  ->{
                    input = 7;
                }

            }
        }while(input !=7);

    }
}
