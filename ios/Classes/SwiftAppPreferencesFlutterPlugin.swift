import Flutter
import UIKit

public class SwiftAppPreferencesFlutterPlugin: NSObject, FlutterPlugin {
  public static func register(with registrar: FlutterPluginRegistrar) {
    let channel = FlutterMethodChannel(name: "app_preferences_flutter", binaryMessenger: registrar.messenger())
    let instance = SwiftAppPreferencesFlutterPlugin()
    registrar.addMethodCallDelegate(instance, channel: channel)
  }

    public func handle(_ call: FlutterMethodCall, result: @escaping FlutterResult) {
        if call.method == "openPreferences" {
            if #available(iOS 10.0, *) {
                UIApplication.shared.open(URL(string:UIApplicationOpenSettingsURLString)!,options:[:],completionHandler: nil)
            } else {
                // Versiones anteriores
                UIApplication.shared.openURL(URL(string:UIApplicationOpenSettingsURLString)!)
            }
        } else if call.method == "getValue" {
              let argument = call.arguments as! String
              let userDefaults = Foundation.UserDefaults.standard
                if userDefaults.object(forKey:argument) != nil {
                    result(userDefaults.object(forKey:argument))
                } else {
                   result(nil)
                }
            
        } else {
            result("Flutter method not implemented on iOS")
        }
    }
}
