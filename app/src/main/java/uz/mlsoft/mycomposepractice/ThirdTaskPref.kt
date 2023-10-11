package uz.mlsoft.mycomposepractice

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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


@Composable
fun ThirdTaskPref() {
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

                        Box(
                            modifier = Modifier
                                .width(120.dp)
                                .height(80.dp)
                                .padding(bottom = 75.dp, start = 20.dp)
                                .background(Color.White)
                                .align(Alignment.BottomStart),
                        ) {

                        }

                        Text(
                            text = "Personal", color = Color.White,
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .padding(bottom = 85.dp, start = 25.dp),
                            fontWeight = FontWeight.Bold, fontSize = 20.sp,
                        )
                        Text(
                            text = "Cobertura", color = Color.White,
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .padding(bottom = 85.dp, start = 145.dp),
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
                        .background(color = Color.Transparent)
                ) {

                }
            }

            Column(modifier = Modifier.fillMaxSize()) {
                Card(
                    Modifier
                        .fillMaxWidth()
                        .height(screenHeight * 62 / 100)
                        .padding(top = screenHeight * 1 / 3 - 60.dp)
                        .padding(horizontal = 15.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
                ) {

                    Column(modifier = Modifier.fillMaxSize()) {
                        Box(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = "Mis daos",
                                fontWeight = FontWeight.SemiBold,
                                color = Color.Black,
                                modifier = Modifier.padding(25.dp)
                            )

                            Image(
                                painter = painterResource(id = R.drawable.ic_user),
                                contentDescription = "user",
                                modifier = Modifier
                                    .align(
                                        Alignment.TopEnd
                                    )
                                    .size(75.dp)
                                    .padding(20.dp)
                            )


                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(2.dp)
                                .padding(horizontal = 10.dp)
                                .background(Color.LightGray)
                        )

                        Box(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = "DNI",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.LightGray,
                                modifier = Modifier.padding(top = 25.dp, start = 25.dp)
                            )
                            Text(
                                text = "DIRECCCION",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.LightGray,
                                modifier = Modifier
                                    .padding(top = 25.dp, end = 25.dp)
                                    .align(Alignment.TopEnd)
                            )
                        }
                        Box(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = "33443897",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black,
                                modifier = Modifier.padding(start = 25.dp, bottom = 25.dp)
                            )
                            Text(
                                text = "Av.Directino",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(start = 25.dp, end = 25.dp, bottom = 25.dp)
                                    .align(Alignment.TopEnd)
                            )
                        }

                        Box(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = "CLUDADA",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.LightGray,
                                modifier = Modifier.padding(start = 25.dp)
                            )
                            Text(
                                text = "MOVIL",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.LightGray,
                                modifier = Modifier
                                    .padding(end = 25.dp)
                                    .align(Alignment.TopEnd)
                            )
                        }

                        Box(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = "Buenos Airoes",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black,
                                modifier = Modifier.padding(start = 25.dp, bottom = 25.dp)
                            )
                            Text(
                                text = "111 3564848",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(start = 25.dp, end = 25.dp, bottom = 25.dp)
                                    .align(Alignment.TopEnd)
                            )
                        }


                        Box(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = "EMAIL",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.LightGray,
                                modifier = Modifier.padding(start = 25.dp)
                            )
                        }

                        Box(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = "lucasasers@gmail.com",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black,
                                modifier = Modifier.padding(start = 25.dp, bottom = 25.dp)
                            )
                            Text(
                                text = "Editor",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Blue,
                                modifier = Modifier
                                    .padding(start = 25.dp, end = 25.dp, bottom = 25.dp)
                                    .align(Alignment.TopEnd)
                            )
                        }
                    }
                }
                Card(
                    Modifier
                        .fillMaxWidth()
                        .height(screenHeight * 62 / 100)
                        .padding(top = 25.dp)
                        .padding(horizontal = 15.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
                ) {

                    Column(modifier = Modifier.fillMaxSize()) {
                        Box(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = "Historia de Assenies ",
                                fontWeight = FontWeight.SemiBold,
                                color = Color.Black,
                                modifier = Modifier.padding(25.dp)
                            )

                            Image(
                                painter = painterResource(id = R.drawable.baseline_battery_saver_24),
                                contentDescription = "user",
                                modifier = Modifier
                                    .align(
                                        Alignment.TopEnd
                                    )
                                    .size(75.dp)
                                    .padding(20.dp)
                            )


                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(2.dp)
                                .padding(horizontal = 10.dp)
                                .background(Color.LightGray)
                        )

                        Row(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = painterResource(id = R.drawable.person),
                                contentDescription = "person",
                                modifier = Modifier
                                    .width(85.dp)
                                    .padding(top = 15.dp, start = 10.dp)
                            )


                            Column() {
                                Text(
                                    text = "Juan Aguire",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black,
                                    modifier = Modifier.padding(top = 15.dp, start = 10.dp),
                                    fontSize = 18.sp
                                )
                                Text(
                                    text = "View profil",
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Blue,
                                    modifier = Modifier.padding(top = 15.dp, start = 10.dp),
                                    fontSize = 16.sp
                                )


                            }
                        }

                        Row(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = painterResource(id = R.drawable.location),
                                contentDescription = "location",
                                modifier = Modifier
                                    .size(45.dp)
                                    .padding(
                                        top = 25.dp, start = 15.dp
                                    )
                            )
                            Text(
                                text = "Av Directo 1860 Buenes Airess ",
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier.padding(
                                    top = 25.dp, start = 5.dp)
                            )
                        }
                        Row(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = painterResource(id = R.drawable.baseline_auto_mode_24),
                                contentDescription = "location",
                                modifier = Modifier
                                    .size(45.dp)
                                    .padding(
                                        top = 20.dp, start = 15.dp
                                    )
                            )
                            Text(
                                text = "Clinica Santa Bero",
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier.padding(
                                    top = 20.dp, start = 5.dp)
                            )
                        }
                    }
                }

            }


        }
    }
}

@Composable
@Preview(showBackground = true)
fun ThirdTaskPreview() {
    MyComposePracticeTheme {
        ThirdTaskPref()
    }
}
