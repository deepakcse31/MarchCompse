package com.example.marchcompse

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun List(viewModel: UserViewModel=hiltViewModel()){

   Log.e("Deepak123","Deepak123"+viewModel.getSessionName())
    var arrayList= listOf<String>("dev","kotlin",)

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