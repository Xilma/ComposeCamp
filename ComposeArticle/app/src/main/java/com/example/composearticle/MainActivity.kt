package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArticleImage(getString(R.string.title), getString(R.string.intro_one),
                        getString(R.string.intro_two))
                }
            }
        }
    }
}

@Composable
fun ArticleContent(title: String, intro_one: String, intro_two: String) {
    Column{
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .wrapContentWidth(Alignment.Start)
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = intro_one,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start=16.dp, end=16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = intro_two,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Composable
fun ArticleImage(title: String, intro_one: String, intro_two: String){
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        ArticleContent(title = title, intro_one = intro_one, intro_two = intro_two)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleTheme {
        ArticleImage("Title", "One", "Two")
    }
}