package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /*Reset score of the game back to 0*/
    public void resetGame(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /*Increase the score for Team A by 1 point*/
    public void AddOneForTeamA(View view) {
        int score = 1;
        scoreTeamA += score;
        displayForTeamA(scoreTeamA);
    }

    /*Increase the score for Team A by 2 points*/
    public void addTwoForTeamA(View view) {
        int score = 2;
        scoreTeamA += score;
        displayForTeamA(scoreTeamA);
    }

    /*Increase the score for Team A by 3 points*/
    public void addThreeForTeamA(View view) {
        int score = 3;
        scoreTeamA += score;
        displayForTeamA(scoreTeamA);
    }

    /*Increase the score for Team B by 1 point*/
    public void AddOneForTeamB(View view) {
        int score = 1;
        scoreTeamB += score;
        displayForTeamB(scoreTeamB);
    }

    /*Increase the score for Team B by 2 points*/
    public void addTwoForTeamB(View view) {
        int score = 2;
        scoreTeamB += score;
        displayForTeamB(scoreTeamB);
    }

    /*Increase the score for Team B by 3 points*/
    public void addThreeForTeamB(View view) {
        int score = 3;
        scoreTeamB += score;
        displayForTeamB(scoreTeamB);
    }


}
