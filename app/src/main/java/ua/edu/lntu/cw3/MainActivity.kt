package ua.edu.lntu.cw3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw3.ui.theme.IPZ_CR_3Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CR_3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun VerrticalSpisok() {          // Функція вертикального списку
    val items = listOf(           // Змінна зі значенням списку
        Triple("Сніданок", "Омлет та смажені сосиски з соусом", "8:00"),
        Triple("Обід", "Борщ з галушками та сметаною", "13:00"),
        Triple("Вечеря", "Баранина в вершковому соусі з гарніром", "17:00")
        // 3 довільних елемента
    )

}

// Додамо 3 змінних зі стилями для елементів списку
val titleStyle = TextStyle(
    fontSize = 20.sp,
    fontWeight = FontWeight.Bold
)

val descriptionStyle = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.Normal
)

val additionalInfoStyle = TextStyle(
    fontSize = 14.sp,
    fontWeight = FontWeight.Light
)

@Composable
fun ListItem(item: Triple<String, String, String>){           // функція для того щоб визначити як буде відображатися у вертикальному списку

}



@Preview(showBackground = true)     // Прев'ю для списку
@Composable
fun PreviewVerticalScrollableList() {
    VerrticalSpisok()
}
