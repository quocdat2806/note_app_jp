package com.example.noteapp.feature_note

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
@Composable
fun  NavHostContainer (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "profile") {
        composable("profile") { Profile(/*...*/) }
        composable("friendslist") { FriendsList(/*...*/) }
        /*...*/
    }
}