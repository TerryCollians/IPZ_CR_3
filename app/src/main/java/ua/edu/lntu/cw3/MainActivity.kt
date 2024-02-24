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
import androidx.compose.ui.tooling.preview.Preview
import ua.edu.lntu.cw3.ui.theme.IPZ_CR_3Theme
import androidx.compose.foundation.ScrollState

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

@Preview(showBackground = true)     // Прев'ю для списку
@Composable
fun PreviewVerticalScrollableList() {
    VerrticalSpisok()
}
