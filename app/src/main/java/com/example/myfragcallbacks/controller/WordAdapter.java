package com.example.myfragcallbacks.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.myfragcallbacks.FragmentInterface;
import com.example.myfragcallbacks.R;
import com.example.myfragcallbacks.view.WordViewHolder;

import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordViewHolder> {
    private List<String> wordsList;
    private FragmentInterface fragmentInterface;

    public WordAdapter(List<String> wordsList, FragmentInterface fragmentInterface) {
        this.wordsList = wordsList;
        this.fragmentInterface = fragmentInterface;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new WordViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_list_view, viewGroup, false));
    }



    @Override
    public void onBindViewHolder(@NonNull WordViewHolder wordViewHolder, int i) {
        wordViewHolder.onBind(wordsList.get(i), fragmentInterface);
    }

    @Override
    public int getItemCount() {
        return wordsList.size();
    }
}
