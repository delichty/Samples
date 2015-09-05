package net.ourpts.json;

// No imports needed

/**
 * A simlpe Dependent class, used by the Person class. This class only contains a
 * no-arguments constructor, and getter methods for the class's properties.
 *
 * Properties:
 * <ul>
 *  <li><code>String name</code> - the dependent's name
 *  <li><code>int age</code> - the dependent's age
 *  <li><code>String relation</code> - the relationship between this dependent and the
 *  person containing it
 * </ul>
 *
 * @see net.ourpts.json.gson.Person
 */
public class Dependent {
    private String name;
    private int age;
    private String relation;

    // No-Args Constructor
    Dependent() {
        name = "";
        age = 0;
        relation = null;
    }

    // Getters
    protected String getName(){ return name; }
    protected int getAge(){ return age; }
    protected String getRelation(){ return relation; }
}
// End: Dependent.java