package com.reach.bfreachsdksample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bfreachsdksample.R;
import com.reach.player.ReachCategoryActivity;

public class MainActivity extends Activity implements OnClickListener {

	private TextView cool_video;

	private EditText embeded_id;

	private TextView resetId;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setupView();
	}

	private void setupView() {
		cool_video = (TextView) findViewById(R.id.reach_video);
		embeded_id = (EditText) findViewById(R.id.embedId);
		embeded_id.setText(getResources().getString(R.string.embeded_id));
		resetId = (TextView) findViewById(R.id.resetId);
		resetId.setOnClickListener(this);
		cool_video.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.reach_video:
			String embeded = embeded_id.getText().toString();
			if (embeded != null && !embeded.isEmpty()
					&& !embeded.trim().equals("")) {
				Intent myIntent = new Intent(this, ReachCategoryActivity.class);
				myIntent.putExtra("embeded", embeded);
				startActivity(myIntent);
			} else {
				Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
			}
			break;
		case R.id.resetId:
			resetEmbededId();
			break;
		default:
			break;
		}
	}

	private void resetEmbededId() {
		embeded_id.setText(getResources().getString(R.string.embeded_id));
	}
}
