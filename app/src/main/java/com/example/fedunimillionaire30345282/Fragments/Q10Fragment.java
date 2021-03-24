package com.example.fedunimillionaire30345282.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fedunimillionaire30345282.Models.TestQuestion;
import com.example.fedunimillionaire30345282.R;

import java.util.ArrayList;

public class Q10Fragment extends Fragment implements View.OnClickListener {
    ArrayList<TestQuestion> questions = new ArrayList<TestQuestion>();
    private TextView questionT, A, B, C, D;
    private Button btnA, btnB, btnC, btnD;
    int savings;

    public Q10Fragment(ArrayList<TestQuestion> questions, int savings){
        this.questions = questions;
        this.savings = savings;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.q2_fragment, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        questionT = view.findViewById(R.id.question);
        A = view.findViewById(R.id.A);
        B = view.findViewById(R.id.B);
        C = view.findViewById(R.id.C);
        D = view.findViewById(R.id.D);

        view.findViewById(R.id.btnA).setOnClickListener(this);
        view.findViewById(R.id.btnB).setOnClickListener(this);
        view.findViewById(R.id.btnC).setOnClickListener(this);
        view.findViewById(R.id.btnD).setOnClickListener(this);

        TestQuestion question = questions.get(9);

        String q = question.getQuestion();
        String a = question.getChoices().get(0).getValue();
        String b = question.getChoices().get(1).getValue();
        String c = question.getChoices().get(2).getValue();
        String d = question.getChoices().get(3).getValue();

        int remaining = 750000;

        questionT.append(q+" \n\n Remaining amount: "+remaining);
        A.append("A. "+a);
        B.append("B. "+b);
        C.append("C. "+c);
        D.append("D. "+d);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnA:

            case R.id.btnC:

            case R.id.btnD:
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.question_fragment, new ResultsFragment(savings))
                        .commit();
                break;

            case R.id.btnB:
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.question_fragment, new Q11Fragment(questions, savings))
                        .commit();
                break;
        }

    }
}
