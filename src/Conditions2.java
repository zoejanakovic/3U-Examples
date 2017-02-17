
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author janaz9178
 */
public class Conditions2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kw = new City();

        //create a robot
        Robot karel = new Robot(kw, 4, 1, Direction.EAST);


        //create the path
        new Thing(kw, 4, 2);

        new Thing(kw, 4, 3);
        new Thing(kw, 4, 3);

        new Thing(kw, 3, 3);

        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 3);

        //turn on the thing labels
        kw.showThingCounts(true);

        //step onto the first part of the path
        karel.move();

        //loop
        while (true) {
            //if there are things
            //pick them all up
            while (karel.canPickThing()) {
                karel.pickThing();
            }
            //if holding 1 thing, move
            if (karel.countThingsInBackpack() == 1) {
                //drop things
                karel.putThing();
                //move
                karel.move();
                //if holding 2 things, turn left
            } else if (karel.countThingsInBackpack() == 2) {
                //drop things
                karel.putThing();
                karel.putThing();
                //move
                karel.turnLeft();
                karel.move();

                //if holding 3 things, turn right
            } else if (karel.countThingsInBackpack() == 3) {
                //drop things
                karel.putThing();
                karel.putThing();
                karel.putThing();
                //move
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            } else {
                //found 4 things
                break;

            }

        }




    }
}
