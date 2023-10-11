package uz.mlsoft.mycomposepractice

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.mlsoft.mycomposepractice.ui.theme.CircleItem
import uz.mlsoft.mycomposepractice.ui.theme.MyComposePracticeTheme

@Composable
fun FifthTask() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier.fillMaxSize()) {
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
            ) {
                Text(text = "Search Latest News", color = Color.DarkGray, fontSize = 20.sp)
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(state = rememberScrollState())
            ) {
                for (i in 0 until 10) {
                    Image(
                        painter = painterResource(id = R.drawable.person),
                        contentDescription = "person", modifier = Modifier
                            .width(90.dp)
                            .height(80.dp)
                            .padding(horizontal = 5.dp)
                            .border(
                                BorderStroke(2.dp, Color.Red), CircleShape
                            )
                    )
                }
            }

            Text(
                text = "Google's new app is ready for teachers who can teach students how to behave in public places",
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(top = 20.dp, start = 10.dp, end=5.dp),
                fontSize = 18.sp
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp, horizontal = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.nature),
                    contentDescription = "nature"
                )
            }

            Text(
                text = "Google's new app is ready for teachers who can teach students how to behave in public places",
                color = Color.Gray,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(top = 10.dp, start = 10.dp, end=5.dp),
                fontSize = 15.sp
            )

            for (i in 0 until 5){
                CircleItem()
            }
        }





    }

}

@Preview(showBackground = true)
@Composable
fun TaskPreview() {
    MyComposePracticeTheme {
        FifthTask()
    }
}