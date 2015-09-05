package net.ourpts.json.gson;

import net.ourpts.json.gson.Person;
import net.ourpts.json.Dependent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;

public class GsonSample {

    public static void main( String[] args ){
        Gson gson = new Gson();

        try {
            // Grab our JSON content
            System.out.println( "Reading from: example.json" );
            String json = new String( Files.readAllBytes( Paths.get("example.json") ) );
            System.out.println( "JSON: " + json );

            // From String into Object
            System.out.println( "String => Object" );
            Person p1 = gson.fromJson( json, Person.class );
            System.out.println( "Person.name: " + p1.getName() );
            System.out.println( "Person.age: " + p1.getAge() );
            System.out.print( "Person.aliases:" );
            for( String a1 : p1.getAliases() ) {
                System.out.print( " " + a1 );
            }
            System.out.println();
            System.out.println( "Person.dependents: ");
            for( JsonObject d1 : p1.getDependents() ){
                System.out.println( "\t" + d1.toString() );
            }
            System.out.println();

            // From FileReader into Object
            System.out.println( "FileReader => Object");
            Person o2 = gson.fromJson( new FileReader("example.json"), Person.class );
            System.out.println( "Person.name: " + o2.getName() );
            System.out.println( "Person.age: " + o2.getAge() );
            System.out.print( "Person.aliases:" );
            for ( String a2 : o2.getAliases() ) {
                System.out.print( " " + a2 );
            }
            System.out.println();
            System.out.println( "Person.dependents: " );
            for( JsonObject d2 : p1.getDependents() ){
                System.out.println( "\t" + d2.toString() );
            }
            System.out.println();

        } catch( Exception e ){
            // Something went wrong
            System.out.print( "Exception: " );
            e.printStackTrace();
        }

    }
}
