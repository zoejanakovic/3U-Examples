
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaz9178
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating city
        City kw = new City();
        //create robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        
        //build a wall
        new Wall(kw, 1, 5, Direction.EAST);
        new Thing(kw, 0, 1);
        
        //an infinite loop asking the robot if the front is clear
        while(karel.frontIsClear()){
            //move and turn left
            karel.move();
            //karel.turnLeft();
            
            //if there is something to pick up
            if(karel.canPickThing()){
                //pick up everything
                karel.pickThing();
                break;
            }
            //did karel hit a wall
            if(!karel.frontIsClear()){
                karel.turnLeft();
                
                
            }
        }
        karel.turnLeft();
        
        karel.canPickThing();
        
        
    }
}
