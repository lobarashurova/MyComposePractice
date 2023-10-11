package uz.mlsoft.mycomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.mlsoft.mycomposepractice.ui.theme.MyComposePracticeTheme


class SecondTask : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposePracticeTheme {
                SecondTask()
            }
        }
    }

    @Composable
    fun SecondContent() {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(0.dp)
                            .weight(1f, true)
                            .background(
                                color = colorResource(
                                    id = R.color.blue
                                )
                            )
                    ) {
                        Box(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = painterResource(id = R.drawable.img),
                                contentDescription = "Lottie",
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .align(Alignment.TopCenter)
                            )

                            Image(
                                painter = painterResource(id = R.drawable.setting),
                                contentDescription = "setting",
                                modifier = Modifier
                                    .width(45.dp)
                                    .height(45.dp)
                                    .align(Alignment.TopEnd)
                                    .background(Color.Transparent)
                                    .padding(top = 15.dp),
                                colorFilter = ColorFilter.tint(Color.White)
                            )


                        }
                        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Text(text = "Honglu Yan", fontSize = 25.sp, color = Color.White)
                        }
                        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            Text(
                                text = "Beijing,China",
                                fontSize = 20.sp,
                                color = Color.White,
                                modifier = Modifier.padding(top = 10.dp)
                            )
                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(0.dp)
                            .weight(1f, true)
                            .background(colorResource(id = R.color.white))
                            .padding(horizontal = 15.dp)
                            .padding(top = 75.dp)
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.nature),
                            contentDescription = "nature",
                            modifier = Modifier
                                .clip(RoundedCornerShape(15.dp))
                                .background(Color.Transparent)
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 20.dp),
                            contentAlignment = Alignment.Center

                        ) {
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .width(150.dp)
                                    .height(50.dp)
                                    .background(Color.Transparent),
                                colors = ButtonDefaults.buttonColors(
                                    colorResource(
                                        id = R.color.blue
                                    )
                                )
                            ) {
                                Text(text = "Follow", color = Color.White)
                            }
                        }
                    }


                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(130.dp)
                        .align(Alignment.Center)
                        .padding(horizontal = 15.dp)
                ) {
                    Column(
                        Modifier
                            .fillMaxSize()
                            .background(color = Color.Transparent)
                    ) {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(0.dp)
                                .weight(1f)
                        ) {
                            Text(
                                text = "Photos",
                                color = colorResource(id = R.color.textColor),
                                modifier = Modifier.padding(
                                    top = 20.dp,
                                    start = 28.dp,
                                    end = 15.dp
                                ),
                                fontSize = 20.sp
                            )
                            Text(
                                text = "Flowers",
                                color = colorResource(id = R.color.textColor),
                                modifier = Modifier.padding(
                                    top = 20.dp,
                                    start = 28.dp,
                                    end = 15.dp
                                ),
                                fontSize = 20.sp
                            )
                            Text(
                                text = "Following",
                                color = colorResource(id = R.color.textColor),
                                modifier = Modifier.padding(
                                    top = 20.dp,
                                    start = 28.dp,
                                    end = 15.dp
                                ),
                                fontSize = 20.sp
                            )
                        }

                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(0.dp)
                                .weight(1f)
                        ) {
                            Text(
                                text = "376",
                                color = colorResource(id = R.color.blue),
                                modifier = Modifier.padding(start = 28.dp, end = 20.dp),
                                fontSize = 35.sp
                            )
                            Text(
                                text = "1769",
                                color = colorResource(id = R.color.textColor),
                                modifier = Modifier.padding(start = 28.dp, end = 20.dp),
                                fontSize = 35.sp
                            )
                            Text(
                                text = "127",
                                color = colorResource(id = R.color.textColor),
                                modifier = Modifier.padding(start = 28.dp, end = 20.dp),
                                fontSize = 35.sp
                            )
                        }

                    }
                }
            }

        }
    }

    @Composable
    @Preview(showBackground = true)
    private fun MainPreview() {
        MyComposePracticeTheme {
            SecondContent()
        }
    }
}