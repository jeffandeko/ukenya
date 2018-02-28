package com.support.android.ukenya;

/**
 * Created by Nyeri Baptist on 2/24/2018.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Luo->   Achiel,", "one", "Kikuyu->   imwe", R.drawable.one));
        words.add(new Word("Luo->   Ariyo,", "two", "Kikuyu->   ĩgiri", R.drawable.two));
        words.add(new Word("Luo-> Adek,", "three", "Kikuyu->   ĩthatu ", R.drawable.three));
        words.add(new Word("Luo-> Ang'wen, ", "four", "Kikuyu->   ĩnya ", R.drawable.four));
        words.add(new Word("Luo-> Abich,  ", "five", "Kikuyu->   ĩthano ", R.drawable.five));
        words.add(new Word("Luo-> Auchie, ", "six", "Kikuyu->  ĩthathaĩu", R.drawable.six));
        words.add(new Word("Luo-> Abiriyo,", "seven", "Kikuyu-> Mũgwanja", R.drawable.seven));
        words.add(new Word("Luo-> Aboro, ", "eight", "Kikuyu-> inyanya", R.drawable.eight));
        words.add(new Word("Luo-> Ochiko,    ", "nine", "Kikuyu->  kenda", R.drawable.nine));
        words.add(new Word("Luo-> Apar,  ", "ten", "Kikuyu-> ikumi", R.drawable.ten));
        words.add(new Word("Luo-> Apar gi Achiel, ", "eleven", "Kikuyu-> Ikũmi na ĩmwe", R.drawable.eight));
        words.add(new Word("Luo-> Apar gi Ariyo,    ", "twelve ", "Kikuyu->  Ikũmi na igĩri", R.drawable.nine));
        words.add(new Word("Luo-> Apar gi Adek,  ", "thirteen ", " Kikuyu-> Ikũmi na ithatũ", R.drawable.ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.basics_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}