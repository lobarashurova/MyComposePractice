package uz.mlsoft.mycomposepractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.mlsoft.mycomposepractice.ui.theme.MyComposePracticeTheme

class FourthTask : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposePracticeTheme {
                FourthTask()
            }
        }
    }

    @Composable
    private fun FourthContent() {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

            Column(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(
                        painter = painterResource(id = R.drawable.arrow),
                        contentDescription = "back",
                        modifier = Modifier
                            .width(82.dp)
                            .padding(25.dp)
                            .height(25.dp),
                    )

                    Text(
                        text = "TOURS",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 25.sp,
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 15.dp)
                    )

                    Image(painter = painterResource(id = R.drawable.menu),
                        contentDescription ="menu" ,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .size(65.dp)
                            .padding(15.dp))
                }
                for(i in 0 until 6){
                    ItemRecycler()
                }
            }


        }
    }



    @SuppressLint("NotConstructor")
    @Composable
    @Preview(showBackground = true)
    private fun FourthTask() {
        MyComposePracticeTheme {
            FourthContent()
        }
    }
}