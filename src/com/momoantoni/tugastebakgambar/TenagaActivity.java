package com.momoantoni.tugastebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TenagaActivity extends Activity {

	EditText jawabanTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenaga);
        
        jawabanTxt = (EditText)findViewById(R.id.editText1);
		jawabanTxt.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
    }
    
    public void cekJawaban(View v){
		String  jawabanBenar = "TENAGA LISTRIK";
		String jawabanUser = jawabanTxt.getText().toString();
		if (jawabanUser.equals(jawabanBenar)){			
			Toast.makeText(getApplicationContext(), "Jawaban Tepat!", Toast.LENGTH_LONG).show();
			Intent i = new Intent(getApplicationContext(),EndActivity.class);
			startActivity(i);
		}
		else{
			Toast.makeText(getApplicationContext(), "Jawaban Masih Salah!", Toast.LENGTH_LONG).show();
		}
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tenaga, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
