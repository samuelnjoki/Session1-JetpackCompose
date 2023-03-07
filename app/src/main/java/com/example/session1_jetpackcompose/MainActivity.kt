package com.example.session1_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.session1_jetpackcompose.ui.theme.Session1JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Session1JetpackComposeTheme {



                Scaffold(
                    topBar = {
                        TopAppBar(
                            backgroundColor = Color.White,
//                            elevation = 0.dp,
                            title = {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
//                                    verticalAlignment = Alignment.CenterVertically

                                ) {
                                    Image(
                                        modifier = Modifier.size(30.dp),
                                        painter = painterResource(id = R.drawable.img_2),

                                        contentDescription = null,


                                    )

                                    Icon(
                                        modifier=Modifier.size(20.dp),
                                        imageVector = Icons.Default.Notifications,
                                        contentDescription = null,
                                          tint=Color.Black

                                    )

                                }
                            }
                        )
                    }
                ) 

                {

                        LazyRow(
                            modifier = Modifier.fillMaxSize()
                        )
                        {
                            items(3) {
                                Card(
                                    modifier = Modifier
                                        .padding(10.dp)
                                        .width(190.dp)
                                        .height(150.dp)
                                        .clip(shape = RoundedCornerShape(15.dp)),

//                                    backgroundColor = Color.Red



                                ) {
                                    Image(painter = painterResource(id = R.drawable.img_3), contentDescription = null)
                                    Box(
                                        modifier = Modifier
//                                        .fillMaxWidth()
                                            .padding(horizontal = 0.dp, vertical = 35.dp)
//                                        .height(50.dp),
                                            .background(Color.Transparent),
                                        contentAlignment = Alignment.Center


                                    ) {
                                        Column(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(8.dp),


                                            ) {
                                            Column {
                                                Row(
                                                    modifier = Modifier.fillMaxWidth(),
                                                    horizontalArrangement = Arrangement.SpaceBetween,
                                                ) {
                                                    Text(
                                                        text = "Northern Mountain",
                                                        color=Color.White,
                                                        fontWeight = FontWeight.Bold
                                                    )
                                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                                        Icon(
                                                            imageVector = Icons.Default.Star,
                                                            contentDescription = null
                                                        )

                                                        Text(
                                                            text = "4.9"
                                                        )
                                                    }


                                                }

                                                Row(
                                                    modifier = Modifier.fillMaxWidth(),

                                                    ) {

                                                    Icon(
                                                        imageVector = Icons.Default.LocationOn,
                                                        contentDescription = null
                                                    )

                                                    Text(
                                                        text = "Tekergat, Sunamgnj",
                                                        color=Color.White
                                                    )


                                                }
                                            }
                                        }
                                    }
                                }

                            }

                        }


                        Row(
                            modifier = Modifier.fillMaxWidth().padding(10.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        )
                        {
                            Text(text = "Best Destination")
                            Text(text = "View all")
                        }




                    
                }

               
                }
          

                   }

                }
            }



    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!", color = Color.Red)

    }

    //@Composable
//fun HeaderName() {
//
//
//}
    @Composable
    fun LazyColumnExample() {
        LazyColumn(

        ) {
            item {
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(text = "Category")
                    Text(text = "See All")
                }
            }

        }
    }



