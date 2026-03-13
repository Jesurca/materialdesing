package me.jesusurbinez.materialdesing
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun StateTextField() {

    Scaffold() { innerPading ->
        Column(
            modifier = Modifier
                .padding(innerPading)
        ) {
            TextField(
                value = "",
                onValueChange = { },
                label = { Text("Escribe lo que quieras") }
            )
        }

    }
}
