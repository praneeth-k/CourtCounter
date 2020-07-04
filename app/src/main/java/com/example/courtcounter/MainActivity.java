package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0, teamBScore = 0;
    TextView teamAScoreTextView, teamBScoreTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAScoreTextView = findViewById(R.id.teamAScore);
        teamBScoreTextView = findViewById(R.id.teamBScore);
    }

    public void add1Point(View view)
    {
        if(view.getId() == R.id.teamAFreeThrow)
        {
            teamAScore++;
            teamAScoreTextView.setText(String.format(Locale.getDefault(),"%d",teamAScore));
        }
        else if(view.getId() == R.id.teamBFreeThrow)
        {
            teamBScore++;
            teamBScoreTextView.setText(String.format(Locale.getDefault(),"%d",teamBScore));
        }
    }

    public void add2Points(View view)
    {
        if(view.getId() == R.id.teamAAdd2Points)
        {
            teamAScore+=2;
            teamAScoreTextView.setText(String.format(Locale.getDefault(),"%d",teamAScore));
        }
        else if(view.getId() == R.id.teamBAdd2Points)
        {
            teamBScore+=2;
            teamBScoreTextView.setText(String.format(Locale.getDefault(),"%d",teamBScore));
        }
    }

    public void add3Points(View view)
    {
        if(view.getId() == R.id.teamAAdd3Points)
        {
            teamAScore+=3;
            teamAScoreTextView.setText(String.format(Locale.getDefault(),"%d",teamAScore));
        }
        else if(view.getId() == R.id.teamBAdd3Points)
        {
            teamBScore+=3;
            teamBScoreTextView.setText(String.format(Locale.getDefault(),"%d",teamBScore));
        }
    }

    public void reset(View view)
    {
        teamAScore = 0;
        teamBScore = 0;
        teamAScoreTextView.setText(String.format(Locale.getDefault(),"%d",teamAScore));
        teamBScoreTextView.setText(String.format(Locale.getDefault(),"%d",teamBScore));
    }
}