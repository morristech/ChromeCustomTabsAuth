package me.saket.chromecustomtabsauth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class PostLoginActivity extends AppCompatActivity {

  public static Intent intent(Context context) {
    return new Intent(context, PostLoginActivity.class);
  }

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_post_login);
  }
}
