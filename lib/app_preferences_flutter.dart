import 'package:flutter/services.dart';

const MethodChannel _channel = MethodChannel('app_preferences_flutter');

class AppPreferencesFlutter {

  static Future<void> openPreferences() async {
    await _channel.invokeMethod('openPreferences');
  }

  static Future<dynamic> getValue(String key) async {
    dynamic value = await _channel.invokeMethod('getValue', key);
    return value;
  }
}
