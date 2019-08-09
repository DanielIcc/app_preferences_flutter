package com.example.app_preferences_flutter;

import android.app.Activity;
import android.content.Intent;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

public class AppPreferencesFlutterPlugin implements MethodCallHandler {

  private final Activity activity;

  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "app_preferences_flutter");
    final AppPreferencesFlutterPlugin plugin = new AppPreferencesFlutterPlugin(registrar.activity());
    channel.setMethodCallHandler(plugin);
  }

  public AppPreferencesFlutterPlugin(Activity activity) {
    this.activity = activity;
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("openPreferences")) {
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
