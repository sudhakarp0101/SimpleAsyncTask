package com.example.user.simpleasynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView1);
    }
    public void startTask (View view) {
// Put a message in the text view
        mTextView.setText("Napping... ");
// Start the AsyncTask.
// The AsyncTask has a callback that will update the text view.
        new SimpleAsyncTask(mTextView).execute();
    }
}
