package com.example.myfragcallbacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myfragcallbacks.frags.DisplayFragment;
import com.example.myfragcallbacks.frags.MainFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements FragmentInterface{
    public static List<String> wordList = new ArrayList<>(Arrays.asList("delicious", "luscious", "sweetened", "syrupy",
            "candied", "candy-coated", "cloying", "honeyed", "like candy", "like honey", "nectarous", "sacchariferous",
            "saccharine", "sugar-coated", "sugared", "toothsome"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = MainFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container, mainFragment)
                .addToBackStack("first")
                .commit();
    }


    @Override
    public void toNextFragment(String word) {
        DisplayFragment displayFragment = DisplayFragment.newInstance(word);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container, displayFragment)
                .addToBackStack("display")
                .commit();
    }
}
