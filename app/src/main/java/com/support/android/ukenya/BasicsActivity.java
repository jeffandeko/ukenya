package com.support.android.ukenya;

/**
 * Created by Nyeri Baptist on 2/24/2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class BasicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);
        // Find the View that shows the numbers category
        TextView numbers = findViewById(R.id.numbers);

// Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(BasicsActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });
        TextView family = findViewById(R.id.family);
// Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(BasicsActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        TextView colors = findViewById(R.id.colors);
        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(BasicsActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });
        TextView phrases = findViewById(R.id.phrases);
        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(BasicsActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });


    }


}
