package com.example.flutter_samples;

//import io.flutter.embedding.android.FlutterActivity;
//
//public class MainActivity extends FlutterActivity {
//  // You can keep this empty or add custom code
//}

import android.os.Bundle;
import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Optional: Add custom initialization code here if needed
  }

  @Override
  public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
    // Automatically registers all plugins
    GeneratedPluginRegistrant.registerWith(flutterEngine);

    // Optional: Add custom plugin registration or logic here
  }
}

//import android.os.Bundle;
////import io.flutter.app.FlutterActivity;
//import io.flutter.embedding.android.FlutterActivity;
//import io.flutter.plugins.GeneratedPluginRegistrant;
//
//import android.view.ViewTreeObserver;
//import android.view.WindowManager;
//
//public class MainActivity extends FlutterActivity {
//  @Override
//  protected void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    //make transparent status bar
//    getWindow().setStatusBarColor(0x00000000);
//    GeneratedPluginRegistrant.registerWith(this);
//    //Remove full screen flag after load
//    ViewTreeObserver vto = getFlutterView().getViewTreeObserver();
//    vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//      @Override
//      public void onGlobalLayout() {
//        getFlutterView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
//        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
//      }
//    });
//  }
//}
