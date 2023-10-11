package uz.mlsoft.mycomposepractice

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import uz.mlsoft.mycomposepractice.ui.theme.MyComposePracticeTheme

@Composable
fun ItemRecycler() {


    Card(modifier = Modifier.fillMaxWidth().padding(10.dp).background(Color.Transparent)) {

        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.galaxy),
                contentDescription = "galaxy", modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp),
                contentScale = ContentScale.Crop
            )

            Image(
                painter = painterResource(id = R.drawable.baseline_location_on_24),
                contentDescription = "loca",
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 15.dp, top = 15.dp)
                    .background(Color.Transparent)
            )
            Text(
                text = "Costa Rica",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp, color = Color.White,
                modifier = Modifier.padding(top = 15.dp, start = 45.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.save),
                contentDescription = "save",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .size(45.dp)
                    .padding(end = 15.dp, top = 15.dp)
            )

            Text(
                text = "Grand Tour of European",
                fontSize = 25.sp, fontWeight = FontWeight.Medium,
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(bottom = 85.dp, start = 5.dp)
            )
            Text(
                text = "11 days - 4 cities",
                fontSize = 20.sp, fontWeight = FontWeight.Medium,
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(bottom = 55.dp, start = 5.dp)
            )

            Image(painter = painterResource(id = R.drawable.start),
                contentDescription = "star",
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .height(50.dp)
                    .padding(bottom = 15.dp, start = 5.dp))
        }

    }

}

@Composable
@Preview(showBackground = true)
fun ItemPreview() {
    MyComposePracticeTheme {
        ItemRecycler()
    }
}