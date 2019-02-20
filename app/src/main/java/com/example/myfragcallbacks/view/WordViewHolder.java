package com.example.myfragcallbacks.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.myfragcallbacks.FragmentInterface;
import com.example.myfragcallbacks.R;

public class WordViewHolder extends RecyclerView.ViewHolder {
    private TextView wordTextview;

    public WordViewHolder(@NonNull View itemView) {
        super(itemView);
        wordTextview = itemView.findViewById(R.id.word_textview);
    }

    public void onBind(final String word, final FragmentInterface fragmentInterface) {
        wordTextview.setText(word);
        wordTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentInterface.toNextFragment(word);
            }
        });
    }
}
