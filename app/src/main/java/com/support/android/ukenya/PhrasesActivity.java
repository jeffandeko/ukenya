package com.support.android.ukenya;

/**
 * Created by Nyeri Baptist on 2/24/2018.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Luo->   Misawa,", "Hello", "Kikuyu->  Ũhoro"));
        words.add(new Word("Luo->   Idhi nade?,", "How are you?", "Kikuyu->  Ũhoro waku"));
        words.add(new Word("Luo->   Ngimani Dhi nade?,", "How are you doing?", "Kikuyu-> Ûrĩ mwega?"));
        words.add(new Word("Luo->   Ang'wen, ", "four", "Kikuyu->   Inya"));
        words.add(new Word("Luo->   Konya,  ", "Help me", "Kikuyu->   Ndeithia"));
        words.add(new Word("Luo->   Abiro goni simu, ", "I will phone you", "Kikuyu->  Nĩngũkũhũrĩra thimû"));
        words.add(new Word("Luo->   Aheri,", "I love you", "Kikuyu->  Nĩngwendete"));
        words.add(new Word("Luo->   Adenyo, ", "I am hungry", "Kikuyu->  Ndĩ mũhũtu"));
        words.add(new Word("Luo->   Oriti dhi gi gweth,    ", "Bye, be blessed", "Kikuyu-> Tigwo na wega."));
        words.add(new Word("Luo->   Isomo Kanye,  ", "You study at", "Kikuyu-> Ũthomaga"));

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