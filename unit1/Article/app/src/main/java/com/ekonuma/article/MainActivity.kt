package com.ekonuma.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ekonuma.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(
                        stringResource(R.string.article_title),
                        stringResource(R.string.article_summary),
                        stringResource(id = R.string.article_content)
                    )
                }
            }
        }
    }
}

@Composable
fun Article(title: String, summary: String, content: String, modifier: Modifier = Modifier) {
    Column {
        ArticleImage(modifier = modifier)
        ArticleTitle(text = title, modifier = modifier)
        ArticleSummary(text = summary, modifier = modifier)
        ArticleContent(text = content, modifier = modifier)
    }
}

@Composable
fun ArticleImage(modifier: Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(painter = image, contentDescription = null)
}

@Composable
fun ArticleTitle(text: String, modifier: Modifier) {
    Text(
        text = text,
        fontSize = 24.sp,
        modifier = modifier.padding(all = 16.dp)
    )
}

@Composable
fun ArticleSummary(text: String, modifier: Modifier) {
    Text(
        text = text,
        textAlign = TextAlign.Justify,
        modifier = modifier.padding(all = 16.dp)
    )
}

@Composable
fun ArticleContent(text: String, modifier: Modifier) {
    Text(
        text = text,
        textAlign = TextAlign.Justify,
        modifier = modifier.padding(all = 16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticleTheme {
        Article(
            stringResource(R.string.article_title),
            stringResource(R.string.article_summary),
            stringResource(R.string.article_content)
        )
    }
}