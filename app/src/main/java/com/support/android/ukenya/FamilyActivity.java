package com.support.android.ukenya;

/**
 * Created by Nyeri Baptist on 2/24/2018.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Luo->  Wuonwa,", "Father", "Kikuyu-> BaBa", R.drawable.family_father1));
        words.add(new Word("Luo->  Minwa,", "Mother", "Kikuyu-> maitũ", R.drawable.family_mother));
        words.add(new Word("Luo->  Wuoda,", " My Son", "Kikuyu-> Muru Wakwa", R.drawable.family_son));
        words.add(new Word("Luo->  Nyara, ", "My Daughter", "Kikuyu-> Mwari Wakwa", R.drawable.family_daughter1));
        words.add(new Word("Luo->  Wuoda Maduang,  ", "My elder Son", "Kikuyu-> Muru wakwa Mukuru", R.drawable.family_brother1));
        words.add(new Word("Luo->  Nyara maduong, ", "My elder Daughter", "Kikuyu-> Mwari Wakwa Mukuru", R.drawable.family_daughter));
        words.add(new Word("Luo->  Kwarwa,", "Grandfather", "Kikuyu-> Guka", R.drawable.granfather));
        words.add(new Word("Luo->  Dani, ", "Grandmother", "Kikuyu-> cũcũ", R.drawable.grandmother));


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
