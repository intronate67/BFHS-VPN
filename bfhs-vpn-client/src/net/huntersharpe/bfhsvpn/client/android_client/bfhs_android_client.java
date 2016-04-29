package net.huntersharpe.bfhsvpn.client.android_client;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class bfhs_android_client extends Activity {

    private TextView text = null;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        LinearLayout lv = new LinearLayout(this);
        text = new TextView(this);
        text.setText("BFHS-VPN");
        setContentView(lv);
    }
}
