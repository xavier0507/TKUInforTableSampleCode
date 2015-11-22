package com.example.tkuinfortablesamplecode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// 1. 直接實作OnClickListener
public class MainActivity extends Activity implements View.OnClickListener {
	private EditText nameEdit;
	private EditText mobileEdit;
	private EditText mailEdit;
	private Button sendButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		this.nameEdit = (EditText) this.findViewById(R.id.edit_name);
		this.mobileEdit = (EditText) this.findViewById(R.id.edit_mobile);
		this.mailEdit = (EditText) this.findViewById(R.id.edit_email);
		this.sendButton = (Button) this.findViewById(R.id.btn_send);
		this.sendButton.setOnClickListener(this);

		// 2. 註冊內部OnClickListener物件
		// this.sendButton.setOnClickListener(this.sendButtonOnClickListener);

		// 3. 匿名物件
		// this.sendButton.setOnClickListener(new View.OnClickListener() {
		// @Override
		// public void onClick(View v) {
		//
		// }
		// });
	}

	// 1. 直接實作OnClickListener
	@Override
	public void onClick(View v) {
		String name = nameEdit.getText().toString().trim();
		String mobile = mobileEdit.getText().toString().trim();
		String mail = mailEdit.getText().toString().trim();

		Intent intent = new Intent(MainActivity.this, IntentResultActivity.class);
		intent.putExtra("Name", name);
		intent.putExtra("Mobile", mobile);
		intent.putExtra("Mail", mail);
		this.startActivity(intent);
	}

	// 2. 註冊內部OnClickListener物件
	// private View.OnClickListener sendButtonOnClickListener = new View.OnClickListener() {
	// @Override
	// public void onClick(View v) {
	//
	// }
	// };
}
