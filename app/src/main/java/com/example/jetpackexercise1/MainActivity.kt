package com.example.jetpackexercise1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackexercise1.ui.theme.JetpackExercise1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackExercise1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeArticleApp()
                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp() {
    ArticleCard(
        title = stringResource(id = R.string.heading_text),
        paragraph_1 = stringResource(id = R.string.paragraph_1),
        paragraph_2 = stringResource(id = R.string.paragraph_2),
        imagePainter = painterResource(id = R.drawable.bg_compose_background)
    )
}


@Composable
fun ArticleCard(
    paragraph_1: String,
    paragraph_2: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
    title: String,

    ) {

Column(modifier = modifier) {
    Image(painter = imagePainter, contentDescription =null )
    Text(
        text = title,
        modifier = Modifier.padding(16.dp),
        fontSize = 24.sp,
        color = Color.Red,
        textAlign = TextAlign.End,
        fontFamily = FontFamily.SansSerif
    )
    Text(
        text = paragraph_1,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        textAlign = TextAlign.Justify,
        fontWeight = FontWeight.Bold




    )
    Text(
        text = paragraph_2,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
    Text(
        text = paragraph_2,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )


}
}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackExercise1Theme {
        ComposeArticleApp()
    }
}