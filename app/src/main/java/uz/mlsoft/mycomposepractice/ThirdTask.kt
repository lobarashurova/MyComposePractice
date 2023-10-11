package uz.mlsoft.mycomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.mlsoft.mycomposepractice.ui.theme.MyComposePracticeTheme

class ThirdTask : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposePracticeTheme {
                ThirdView()
            }
        }
    }

    @Composable
    fun ThirdContent() {
        val configuration = LocalConfiguration.current

        val screenHeight = configuration.screenHeightDp.dp
        val screenWidth = configuration.screenWidthDp.dp
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(0.dp)
                            .weight(1f, true)
                            .background(color = colorResource(id = R.color.firstPart))
                    ) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Image(
                                painter = painterResource(id = R.drawable.arrow),
                                contentDescription = "back",
                                colorFilter = ColorFilter.tint(
                                    Color.White
                                ),
                                modifier = Modifier
                                    .height(38.dp)
                                    .width(38.dp)
                                    .padding(top = 15.dp, start = 15.dp)
                            )

                            Text(
                                text = "Lucas Galvan",
                                color = colorResource(id = R.color.white),
                                modifier = Modifier.padding(
                                    top = 48.dp,
                                    start = 38.dp,
                                    end = 15.dp
                                ),
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Buenisos Areos, Argentina",
                                color = colorResource(id = R.color.white),
                                modifier = Modifier.padding(
                                    top = 75.dp,
                                    start = 38.dp,
                                    end = 15.dp
                                ),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Normal
                            )


                            Image(
                                painter = painterResource(id = R.drawable.person),
                                contentDescription = "circle",
                                modifier = Modifier
                                    .width(110.dp)
                                    .height(110.dp)
                                    .align(Alignment.TopEnd)
                                    .background(Color.Transparent)
                                    .padding(25.dp)
                            )

                            Text(
                                text = "Personal", color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .padding(bottom = 45.dp, start = 25.dp),
                                fontWeight = FontWeight.Bold, fontSize = 20.sp,
                            )
                            Text(
                                text = "Cobertura", color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .padding(bottom = 45.dp, start = 145.dp),
                                fontWeight = FontWeight.Bold, fontSize = 20.sp,
                            )

//                            Box(
//                                modifier = Modifier
//                                    .width(100.dp)
//                                    .height(5.dp)
//                                    .background(color = colorResource(id = R.color.white)),
//                            )


                        }
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(0.dp)
                            .weight(2f, true)
                    ) {
                    }

                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .align(Alignment.Center),
                    colors = CardDefaults.cardColors(containerColor = Color.Blue)
                ) {

                }

            }


        }
    }

    @Composable
    @Preview(showBackground = true)
    fun ThirdView() {
        MyComposePracticeTheme {
            ThirdContent()
        }
    }
}