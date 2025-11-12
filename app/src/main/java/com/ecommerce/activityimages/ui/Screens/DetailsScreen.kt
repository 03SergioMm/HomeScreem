package com.ecommerce.activityimages.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ecommerce.activityimages.ui.data.TeamRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(
    teamId: String,
    onBack: () -> Unit
) {
    val team = TeamRepository.getTeam(teamId)

    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = team?.name ?: "Detalles") },
                navigationIcon = {
                    Text(
                        modifier = Modifier
                            .clickable { onBack() }
                            .padding(horizontal = 16.dp),
                        text = "⬅️"
                    )
                }
            )
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .padding(paddingValues = padding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (team != null) {
                Image(
                    painter = painterResource(id = team.imageResId),
                    contentDescription = "Escudo de ${team.name}",
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .aspectRatio(1f),
                    contentScale = ContentScale.Fit
                )

                Spacer(Modifier.height(16.dp))

                Text(
                    text = team.description,
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center
                )

                Spacer(Modifier.height(24.dp))

                Button(onClick = { onBack() }) {
                    Text(text = "Volver")
                }
            } else {
                Text(text = "Error: No se encontró el equipo con id '$teamId'")
                Spacer(Modifier.height(12.dp))
                Button(onClick = { onBack() }) {
                    Text(text = "Volver")
                }
            }
        }
    }
}