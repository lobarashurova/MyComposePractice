package uz.mlsoft.mycomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.mlsoft.mycomposepractice.ui.theme.MyComposePracticeTheme

class FirstTask : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposePracticeTheme {
                FirstContent()
            }
        }
    }
}


@Composable
fun FirstContent() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.backColor))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(0.dp)
                        .weight(1f, true)
                ) {
                    Image(
                        painter = painterResource(R.drawable.newyork),
                        "newYork",
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp)
                            .padding(25.dp)
                    )
                    Text(
                        "New York",
                        color = colorResource(id = R.color.textColor),
                        modifier = Modifier.padding(25.dp, 5.dp, 0.dp, 0.dp),
                        fontSize = 25.sp
                    )
                }
                Text(
                    text = "Monday 25°",
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.white),
                    fontSize = 30.sp,
                    modifier = Modifier.padding(15.dp, 75.dp, 35.dp, 0.dp)
                )
            }
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Image(painter = painterResource(id = R.drawable.sun), contentDescription = "Sun")
            }

            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Text(  text = "28°",
                    color = colorResource(id = R.color.white),
                    fontStyle = FontStyle.Normal,
                    fontSize = 88.sp,
                    modifier = Modifier.padding(15.dp, 15.dp))
            }

            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Tue", color = colorResource(id = R.color.textsColor), fontSize = 20.sp, modifier = Modifier.padding(15.dp))
                Text(text = "Wed", color = colorResource(id = R.color.textsColor), fontSize = 20.sp, modifier = Modifier.padding(15.dp))
                Text(text = "Thu", color = colorResource(id = R.color.textsColor), fontSize = 20.sp, modifier = Modifier.padding(15.dp))
                Text(text = "Fr", color = colorResource(id = R.color.textsColor), fontSize = 20.sp, modifier = Modifier.padding(15.dp))
                Text(text = "Sat", color = colorResource(id = R.color.textsColor), fontSize = 20.sp, modifier = Modifier.padding(15.dp))
                Text(text = "Sun", color = colorResource(id = R.color.textsColor), fontSize = 20.sp, modifier = Modifier.padding(15.dp))
            }
        }


    }
}

@Composable
@Preview(showBackground = true)
private fun MainPreview() {
    MyComposePracticeTheme {
        FirstContent()
    }
}