package ie.dit.james.android_assignment_latest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;

/**
 * Created by James on 23/11/2015.
 */
public class NewContract extends Activity {

    // The EditText objects
/*
    EditText firstName;
    EditText lastName;
    EditText phoneNumber;
    EditText emailAddress;
    EditText homeAddress; */

    EditText MovieTitle;
    EditText Director;
    EditText Starring;
    EditText Genre;
    EditText Comments;

    DBTools dbTools = new DBTools(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {

        // Get saved data if there is any

        super.onCreate(savedInstanceState);

        // Designate that add_new_contact.xml is the interface used

        setContentView(R.layout.add_contract);

        // Initialize the EditText objects
        /*
        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        phoneNumber = (EditText) findViewById(R.id.phoneNumber);
        emailAddress = (EditText) findViewById(R.id.emailAddress);
        homeAddress = (EditText) findViewById(R.id.homeAddress);*/

        MovieTitle = (EditText) findViewById(R.id.MovieTitle);
        Director = (EditText) findViewById(R.id.Director);
        Starring = (EditText) findViewById(R.id.Starring);
        Genre = (EditText) findViewById(R.id.Genre);
        Comments = (EditText) findViewById(R.id.Comments);

    }
    public void addNewContact(View view) {

        // Will hold the HashMap of values

        HashMap<String, String> queryValuesMap =  new  HashMap<String, String>();

        // Get the values from the EditText boxes
        /*
        queryValuesMap.put("firstName", firstName.getText().toString());
        queryValuesMap.put("lastName", lastName.getText().toString());
        queryValuesMap.put("phoneNumber", phoneNumber.getText().toString());
        queryValuesMap.put("emailAddress", emailAddress.getText().toString());
        queryValuesMap.put("homeAddress", homeAddress.getText().toString());
        */

        queryValuesMap.put("MovieTitle", MovieTitle.getText().toString());
        queryValuesMap.put("Director", Director.getText().toString());
        queryValuesMap.put("Starring", Starring.getText().toString());
        queryValuesMap.put("Genre", Genre.getText().toString());
        queryValuesMap.put("Comments", Comments.getText().toString());

        // Call for the HashMap to be added to the database

        dbTools.insertContact(queryValuesMap);

        // Call for MainActivity to execute

        this.callMainActivity(view);
    }
    public void callMainActivity(View view) {
        Intent theIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(theIntent);
    }
}
