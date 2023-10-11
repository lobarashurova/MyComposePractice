package uz.mlsoft.mycomposepractice.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.mlsoft.mycomposepractice.R

@Composable
fun CircleItem() {
    Surface(modifier = Modifier.fillMaxWidth(), color = MaterialTheme.colorScheme.background) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp, horizontal = 10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.galaxy),
                contentDescription = "item", modifier = Modifier
                    .size(120.dp), contentScale = ContentScale.Crop

            )
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Back to beigeie: decodeing this most unlikely of...",
                    fontSize = 18.sp, fontWeight = FontWeight.SemiBold, color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp)
                )

                Text(
                    text = "Back to beigeie: decodeing ",
                    fontSize = 18.sp, fontWeight = FontWeight.Normal, color = Color.Black,
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp)
                )
                Text(
                    text = "1 hour ago",
                    fontSize = 18.sp, fontWeight = FontWeight.Normal, color = Color.Gray,
                    modifier = Modifier.padding(start = 5.dp, top = 8.dp)
                )


            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun CircleItemPreView() {
    MyComposePracticeTheme {
        CircleItem()
    }
}


