package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                Box{
                    Column (Modifier.fillMaxWidth()){
                        Row(modifier = Modifier.weight(1f)){
                            QuadrantText(title = getString(R.string.text_composable),
                                    description = getString(R.string.text_composable_desc),
                                backgroundColor = Color.Green)


                            QuadrantText(title = getString(R.string.image_composable),
                                    description = getString(R.string.image_composable_desc),
                                backgroundColor = Color.Yellow)

                        }

                        Row(modifier = Modifier.weight(1f)){
                            QuadrantText(title = getString(R.string.row_composable),
                                    description = getString(R.string.row_composable_desc),
                                backgroundColor = Color.Cyan)

                            QuadrantText(title = getString(R.string.column_composable),
                                    description = getString(R.string.column_composable_desc),
                                backgroundColor = Color.LightGray)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun QuadrantText(title: String, description: String, backgroundColor: Color){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text= title,
            modifier = Modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )

        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}
