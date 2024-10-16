package com.example.gdgcomposestudy

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun LoginScrren(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(40.dp),
    ) {
        Text(text = "로그인 화면입니다", fontWeight = FontWeight.W800)
        Spacer(modifier = Modifier.height(60.dp))
        Text(text = "ID")
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("사용자 아이디를 입력하세요") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Password")
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("비밀번호를 입력하세요") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("로그인하기")
        }
    }
}