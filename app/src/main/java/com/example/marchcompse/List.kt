package com.example.marchcompse

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun List(){
    var arrayList= listOf<String>("dev","android","kotlin")

    LazyColumn(modifier = Modifier.padding(top = 30.dp)) {
        items(arrayList.size) {
            name(arrayList[it])
        }
    }
}

@Composable
fun name(nameData : String){
    Text( text = nameData)
}