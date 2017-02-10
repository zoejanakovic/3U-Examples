
import becker.robots.Direction;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaz9178
 */
public class Practicing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating city
        City toronto = new City();
        //creating robots
        Robot karel = new robot(toronto, 5,7,Direction.EAST);
        
    }
}
