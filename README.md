# app_preferences_flutter

Plugin for open and save native preferences on Android and iOS


## iOS Prerequisites

* Create iOS Settings.bundle files in App_Resources/iOS [example](https://github.com/DanielIcc/app_preferences_flutter/tree/master/example/ios/Runner/Settings.bundle)
or [Apple Developer docs](https://developer.apple.com/library/content/documentation/Cocoa/Conceptual/UserDefaults/Preferences/Preferences.html)

## Android Prerequisites
* In Project/Android/app/src/main/res/xml create [preferences.xml](https://github.com/DanielIcc/app_preferences_flutter/blob/master/example/android/app/src/main/res/xml/preferences.xml)
* Android [PreferenceScreen docs](https://developer.android.com/reference/android/preference/PreferenceScreen.html)

## Getting Started
   
| Property |   Description |
| ---  | --- |
| AppPreferencesFlutter.openPreferences(); |  Opens the native settings |
| AppPreferencesFlutter.getValue(String key); |  Gets the value for the preference |
    
## License

Apache License Version 2.0, January 2004
