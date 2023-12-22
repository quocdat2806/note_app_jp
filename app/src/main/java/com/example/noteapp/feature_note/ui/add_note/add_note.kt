package com.example.noteapp.feature_note.ui.add_note



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.Color

//val fakeData = listOf<Note>(Note(2,"fuck",20),Note(3,"fuck 2",20))

class AddNotePage : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesAppUI()
//            val viewModel = viewModel<NoteViewModel>();
//            val data = viewModel.notes.collectAsState(initial = emptyList())
//            val scope = rememberCoroutineScope()
//            Column {
//                Row {
//                    TextAddField(viewModel = viewModel)
//                    Button(onClick = {
//                      scope.launch { viewModel.addTodo(Note(null,viewModel.noteContent,20)) }
//                    }, content = { Text(text = "Add")})
//                }
//                NoteList(data.value)
//            }


        }
    }

}


//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun TextAddField(viewModel: NoteViewModel){
//    val value = remember {
//        mutableStateOf("")
//    }
//    TextField(value = value.value, onValueChange = {
//        value.value = it
//        viewModel.handleTextFieldChange(value.value)
//    }
//    )
//}
//
//
//
//@Preview(showBackground = true)
//@Composable
//fun NoteList(listNote: List<Note> = fakeData) {
//    Column {
//        for (item in listNote) {
//            NoteItem(item)
//        }
//    }
//
//}
//
//@Preview (showBackground = true)
//@Composable
//fun NoteItem(note: Note = Note(1, "lau nha", 33333)) {
//
//    Row {
//        Text(text = note.title)
//        Button(onClick = { /*TODO*/ }, content = { Text(text = "Sua") })
//        Button(onClick = { /*TODO*/ }, content = { Text(text = "Xoa") })
//
//    }
//
//
//}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotesAppUI() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Notes") },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(Icons.Filled.Search, contentDescription = "Search")
                    }
                    IconButton(onClick = {  }) {
                        Icon(Icons.Filled.Info, contentDescription = "Notifications")
                    }
                },

                )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {  }) {
                Icon(Icons.Filled.Add, contentDescription = "Add Note")
            }
        },
        floatingActionButtonPosition = FabPosition.End,
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            EmptyState()
        }
    }
}

@Composable
fun EmptyState() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        val image = painterResource(id = com.example.noteapp.R.drawable.empty_note )
        Icon(
            painter = image,
            contentDescription = "Empty State",
            modifier = Modifier
                .size(350.dp)
                .background(color = Color.White)
        )

        Text("No notes yet!", style = MaterialTheme.typography.bodyLarge)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NotesAppUI()
}



















