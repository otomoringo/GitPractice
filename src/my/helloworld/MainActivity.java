package my.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	//machiko
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//yumaa
		super.onCreate(savedInstanceState);
		// exKAZUu
		setContentView(R.layout.activity_main);
//otomoringo
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
