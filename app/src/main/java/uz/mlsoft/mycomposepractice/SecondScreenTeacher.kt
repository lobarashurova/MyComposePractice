package uz.mlsoft.mycomposepractice


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.mlsoft.mycomposepractice.ui.theme.MyComposePracticeTheme

@Composable
fun Test() {
    val configuration = LocalConfiguration.current

    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth()
                    .background(
                        Brush.horizontalGradient(
                            arrayListOf(
                                Color(0xFF0479AE),
                                Color(0xFF32B3ED)
                            )
                        )
                    )
            ) {
                Column(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(bottom = 56.dp)
                ) {
                    Image(
                        modifier = Modifier.size(150.dp),
                        painter = painterResource(id = R.drawable.ic_user),
                        contentDescription = "user image"
                    )

                    Text(
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "Honglu Yan",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.W300
                    )

                    Text(
                        modifier = Modifier
                            .padding(top = 4.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "Beijing China",
                        fontSize = 14.sp,
                        color = Color(0xFFECE1E1)
                    )
                }

                Image(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(16.dp),
                    painter = painterResource(id = R.drawable.ic_setting),
                    contentDescription = "setting"
                )

            }

            val paddingTop = 72.dp // rasm va info line orasidagi masofa
            val paddingBottom = 100.dp // rasm va screen pastki orasidagi masofa
            Box(modifier = Modifier.weight(3f)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(screenHeight * 3 / 5)
                        .padding(top = paddingTop, bottom = paddingBottom)
                ) {
                    Spacer(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(16.dp)
                            .background(
                                Color(0xFFD1E7F1),
                                RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp)
                            )
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .padding(horizontal = 12.dp)
                            .shadow(
                                elevation = 8.dp,
                                spotColor = Color.Black,
                                shape = RoundedCornerShape(12.dp)
                            )
                            .background(color = Color.White, shape = RoundedCornerShape(12.dp))
                    ) {

                        Image(
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(12.dp)),
                            painter = painterResource(id = R.drawable.download),
                            contentDescription = "Test image",
                            contentScale = ContentScale.Crop
                        )

                    }

                    Spacer(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(16.dp)
                            .background(
                                Color(0xFFD1E7F1),
                                RoundedCornerShape(topStart = 12.dp, bottomStart = 12.dp)
                            )
                    )
                }



                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                        .height(56.dp)
                        .background(
                            brush = Brush.horizontalGradient(
                                arrayListOf(
                                    Color(0xFF0479AE),
                                    Color(0xFF32B3ED)
                                )
                            ), RoundedCornerShape(28.dp)
                        )
                        .align(Alignment.BottomCenter)
                ) {
                    Text(
                        modifier = Modifier.align(Alignment.Center),
                        text = "FOLLOW",
                        color = Color.White
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = screenHeight * 2 / 5 - 50.dp,
                    bottom = screenHeight * 3 / 5 - 50.dp
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .shadow(
                        elevation = 8.dp,
                        spotColor = Color.Black,
                        shape = RoundedCornerShape(12.dp)
                    )
                    .background(Color.White, RoundedCornerShape(12.dp))
            ) {

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {
                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Photos",
                        fontSize = 12.sp,
                        color = Color(0xFF858080)
                    )

                    Text(
                        modifier = Modifier
                            .padding(top = 4.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "376",
                        fontWeight = FontWeight.W500,
                        fontSize = 28.sp,
                        color = Color(0xFF32B3ED)
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {
                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Followers",
                        fontSize = 12.sp,
                        color = Color(0xFF858080)
                    )

                    Text(
                        modifier = Modifier
                            .padding(top = 4.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "1769",
                        fontWeight = FontWeight.W500,
                        fontSize = 28.sp,
                        color = Color(0xFF858080)
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically)
                ) {
                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = "Following",
                        fontSize = 12.sp,
                        color = Color(0xFF858080)
                    )

                    Text(
                        modifier = Modifier
                            .padding(top = 4.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "127",
                        fontWeight = FontWeight.W500,
                        fontSize = 28.sp,
                        color = Color(0xFF858080)
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun TestPreview() {
   MyComposePracticeTheme {
       Test()
   }
}