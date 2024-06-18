package koans.english;

public class AboutDecimalNumbers {
    /**
     * # Converting a measure of length
     * 
     * Define the method 'toCm' which has a parameter for a number of inches, and returns the conversion in centimeters.
     * 
     * ---------   TIPS  --------------
     * 
     * This time, the parameter cannot be an integer, because we want to be able to convert fractions of inches as well.
     * 
     * In Java, decimal numbers are represented with a type named 'double'. Ex:
     * 
     *     double pi = 3.14;
     * 
     * To convert from inches to centimeters, simply multiply by 2.54.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * toCm(2.0) should return 5.08
     * 
     */
    public static double toCm(int inches){
        return 0;
    }


    /**
     * # Converting the other way
     * 
     * Define the method 'toInches' which does the opposite of the previous one.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * toInches(5.08) should return 2.0
     * 
     */
    public static double toInches(){
        return 0;
    }


    /**
     * # Computing some geometry
     * 
     * Define the method 'rectangleArea' which computes the area of a rectangle, given the length of its sides.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * rectangleArea(3.6, 2.0) should return 7.2
     * 
     */
    public static double rectangleArea(double width, double height){
        return 0;
    }


     /**
     * # Computing how long a robot is traveling step 1
     * 
     * Define the method 'wheelCircumference' which computes the circumference of a robot wheel given the wheel's radius.
     * 
     * ---------   TIPS  --------------
     * 
     * Use the value 3.14 for pi.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * wheelCircumference(1) should return 6.28
     * 
     */
    public static double wheelCircumference(double radius){
        return 0;
    }


    /**
     * # Computing how long a robot is traveling step 2
     * 
     * Define the method 'wheelRotations' which computes the number of rotations of the wheel given the number of rotations of the motor and the gear ratio.
     * 
     * ---------   TIPS  --------------
     * 
     * The gear ratio is how many rotations the wheel is turning when the motor rotates once.
     * For example, if the motor has to turn 5 rotations to make the wheel rotate once, the ratio is 1/5 = 0.2.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * wheelRotations(2.0, 0.2) should return 0.4
     * 
     */
    public static double wheelRotations(double rotations, double ratio){
        return 0;
    }


    /**
     * # Computing how long a robot is traveling final step
     *
     * - The number of rotations of the motor.
     * - The gear ratio of the gearbox.
     * - The wheel radius.
     *
     * -------------------------------
     * 
     * Expected result:
     * 
     * toDistance(10.0, 0.2, 2.0) should return 25.12
     * 
     */
    public static double toDistance(double rotations, double ratio, double radius){
        return 0;
    }

     
}
