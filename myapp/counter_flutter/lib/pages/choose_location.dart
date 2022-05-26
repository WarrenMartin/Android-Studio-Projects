import 'package:flutter/material.dart';

class chooseLocation extends StatefulWidget {
  const chooseLocation({Key? key}) : super(key: key);

  @override
  _chooseLocationState createState() => _chooseLocationState();
}

class _chooseLocationState extends State<chooseLocation> {

  int counter=0;

  @override //overiding the orignal initstate function
  void initState() {  //init state function is used to get data from the third party api
     super.initState();
     print('initStateFunction ran');
  }


  @override
  Widget build(BuildContext context) {
    print('Build Function ran');
    return Scaffold(
      backgroundColor: Colors.grey[200],
      appBar: AppBar( //in flutter when we have a appbar automatically it places a little back arrow inside the app bar when we have come from a different screen
        backgroundColor: Colors.blue[900],
        title: Text('Choose a Location'),
        centerTitle: true,
        elevation: 0, //removing drop shadow
      ),
      body: RaisedButton(
        onPressed: () {
          setState(() {
            counter +=1;
          });
        },
        child:Text('Counter is $counter'),
      ),
    );
  }
}
