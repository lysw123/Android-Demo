package name.ly;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		TextView tv = (TextView) findViewById(R.id.myTextView);
		tv.setText("this is my TextView");

		Button bt = (Button) findViewById(R.id.myButton);
		bt.setText("this is my Button");
	}
}