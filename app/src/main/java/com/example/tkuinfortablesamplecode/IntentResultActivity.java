package com.example.tkuinfortablesamplecode;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Xavier on 2015/11/23.
 */
public class IntentResultActivity extends Activity {
	private TextView nameText;
	private TextView mobileText;
	private TextView mailText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intent_sample);

		this.nameText = (TextView) this.findViewById(R.id.text_name_result);
		this.mobileText = (TextView) this.findViewById(R.id.text_mobile_result);
		this.mailText = (TextView) this.findViewById(R.id.text_mail_result);

		if (this.getIntent() != null) {
			String name = this.getIntent().getStringExtra("Name");
			String mobile = this.getIntent().getStringExtra("Mobile");
			String mail = this.getIntent().getStringExtra("Mail");

			nameText.setText(name);
			mobileText.setText(mobile);
			mailText.setText(mail);
		}
	}
}
