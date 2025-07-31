package com.example.birthdaygreeting


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Horizontal
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaygreeting.ui.theme.BirthdayGreetingTheme



class ComposeTutorial : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayGreetingTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TutorialText(modifier = Modifier,
                        header = stringResource(R.string.jetpack_compose_tutorial),
                        start = stringResource(R.string.jetpack_compose_start),
                        paragraf = stringResource(R.string.jetpack_compose_long)
                    )
                }
            }
        }
    }
}

@Composable
fun TutorialText( modifier: Modifier = Modifier, header: String, start: String, paragraf: String) {
    Column {
        val image = painterResource(R.drawable.composebg)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        Text(
            text = header,
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = start,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = paragraf,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeTutorialPreview() {
    BirthdayGreetingTheme {
        TutorialText(modifier = Modifier,
            header = stringResource(R.string.jetpack_compose_tutorial),
            start = stringResource(R.string.jetpack_compose_start),
            paragraf = stringResource(R.string.jetpack_compose_long))
    }
}