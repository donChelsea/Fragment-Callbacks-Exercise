package com.example.myfragcallbacks.frags;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myfragcallbacks.R;

public class DisplayFragment extends Fragment {
    private static final String SWEET_SYNONYM = "sweet synonym";
    private TextView wordTextView;
    private String word;

    public DisplayFragment() {
    }

    public static DisplayFragment newInstance(String word) {
        DisplayFragment displayFragment = new DisplayFragment();
        Bundle args = new Bundle();
        args.putString(SWEET_SYNONYM, word);
        displayFragment.setArguments(args);
        return displayFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_display, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        wordTextView = view.findViewById(R.id.display_word_textview);

        Bundle args = getArguments();
        assert args != null;
        word = args.getString(SWEET_SYNONYM);

        wordTextView.setText(word);
    }
}
