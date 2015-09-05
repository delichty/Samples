package net.ourpts.json.gson;

import net.ourpts.json.Dependent;

import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;

/**
 * A simple Person class used to demonstrate JSON. This class only contains a no-arguments
 * constructor, and getter methods for the class's properties.
 *
 * Properties:
 * <ul>
 *  <li><code>String name</code> - the person's name
 *  <li><code>int age</code> - the person's age
 *  <li><code>String[] aliases</code> - an array of the person's aliases
 *  <li><code>JsonObject[] object</code> - an array of Dependent objects
 * </ul>
 *
 * @see net.ourpts.json.Dependent
 */
public class Person {
    private String name;
    private int age;
    private String[] aliases;

    @SerializedName("dependents")
    private JsonObject[] object;

    // No-Args Constructor
    Person() {
        name = "";
        age = 0;
        aliases = null;
        object = null;
    }

    // Getters
    protected String getName(){ return name; }
    protected int getAge(){ return age; }
    protected String[] getAliases(){ return aliases; }
    protected JsonObject[] getDependents(){ return object; }

}
// End: Person.java
