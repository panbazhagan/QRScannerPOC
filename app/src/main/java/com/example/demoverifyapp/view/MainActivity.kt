package com.example.demoverifyapp.view

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.demoverifyapp.view.theme.DemoVerifyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoVerifyAppTheme {
                MainAppPage(this)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainAppPage() {
    MainAppPage(context = LocalContext.current);
}

@Composable
fun MainAppPage(context: Context) {
    DemoVerifyAppTheme {
        Scaffold(
            floatingActionButton = {
                FloatingActionButton(onClick = {
                    QRCodeScannerActivity.open(context = context)
                }) {
                }
            },
            // Defaults to FabPosition.End
            floatingActionButtonPosition = FabPosition.Center
        ) {
            // Screen content
        }
    }
}