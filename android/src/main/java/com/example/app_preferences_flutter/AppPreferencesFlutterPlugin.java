package com.example.app_preferences_flutter;

import android.app.Activity;
import android.content.Intent;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;
import io.flutter.plugin.common.PluginRegistry.ActivityResultListener;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry;

/** AppPreferencesFlutterPlugin */
public class AppPreferencesFlutterPlugin implements MethodCallHandler {
  /** Plugin registration. */

  private final Activity activity;
  // MethodChannel methodChannel;

  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "app_preferences_flutter");
    // channel.setMethodCallHandler(new AppPreferencesFlutterPlugin());
    final AppPreferencesFlutterPlugin plugin = new AppPreferencesFlutterPlugin(registrar.activity());
    channel.setMethodCallHandler(plugin);
  }

  public AppPreferencesFlutterPlugin(Activity activity) {
    this.activity = activity;
    // this.methodChannel = methodChannel;
    // this.methodChannel.setMethodCallHandler(this);
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("getPlatformVersion")) {
      result.success("Android " + android.os.Build.VERSION.RELEASE);
    } else if (call.method.equals("openPreferences")) {
      showPreferences(activity);

    } else {
      result.notImplemented();
    }
  }

  private void showPreferences(Activity activity) {
    Intent intent = new Intent(activity, PreferencesActivity.class);
    activity.startActivityForResult(intent, 100);
  }

}
