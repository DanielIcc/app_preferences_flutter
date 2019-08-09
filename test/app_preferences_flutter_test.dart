import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:app_preferences_flutter/app_preferences_flutter.dart';

void main() {
  const MethodChannel channel = MethodChannel('app_preferences_flutter');

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  // test('getPlatformVersion', () async {
  //   expect(await AppPreferencesFlutter.platformVersion, '42');
  // });
}
