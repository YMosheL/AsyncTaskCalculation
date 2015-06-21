package com.example.moshel.asynctaskcalculation;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
setUpGUI();
    }

    private void setUpGUI() {
        editText = (EditText)findViewById(R.id.editTextCalculate);
        textView = (TextView)findViewById(R.id.editTextCalculate);

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

    public void onClickButton(View view) {
       String input = editText.getText().toString();
        new AsyncCalculator(new LoadingCallbacks() {
            @Override
            public void before() {

            }

            @Override
            public void after() {

            }

        }).execute(input);
    }
    protected static class AsyncCalculator extends AsyncTask<String, Void, String> {
        private LoadingCallbacks myLoadingCallbacks;

        public AsyncCalculator(LoadingCallbacks callback){
            myLoadingCallbacks = callback;
        }




        @Override
        protected String doInBackground(String... params) {
            return null;
        }
    }
    public interface LoadingCallbacks{
        public void before();
        public void after();
    }
}
