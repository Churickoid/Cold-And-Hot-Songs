package com.churickoid.coldandhot.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.churickoid.coldandhot.presentation.ui.theme.ColdAndHotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColdAndHotTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center ) {
                        AccessTokenInfo("",false)
                        CurrentSong("")
                    }
                }
            }
        }
    }
}

@Composable
fun AccessTokenInfo(token: String, isGot: Boolean) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(IntrinsicSize.Min)) {
        Button(onClick = {  } , enabled = !isGot) {
            Text("Access")
        }
        Box(Modifier
            .fillMaxSize()) {
            Text(text = "Token: $token", modifier = Modifier.align(alignment = Alignment.CenterStart))

        }
    }
}

@Composable
fun CurrentSong(name:String){
    Text("Song name? $name")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ColdAndHotTheme {
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Top ) {
            AccessTokenInfo("",false)
            CurrentSong("")
        }
    }
}