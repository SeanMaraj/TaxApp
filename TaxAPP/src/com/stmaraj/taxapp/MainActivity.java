package com.stmaraj.taxapp;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void calculateTax(View view)
	{
		EditText txtAmount = (EditText)findViewById(R.id.txtAmount);
		TextView txtResult = (TextView)findViewById(R.id.txtResult);
		
		DecimalFormat df = new DecimalFormat("#.##");
		 
		double amount = Double.parseDouble(txtAmount.getText().toString());
		
		double afterTaxDouble = amount*1.13d;
		afterTaxDouble = Double.valueOf(df.format(afterTaxDouble));
		String afterTaxString = Double.toString(afterTaxDouble);
		
		txtResult.setText("Result is: $" + afterTaxString);
		
	}

}
