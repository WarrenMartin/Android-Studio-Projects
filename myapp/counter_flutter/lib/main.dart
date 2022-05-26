

import 'package:counter_flutter/pages/choose_location.dart';
import 'package:flutter/material.dart';
import 'pages/home.dart';   //**didnt import world_time
import 'pages/loading.dart';

void main() =>runApp(MaterialApp(
  initialRoute: '/home', //here "/" will load up first but using initial route we can mke anything load up first
  routes: { //this is going to b map which expect key value pair
    '/': (context) => Loading(),   //base route which loads up loading widget
    '/home':(context) =>Home(),
    'location':(context)=>chooseLocation(),


  },
));

//Lets create a button where in when user presses it it pushes us to a different route