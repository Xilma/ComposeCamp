package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.LightGray)
                ) {
                    ContactIntroduction("Ruby Atieno", "Android Engineer")
                }
            }
        }
    }
}

@Composable
fun ContactIntroduction(name: String, title: String) {
    var businessLogo = painterResource(id = R.drawable.android_logo)
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = businessLogo,
            contentDescription = "Android Logo",
            contentScale = ContentScale.Fit
        )

        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier.padding(6.dp)
        )

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(6.dp)
        )

        ContactDetail()
    }

}

@Composable
fun ContactDetail ()
{
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center) {
        Row (modifier = Modifier
            .padding(16.dp)){
            Icon(
                Icons.Rounded.Phone,
                contentDescription = "Phone icon"
            )
            Text(
                text = "+254 772 816738",
                modifier = Modifier.padding(start = 16.dp)

            )
        }
        Row (modifier = Modifier
            .padding(16.dp)){
            Icon(
                Icons.Rounded.Person,
                contentDescription = "Person icon"
            )
            Text(
                text = "@xilma",
                modifier = Modifier.padding(start = 16.dp)
            )
        }
        Row (modifier = Modifier
            .padding(16.dp)){
            Icon(
                Icons.Rounded.Email,
                contentDescription = "Email icon"
            )
            Text(
                text = "xilma@info.com",
                modifier = Modifier.padding(start = 16.dp)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
        ) {
            ContactIntroduction("Ruby Atieno", "Android Engineer")
        }
    }
}