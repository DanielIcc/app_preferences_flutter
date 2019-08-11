package com.danielisho.app_preferences_flutter

import android.app.Activity
import android.content.Intent


import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.PluginRegistry
import io.flutter.plugin.common.PluginRegistry.Registrar

class AppPreferencesFlutterPlugin(val activity: Activity): MethodCallHandler {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar): Unit {
      val channel = MethodChannel(registrar.messenger(), "app_preferences_flutter")
        if (registrar.activity() != null) {
            val plugin = AppPreferencesFlutterPlugin(registrar.activity())
            channel.setMethodCallHandler(plugin)
            // registrar.addActivityResultListener(plugin)
      }
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    if (call.method.equals("openPreferences")) {      
        showPreferences()
    } else if (call.method.equals("getValue")) {
        result.success(call.arguments.toString())
    } else {
      result.notImplemented()
    }
  }

    private fun showPreferences() {
        val intent = Intent(activity, PreferencesActivity::class.java)
        activity.startActivityForResult(intent, 100)
    }



}