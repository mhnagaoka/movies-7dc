import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

//@Composable
//@Preview
//fun App() {
//    var text by remember { mutableStateOf("Hello, World!") }
//
//    MaterialTheme {
//        Button(onClick = {
//            text = "Hello, Desktop!"
//        }) {
//            Text(text)
//        }
//    }
//}

//fun loadImage(): BufferedImage? {
//    val url =
//        URL("https://m.media-amazon.com/images/M/MV5BNDE3ODcxYzMtY2YzZC00NmNlLWJiNDMtZDViZWM2MzIxZDYwXkEyXkFqcGdeQXVyNjAwNDUxODI@._V1_QL75_UX144_CR0,1,144,213_.jpg")
//    val connection: HttpURLConnection = url.openConnection() as HttpURLConnection
//    connection.connectTimeout = 5000
//    connection.connect()
//
//    val input: InputStream = connection.inputStream
//    val result: BufferedImage? = ImageIO.read(input)
//    return result
//}

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column {
            Text("The Shawshank Redemption")
            Image(
                painterResource("the_shawshank_redemption.jpg"), contentDescription = "The Shawshank Redemption"
            )
            Text("Nota: 9.2 - Ano: 1994")
        }
    }
}

fun main() = application {
    Window(title = "IMDB", onCloseRequest = ::exitApplication) {
        App()
    }
}
