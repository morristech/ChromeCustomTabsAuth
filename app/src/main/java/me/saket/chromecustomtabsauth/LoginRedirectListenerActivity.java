package me.saket.chromecustomtabsauth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LoginRedirectListenerActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    startActivity(PostLoginActivity.intent(this)
        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    );
    finish();
    super.onCreate(savedInstanceState);
  }
}
