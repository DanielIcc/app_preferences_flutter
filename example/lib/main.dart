import 'package:flutter/material.dart';
import 'package:app_preferences_flutter/app_preferences_flutter.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String a = "";
  String b = "";
  String c = "";
  String d = "";
  String e = "";

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Preferences screen plugin'),
        ),
        body: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: <Widget>[
            Center(child: Text(a.toString())),
            Center(child: Text(b.toString())),
            Center(child: Text(c.toString())),
            Padding(
              padding: EdgeInsets.all(10),
            ),
            RaisedButton(
              child: Text("Open preferences screen"),
              onPressed: () async => await AppPreferencesFlutter.openPreferences(),
            ),
            RaisedButton(
              child: Text("Get values"),
              onPressed: () async {
                a = await AppPreferencesFlutter.getValue("text_preference");
                b = await AppPreferencesFlutter.getValue("enabled_preference");
                c = await AppPreferencesFlutter.getValue("text_password_preference");
                setState(() {});
              },
            ),
          ],
        ),
      ),
    );
  }
}
