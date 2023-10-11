package com.example.articulocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulocompose.ui.theme.ArticuloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText("Jetpack Compose tutorial", "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                        "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message:String, from:String, message1:String, modifier: Modifier =Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp)) {
        Text(
            text = message,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = from,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify

        )
        Text(
            text = message1,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify

        )
    }

}

@Preview(
    showBackground = true)
@Composable
fun ArticuloCompose() {
    ArticuloComposeTheme {
        GreetingImage(message = "Jetpack Compose tutorial", from = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            message1 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")

    }
}

@Composable
fun GreetingImage(message: String, from: String,message1: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Box {
        Image(painter = image ,
            contentDescription = null,
            contentScale = ContentScale.FillWidth

        )
        GreetingText(
            message = message,
            from = from,
            message1 = message1,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )

    }

}