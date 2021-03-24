package com.example.fedunimillionaire30345282.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fedunimillionaire30345282.R;

public class ResultsFragment extends Fragment {
    int savings;
    private TextView results;

    public ResultsFragment(int savings){
        this.savings = savings;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.result_fragment, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        results = view.findViewById(R.id.results);

        results.append("$"+Integer.toString(savings));

    }
}
