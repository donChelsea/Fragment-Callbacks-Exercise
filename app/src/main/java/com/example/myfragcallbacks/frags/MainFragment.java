package com.example.myfragcallbacks.frags;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfragcallbacks.FragmentInterface;
import com.example.myfragcallbacks.R;
import com.example.myfragcallbacks.controller.WordAdapter;

import static com.example.myfragcallbacks.MainActivity.wordList;


public class MainFragment extends Fragment {
    private FragmentInterface fragmentInterface;
    private RecyclerView recyclerView;

    public MainFragment() {
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentInterface) {
            fragmentInterface = (FragmentInterface) context;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new WordAdapter(wordList, fragmentInterface));
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
    }
}
