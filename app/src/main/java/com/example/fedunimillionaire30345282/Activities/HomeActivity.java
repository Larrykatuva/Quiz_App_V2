package com.example.fedunimillionaire30345282.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fedunimillionaire30345282.Fragments.Q1Fragment;
import com.example.fedunimillionaire30345282.Models.Choices;
import com.example.fedunimillionaire30345282.Models.TestQuestion;
import com.example.fedunimillionaire30345282.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    public ArrayList<TestQuestion> questions = new ArrayList<TestQuestion>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TestQuestion q1 = new TestQuestion();
        q1.setQuestion("In The Uk, the abbreviation NHS stands for National what Service");
        ArrayList<Choices> q1Choices = new ArrayList<Choices>();
        q1Choices.add(new Choices("A", "Humanity"));
        q1Choices.add(new Choices("B", "Health"));
        q1Choices.add(new Choices("C", "Honour"));
        q1Choices.add(new Choices("D", "Household"));
        q1.setChoices(q1Choices);
        questions.add(q1);

        TestQuestion q2 = new TestQuestion();
        q2.setQuestion("200-Which Disney character famously leaves a glass slipper at a royal ball?");
        ArrayList<Choices> q2Choices = new ArrayList<Choices>();
        q2Choices.add(new Choices("A", "Pocahontas"));
        q2Choices.add(new Choices("B", "Sleeping Beauty"));
        q2Choices.add(new Choices("C", "Cinderella"));
        q2Choices.add(new Choices("D", "Elsa"));
        q2.setChoices(q2Choices);
        questions.add(q2);

        TestQuestion q3 = new TestQuestion();
        q3.setQuestion("1,000 - The hammar and sickle is one of the most recognisable symbols of which political ideology?");
        ArrayList<Choices> q3Choices = new ArrayList<Choices>();
        q3Choices.add(new Choices("A", "Republican"));
        q3Choices.add(new Choices("B", "Communism"));
        q3Choices.add(new Choices("C", "Conservation"));
        q3Choices.add(new Choices("D", "Liberation"));
        q3.setChoices(q3Choices);
        questions.add(q3);

        TestQuestion q4 = new TestQuestion();
        q4.setQuestion("300 - What name is given to the revolving belt machinery in an airport that delivers checked laggage from the plane to babbage reclaim?");
        ArrayList<Choices> q4Choices = new ArrayList<Choices>();
        q4Choices.add(new Choices("A", "Hanger"));
        q4Choices.add(new Choices("B", "Terminal"));
        q4Choices.add(new Choices("C", "Concourse"));
        q4Choices.add(new Choices("D", "Carousel"));
        q4.setChoices(q4Choices);
        questions.add(q4);

        TestQuestion q5 = new TestQuestion();
        q5.setQuestion("500 - Which of these brand are chiefly associated with the manufacture of household locks?");
        ArrayList<Choices> q5Choices = new ArrayList<Choices>();
        q5Choices.add(new Choices("A", "Philips"));
        q5Choices.add(new Choices("B", "Flymo"));
        q5Choices.add(new Choices("C", "Chubb"));
        q5Choices.add(new Choices("D", "Ronseal"));
        q5.setChoices(q5Choices);
        questions.add(q5);

        TestQuestion q6 = new TestQuestion();
        q6.setQuestion("2000, - Which toys have been marketed with the phrase `robots in disguise`?");
        ArrayList<Choices> q6Choices = new ArrayList<Choices>();
        q6Choices.add(new Choices("A", "Bratz Dolls"));
        q6Choices.add(new Choices("B", "Sylvanian Families"));
        q6Choices.add(new Choices("C", "Hatchimals"));
        q6Choices.add(new Choices("D", "Transformers"));
        q6.setChoices(q6Choices);
        questions.add(q6);

        TestQuestion q7 = new TestQuestion();
        q7.setQuestion("8,000, - Obstetrics is a branch of medicine particularly concerned with what?");
        ArrayList<Choices> q7Choices = new ArrayList<Choices>();
        q7Choices.add(new Choices("A", "Childbirth"));
        q7Choices.add(new Choices("B", "Broken bones"));
        q7Choices.add(new Choices("C", "Heart conditions"));
        q7Choices.add(new Choices("D", "Old age"));
        q7.setChoices(q7Choices);
        questions.add(q7);

        TestQuestion q8 = new TestQuestion();
        q8.setQuestion("16,000, - in doctor who, what was the signature look of four doctors as portrayed by tom Baker?");
        ArrayList<Choices> q8Choices = new ArrayList<Choices>();
        q8Choices.add(new Choices("A", "Bow-tie, braces and tweed jacket"));
        q8Choices.add(new Choices("B", "Wide-brimmed hat and etra long scarf"));
        q8Choices.add(new Choices("C", "Pinstripe Suite and trainers"));
        q8Choices.add(new Choices("D", "Cape, velvet jacket and frilly shirt"));
        q8.setChoices(q8Choices);
        questions.add(q8);

        TestQuestion q9 = new TestQuestion();
        q9.setQuestion("4,000, - What does the word loquacious mean?");
        ArrayList<Choices> q9Choices = new ArrayList<Choices>();
        q9Choices.add(new Choices("A", "Angry"));
        q9Choices.add(new Choices("B", "Chatty"));
        q9Choices.add(new Choices("C", "Beautiful"));
        q9Choices.add(new Choices("D", "Shy"));
        q9.setChoices(q9Choices);
        questions.add(q9);

        TestQuestion q10 = new TestQuestion();
        q10.setQuestion("32,000, - Which of these religious observances lasts for the shortest period of time during the calender year?");
        ArrayList<Choices> q10Choices = new ArrayList<Choices>();
        q10Choices.add(new Choices("A", "Ramadan"));
        q10Choices.add(new Choices("B", "Diwali"));
        q10Choices.add(new Choices("C", "Lent"));
        q10Choices.add(new Choices("D", "Hanukkah"));
        q10.setChoices(q10Choices);
        questions.add(q10);

        TestQuestion q11 = new TestQuestion();
        q11.setQuestion("64,000, - At the closest point, which island group is only 50 miles south-east of the coast of Florida?");
        ArrayList<Choices> q11Choices = new ArrayList<Choices>();
        q11Choices.add(new Choices("A", "Bahamas"));
        q11Choices.add(new Choices("B", "Us Virgins Islands"));
        q11Choices.add(new Choices("C", "Turks and Caicos Islands"));
        q11Choices.add(new Choices("D", "Bermuda"));
        q11.setChoices(q11Choices);
        questions.add(q11);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.question_fragment, new Q1Fragment(questions))
                .commit();



    }
}