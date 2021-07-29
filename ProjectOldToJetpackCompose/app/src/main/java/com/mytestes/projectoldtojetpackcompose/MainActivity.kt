package com.mytestes.projectoldtojetpackcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mytestes.projectoldtojetpackcompose.ui.theme.MyApp
import com.mytestes.projectoldtojetpackcompose.ui.theme.MyScreenContent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MyScreenContent()
            }
        }
    }
}

@Preview(showBackground = true, name = "Text preview")
@Composable
fun DefaultPreview() {
    MyApp {
        MyScreenContent()
    }
}