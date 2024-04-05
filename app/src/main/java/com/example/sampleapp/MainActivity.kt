package com.example.sampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.sampleapp.ui.theme.SampleAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    GreetingPreview()
                }
            }
        }
    }
}

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        textAlign = TextAlign.Center,
        text = "Hello $name!",
        modifier = modifier
    )
}*/

@Preview(showBackground = true, name = "faizal",
    showSystemUi = true, device = Devices.PIXEL)
@Composable
fun GreetingPreview1() {
    SampleAppTheme {
        Row(modifier = Modifier.fillMaxWidth(),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Row Text 1")
            Text(text = "Row Text 2")
            Text(text = "Row Text 3")
        }
    }
}

@Preview(showBackground = true, name = "syed", backgroundColor = 0xFF03A9F4,
    showSystemUi = true, device = Devices.PIXEL)
@Composable
fun GreetingPreview(modifier: Modifier = Modifier) {
    SampleAppTheme {
        Row(modifier = Modifier.fillMaxWidth(),verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Row Text 1")
            Text(text = "Row Text 2")
            Text(text = "Row Text 3")
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally ) {
            Text(text = "Row Text 1",modifier.background(Color.Red), fontSize = 40.sp, color = Color.White, fontWeight = FontWeight.Bold)
            Text(text = "Row Text 2".repeat(50),Modifier.background(Color.White), fontStyle = FontStyle.Italic,  maxLines = 4, overflow = TextOverflow.Ellipsis)
            Text(text = "Row Text 3",Modifier.background(Color.Green))
            Text(
                text = "Text with Shadow",
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.Red,
                        offset = Offset(5f, 5f),
                        blurRadius = 5f
                    )
                )
            )
            SelectionContainer {
                Text(
                    text = "Hello World",
                    style = TextStyle(
                        color = Color.Red,
                        fontSize = 16.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.W800,
                        fontStyle = FontStyle.Italic,
                        letterSpacing = 0.5.em,
                        background = Color.LightGray,
                        textDecoration = TextDecoration.Underline
                    )
                )
            }
        }

    }
}

@Preview(showBackground = true, name = "faizal",
    showSystemUi = true, device = Devices.PIXEL)
@Composable
fun TextHeadingStyle() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green)
    ) {
        Text(
            text = "Heading 3",
            style = MaterialTheme.typography.h3
        )
        Text(
            text = "Heading 4",
            style = MaterialTheme.typography.h4
        )
        Text(
            text = "Heading 5",
            style = MaterialTheme.typography.h5
        )
    }
}