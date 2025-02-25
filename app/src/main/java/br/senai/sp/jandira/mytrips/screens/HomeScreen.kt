package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()


    ){
        Card(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .height(40.dp)
                .width(150.dp),
            shape = RoundedCornerShape(
                bottomStart = 15.dp,
            ),
            colors = CardDefaults.cardColors(Color.Blue)
        ) {

        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(start = 32.dp, end = 32.dp)
        ){

            Text(
                text = stringResource(R.string.login),
                fontSize = 54.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
                modifier = Modifier

            )
            Text(
                text = stringResource(R.string.signin),
                color = Color.Gray,
                modifier = Modifier

            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = modifier.fillMaxWidth()
                    .padding(top = 60.dp)
                    .padding(bottom = 30.dp),

                label = {
                    Text(text = "example@gmail.com")
                }
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = modifier.fillMaxWidth()
                    .padding(bottom = 30.dp),

                        label = {
                    Text(text = "Password")
                }
            )
            Button(
                onClick = {},
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(bottom = 20.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )

            ) {
                Text(
                    text = stringResource(R.string.signin2)
                )
            }

            Row (
                modifier = Modifier
                    .align(Alignment.End)

            ){
                Text(
                    text = stringResource(R.string.accout),
                    modifier = Modifier
                        .padding(end = 8.dp)

                    )
                Text(
                    text = stringResource(R.string.signin2),
                    color = Color.Blue
                )
            }


                }





        Card(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .height(40.dp)
                .width(150.dp),
            shape = RoundedCornerShape(
                topEnd = 15.dp,

            ),
            colors = CardDefaults.cardColors(Color.Blue)
        ) {

        }


            }
        }



@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}