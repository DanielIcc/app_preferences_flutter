#import "AppPreferencesFlutterPlugin.h"
#import <app_preferences_flutter/app_preferences_flutter-Swift.h>

@implementation AppPreferencesFlutterPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftAppPreferencesFlutterPlugin registerWithRegistrar:registrar];
}
@end
