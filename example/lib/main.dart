import 'package:flutter/material.dart';
import 'package:app_preferences_flutter/app_preferences_flutter.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Preferences screen plugin'),
        ),
        body: Center(
          child: Text('Tap button'),
        ),
        floatingActionButton: FloatingActionButton(
          onPressed: () {
            AppPreferencesFlutter.openPreferences;
          },
          child: Icon(Icons.settings),
        ),
      ),
    );
  }

  
}
