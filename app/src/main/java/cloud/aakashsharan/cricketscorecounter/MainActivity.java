package cloud.aakashsharan.cricketscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int australiaScore = 0;
    int indiaScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        Displays Australia's Score.
     */

    public void displayAustraliaScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.aussie_score);
        scoreView.setText(String.valueOf(score));

    }

    /*
        Displays India's Score.
     */
    public void displayIndiaScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.india_score);
        scoreView.setText(String.valueOf(score));

    }

    /*
        Add 1 to the score.
     */
    public void display1Aus(View v) {
        australiaScore = australiaScore + 1;
        displayAustraliaScore(australiaScore);
    }

    /*
    Add 2 to the score.
 */
    public void display2Aus(View v) {
        australiaScore = australiaScore + 2;
        displayAustraliaScore(australiaScore);
    }

    /*
    Add 4 to the score.
 */
    public void display4Aus(View v) {
        australiaScore = australiaScore + 4;
        displayAustraliaScore(australiaScore);
    }

    /*
    Add 6 to the score.
 */
    public void display6Aus(View v) {
        australiaScore = australiaScore + 6;
        displayAustraliaScore(australiaScore);
    }

    /*
    Add 1 to the score.
 */
    public void display1Ind(View v) {
        indiaScore = indiaScore + 1;
        displayIndiaScore(indiaScore);
    }

    /*
    Add 2 to the score.
 */
    public void display2Ind(View v) {
        indiaScore = indiaScore + 2;
        displayIndiaScore(indiaScore);
    }

    /*
    Add 4 to the score.
 */
    public void display4Ind(View v) {
        indiaScore = indiaScore + 4;
        displayIndiaScore(indiaScore);
    }

    /*
    Add 6 to the score.
 */
    public void display6Ind(View v) {
        indiaScore = indiaScore + 6;
        displayIndiaScore(indiaScore);
    }

    /*
        Reset both teams scores.
     */

    public void resetScores(View view) {
        australiaScore = 0;
        indiaScore = 0;
        displayAustraliaScore(australiaScore);
        displayIndiaScore(indiaScore);
    }
}
