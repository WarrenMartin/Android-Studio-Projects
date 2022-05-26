import 'package:flutter/material.dart';
//Run|Debug
void main(){
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'WIDS',
      theme: ThemeData(
        primarySwatch: Colors.blue,

      ),
      home: HomePage(),
    );
  }
}
class Homepage extends StatelessWidget {
  const Homepage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Column() ,
    );
  }
}


