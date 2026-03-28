package com.example.marchcompse

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize().padding(top = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Home Screen")
        Text(text = "Home Screen2")
        Text(text = "Home Screen3")
        Text(text = "Home Screen4")

        Button(onClick = {
            navController.navigate("listScreen")
        }) {

            Text("Click me")
        }
    }
}
