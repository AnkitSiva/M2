package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Ankit
 *  @version 1.1
 */
public class Person1 {
    /** Holds the persons real name */
    private String name;

      /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */

    public Person1(String pname) {
        name = pname;
    }

    /**
    * This method should take the string
    * input and return its characters rotated
    * 2 positions.
    * given "gtg123b" it should return
    * "g123bgt".
    *
    * @param input the string to be modified
    * @return the modified string
    */

    private String calc(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input was NULL");
        }

        //If input length is 0 or 1, then no rotation needs to be done
        if (input.length() <= 1) {
            return input;
        }

        String output = new String();

        for (int i = input.length() - 1; i > -1; i--) {
                output += input.charAt((i + 2) % input.length());
        }
        
        return output;
    }

    /**
    * Return a string rep of this object
    * that varies with an input string
    *
    * @param input the varying string
    * @return the string representing the 
    *         object
    */

    public String toString(String input) {
        return name + calc(input);
    }

}
