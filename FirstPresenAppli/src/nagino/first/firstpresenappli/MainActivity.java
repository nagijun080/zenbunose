package nagino.first.firstpresenappli;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.text.Layout.Alignment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

	Integer mark = 0;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
    }


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void answerClick(View v) {
    	Button button = (Button) v;
    	TextView view = (TextView) findViewById(R.id.question);
    	
    	switch (button.getId()) {
    	case R.id.buttonA:
    		setContentView(R.layout.time_layout);
    		break;
    	case R.id.buttonB:
    		setContentView(R.layout.memopad);
    	}
    	
    }

    
}
