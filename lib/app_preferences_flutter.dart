import 'dart:async';

import 'package:flutter/services.dart';

class AppPreferencesFlutter {
  static const MethodChannel _channel =
      const MethodChannel('app_preferences_flutter');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }

  static get openPreferences async {
    await _channel.invokeMethod('openPreferences');
  }
}
