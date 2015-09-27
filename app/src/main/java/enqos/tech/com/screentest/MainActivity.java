package enqos.tech.com.screentest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    int color;
    String[] countries = {"India","USA","Canada","UK"};
    int[] values = {8,15,20,9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        TextView shareIcon  = (TextView) findViewById(R.id.shareIcon);
        shareIcon.setTypeface(font);
        View india = findViewById(R.id.india);
        color = getResources().getColor(R.color.blue);
        setColortoCountries(india, color);
        View canada = findViewById(R.id.canada);
        color = getResources().getColor(R.color.green);
        setColortoCountries(canada,color);
        View UK = findViewById(R.id.UK);
        color = getResources().getColor(R.color.purple);
        setColortoCountries(UK,color);
        View US = findViewById(R.id.US);
        int color = getResources().getColor(R.color.darkorange);
        setColortoCountries(US,color);


    }
    private void setColortoCountries(View v, int color){
        GradientDrawable bgShape = (GradientDrawable)v.getBackground();
        bgShape.setColor(color);

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
}
