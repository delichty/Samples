package net.ourpts.json.jackson;

import net.ourpts.json.jackson.Person;
import net.ourpts.json.Dependent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.core.JsonParser;

public class JacksonSample {

    public static void main( String[] args ){
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        //mapper.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        mapper.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        mapper.enable(JsonParser.Feature.ALLOW_COMMENTS);
        mapper.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);

        try {
            // Grab our JSON content into a String
            System.out.println( "Reading from: example.json" );
            String json = new String( Files.readAllBytes( Paths.get("example.json") ) );
            System.out.println( "JSON: " + json );

            // From String into Object
            System.out.println( "String => Object" );
            Person p1 = mapper.readValue( json, Person.class );

            System.out.println( "Person.name: " + p1.getName() );
            System.out.println( "Person.age: " + p1.getAge() );
            System.out.print( "Person.aliases:" );
            for( String a1 : p1.getAliases() ) {
                System.out.print( " " + a1 );
            }
            System.out.println();
            System.out.println( "Person.dependents (raw): ");
            for( ObjectNode d1 : p1.getDependents() ){
                System.out.println( "\t" + d1.toString() );
            }
            System.out.println();

            // From FileReader into Object
            System.out.println( "FileReader => Object");
            Person p2 = mapper.readValue( new File("example.json"), Person.class );
            System.out.println( "Person.name: " + p2.getName() );
            System.out.println( "Person.age: " + p2.getAge() );
            System.out.print( "Person.aliases:" );
            for ( String a2 : p2.getAliases() ) {
                System.out.print( " " + a2 );
            }
            System.out.println();
            System.out.println( "Person.dependents (raw): " );
            for( ObjectNode d2 : p2.getDependents() ){
                System.out.println( "\t" + d2.toString() );
            }
            System.out.println();

            // Real Dependents
            System.out.println( "Person.dependents (objects): " );
            for( ObjectNode o1 : p2.getDependents() ){
                Dependent d3 = mapper.convertValue( o1, Dependent.class );
                System.out.println( "\tDependent" );
                System.out.println( "\t\tname: " + d3.getName() );
                System.out.println( "\t\tage: " + d3.getAge() );
                System.out.println( "\t\trelation: " + d3.getRelation() );
            }
            System.out.println();

        } catch( Exception e ){
            // Something went wrong
            System.out.print( "Exception: " );
            e.printStackTrace();
        }
    }

}
// End: JacksonSample.java
