package com.example.fedunimillionaire30345282.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fedunimillionaire30345282.Models.TestQuestion;
import com.example.fedunimillionaire30345282.R;

import java.util.ArrayList;

public class Q6Save extends Fragment implements View.OnClickListener{
    ArrayList<TestQuestion> questions;
    int savings;

    public Q6Save(ArrayList<TestQuestion> questions, int savings){
        this.questions = questions;
        this.savings = savings;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.save6_fragment, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.save).setOnClickListener(this);
        view.findViewById(R.id.skip).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.save:
                savings = 32000;
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.question_fragment, new Q7Fragment(questions, savings))
                        .commit();
                break;
            case R.id.skip:
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.question_fragment, new Q7Fragment(questions, savings))
                        .commit();
                break;
        }

    }
}
