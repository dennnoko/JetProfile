package com.example.jetprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        //プロフィール画像
                        Image(painter = painterResource(id = R.drawable.img_profile), contentDescription = "my profile image")
                        //名前
                        Text(
                            text = "でんのこ",
                            color = Color.Gray,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        //職業
                        Text(
                            text = "学生",
                            color = Color.Gray,
                            fontSize = 16.sp,
                        )
                    }

                }
            }
        }
    }
}
