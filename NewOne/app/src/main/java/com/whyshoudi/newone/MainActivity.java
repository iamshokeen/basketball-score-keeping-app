package com.whyshoudi.newone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int PointsA = 0;
    int PointsB = 0;
    String winner = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //RESET BUTTON
    public void reset(View view){
        PointsA = PointsB = 0;
        winner = " ";
        Adisplay(PointsA);

        Bdisplay(PointsB);

        windisplay(winner);

    }


    //FOR TEAM A

    public void AthreePointer(View view){
        PointsA = PointsA+3;
        Adisplay(PointsA);
    }
    public void AtwoPointer(View view){
        PointsA = PointsA+2;
        Adisplay(PointsA);
    }
    public void AfreeThrow(View view){
        PointsA = PointsA+1;
        Adisplay(PointsA);
    }


    private void Adisplay(int Points){
        TextView scoreCard = (TextView) findViewById(R.id.scoreCardA);
        scoreCard.setText("" + Points);
    }

    //FOR TEAM B

    public void BthreePointer(View view){
        PointsB = PointsB+3;
        Bdisplay(PointsB);
    }
    public void BtwoPointer(View view){
        PointsB = PointsB+2;
        Bdisplay(PointsB);
    }
    public void BfreeThrow(View view){
        PointsB = PointsB+1;
        Bdisplay(PointsB);
    }


    private void Bdisplay(int Points){
        TextView scoreCard = (TextView) findViewById(R.id.scoreCardB);
        scoreCard.setText("" + Points);
    }

    //TEAM WIN
    public void win(View view){
        if (PointsA>PointsB){
            winner = "TEAM A WON!!";
            windisplay(winner);
        }
        if (PointsB>PointsA){
            winner = "TEAM B WON!!";
            windisplay(winner);
        }
        if (PointsA==PointsB){
            winner = "DRAW MATCH";
            windisplay(winner);
        }
        if (PointsA == 0 && PointsB == 0){
            winner = " ";
            windisplay(winner);
        }

    }

    private void windisplay(String winTeam){
        TextView scoreCard = (TextView) findViewById(R.id.teamWin);
        scoreCard.setText(winTeam);
    }
}
