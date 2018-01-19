package me.saket.chromecustomtabsauth;

import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.login).setOnClickListener(o -> {
      String url = "https://saket.me/?p=309&preview=1&_ppp=444496716e";
      CustomTabsIntent intent = new CustomTabsIntent.Builder().build();
      intent.launchUrl(MainActivity.this, Uri.parse(url));
    });
  }
}
