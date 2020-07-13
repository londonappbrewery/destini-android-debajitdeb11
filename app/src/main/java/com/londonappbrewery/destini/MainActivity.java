package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView textView;
    private Button topButton;
    private Button downButton;
    private int storyIndex = 1;

    List<Story> story = new ArrayList<Story>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topButton = findViewById(R.id.buttonTop);
        downButton = findViewById(R.id.buttonBottom);
        textView = findViewById(R.id.storyTextView);

        story.add(new Story(R.string.T1_Story, R.string.T1_Ans1, R.string.T2_Ans2));
        story.add(new Story(R.string.T2_Story, R.string.T1_Ans2, R.string.T2_Ans2));
        story.add(new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2));

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (storyIndex == 1) {
                    textView.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    downButton.setText(R.string.T3_Ans2);
                    storyIndex = 3;
                } else if (storyIndex == 3) {
                     textView.setText(R.string.T6_End);
                     topButton.setVisibility(View.GONE);
                     downButton.setVisibility(View.GONE);
                } else if (storyIndex == 2) {
                    textView.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    downButton.setText(R.string.T3_Ans2);
                    storyIndex = 3;
                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Down Button", "Button Pressed!");

                if (storyIndex == 1) {
                    textView.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    downButton.setText(R.string.T2_Ans2);
                    storyIndex = 2;
                } else if (storyIndex == 2) {
                    textView.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    downButton.setVisibility(View.GONE);
                } else if (storyIndex == 3) {
                    textView.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    downButton.setVisibility(View.GONE);
                }
            }
        });

    }


}
