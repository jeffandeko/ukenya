package com.support.android.ukenya;

/**
 * Created by Nyeri Baptist on 2/24/2018.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Luo->   Rakwar,", "Red", "Kikuyu->   Mũtune ", R.drawable.color_red));
        words.add(new Word("Luo->   Ralum,", "Green", "Kikuyu->   Nyeni", R.drawable.color_green));
        words.add(new Word("Luo->   Ratong,", "Yellow", "Kikuyu-> Ngoikoni", R.drawable.color_mustard_yellow));
        words.add(new Word("Luo->   Rateng, ", "Black", "Kikuyu->   Mũirũ ", R.drawable.color_black));
        words.add(new Word("Luo->   Rachar,  ", "White", "Kikuyu->   Mwerũ ", R.drawable.color_white));
        words.add(new Word("Luo->   Rabuor,  ", "Brown", "Kikuyu->   gîîtîri ", R.drawable.color_brown));
        words.add(new Word("Luo->   Raburu,  ", "Gray", "Kikuyu->   Kĩbuu, kĩmũhũ ", R.drawable.color_gray));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.basics_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
