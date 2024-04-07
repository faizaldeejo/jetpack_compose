package com.example.sampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
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
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()){
        Column(
            modifier = Modifier
                .background(Color.Green)
        ) {
            Text(
                text = "Heading 3",
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "Heading 4",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "Heading 5",
                style = MaterialTheme.typography.bodySmall
            )
        }

        Column(
            modifier = Modifier.background(Color.Magenta).fillMaxWidth().padding(20.dp)
        ){
            Button(onClick = {
                //your onclick code here
            },Modifier.align(Alignment.CenterHorizontally),colors = ButtonDefaults.buttonColors(Color.Red))
            {
                Text(text = "Button with gray background",color = Color.White)
            }

            Button(onClick = {
                //your onclick code here
            },Modifier.align(Alignment.CenterHorizontally),colors = ButtonDefaults.buttonColors(Color.DarkGray))
            {
                Text(text = "Button with gray background",color = Color.White)
            }

            Button(onClick = {
                //your onclick code here
            },Modifier.align(Alignment.CenterHorizontally))
            {
                Text(text = "Click ", color = Color.White)
                Text(text = "Here", color = Color.Green)
            }

            Button(onClick = {},Modifier.align(Alignment.CenterHorizontally)) {
                Image(
                    painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription ="Cart button icon",
                    modifier = Modifier.size(40.dp))

                Text(text = "Add to cart",Modifier.padding(start = 10.dp),fontSize = 16.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.W800)
            }

            Button(onClick = {},Modifier.align(Alignment.CenterHorizontally) ,shape = RectangleShape) {
                Text(text = "Rectangle shape")
            }

            Button(onClick = {},Modifier.align(Alignment.CenterHorizontally), shape = RoundedCornerShape(10.dp)) {
                Text(text = "Round corner shape")
            }

            Button(onClick = {}, shape = CutCornerShape(10), border = BorderStroke(2.dp, Color.Cyan)) {
                Text(text = "Cut corner shape")
            }

           /* Button(onClick = {
                //your onclick code here
            },elevation =  .elevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            )) {
                Text(text = "Button with elevation")
            }*/

            for(i in 1 .. 5){
                Button(onClick = {}, shape = CutCornerShape(10), border = BorderStroke(2.dp, Color.Cyan)) {
                    Text(text = "Cut corner shape")
                }
            }

        }
    }

}


