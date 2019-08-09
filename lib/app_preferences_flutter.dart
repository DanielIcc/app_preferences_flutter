import 'package:flutter/services.dart';

class AppPreferencesFlutter {
  static const MethodChannel _channel =
      const MethodChannel('app_preferences_flutter');

  static get openPreferences async {
    await _channel.invokeMethod('openPreferences');
  }
}
