package yuku.ambilwarna.demo;

import yuku.ambilwarna.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class AmbilWarnaDemoActivity extends Activity {
	int color = 0xffffff00;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				AmbilWarnaDialog dialog = new AmbilWarnaDialog(AmbilWarnaDemoActivity.this, color, new AmbilWarnaDialog.OnAmbilWarnaListener() {
					@Override
					public void onOk(AmbilWarnaDialog dialog, int color) {
						Toast.makeText(getApplicationContext(), "ok color=0x" + Integer.toHexString(color), Toast.LENGTH_SHORT).show();
						AmbilWarnaDemoActivity.this.color = color;
					}

					@Override
					public void onCancel(AmbilWarnaDialog dialog) {
						Toast.makeText(getApplicationContext(), "cancel", Toast.LENGTH_SHORT).show();
					}
				});
				dialog.show();
			}
		});
	}
}