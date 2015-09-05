package net.ourpts.json.jackson;

import net.ourpts.json.Dependent;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * A simple Person class used to demonstrate JSON. This class only contains a no-arguments
 * constructor, and getter methods for the class's properties.
 *
 * Properties:
 * <ul>
 *  <li><code>String name</code> - the person's name
 *  <li><code>int age</code> - the person's age
 *  <li><code>String[] aliases</code> - an array of the person's aliases
 *  <li><code>ObjectNode[] object</code> - an array of Dependent objects
 * </ul>
 *
 * @see net.ourpts.json.Dependent
 */
public class Person {
    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    @JsonProperty("aliases")
    private String[] aliases;

    @JsonProperty("dependents")
    private ObjectNode[] object;

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
    protected ObjectNode[] getDependents(){ return object; }

}
// End: Person.java
