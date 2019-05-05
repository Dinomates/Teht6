package com.example.teht6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PresidentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        Bundle bundle = ((Intent) intent).getExtras();
        if (bundle != null) {
            int choiceNum = bundle.getInt("msg");
            President presidentOfChoice = (President) PresidentSingleton.getInstance().getList().get(choiceNum);

            TextView name = (TextView) findViewById(R.id.name);
            TextView electYear = (TextView) findViewById(R.id.electY);
            TextView deElectYear = (TextView) findViewById(R.id.lastElectY);
            TextView intel = (TextView) findViewById(R.id.info);

            name.setText(presidentOfChoice.getName());
            electYear.setText(Integer.toString(presidentOfChoice.getElectionYear()));
            deElectYear.setText(Integer.toString(presidentOfChoice.getDeElectionYear()));
            intel.setText(presidentOfChoice.getIntel());
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
