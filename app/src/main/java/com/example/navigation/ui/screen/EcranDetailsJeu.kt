package com.example.navigation.ui.screenimport android.util.Logimport androidx.compose.foundation.layout.Columnimport androidx.compose.foundation.layout.fillMaxSizeimport androidx.compose.material3.Textimport androidx.compose.runtime.Composableimport androidx.compose.ui.Alignmentimport androidx.compose.ui.Modifierimport androidx.compose.ui.tooling.preview.Previewimport com.example.navigation.listJeux@Composablefun EcranDetailsJeu(jeuId: Int) {    Column (modifier = Modifier        .fillMaxSize(),        horizontalAlignment = Alignment.CenterHorizontally){        val jeu = listJeux.first {it.id == jeuId}        Log.d("DetailsJeu", "Affichage des détails pour le jeu: ${jeu.nom}")        Text(text = "Details du jeu: ${jeu.nom}")    }}@Preview(showBackground = true)@Composablefun PreviewEcranDetailsJeu() {    EcranDetailsJeu(jeuId = 1)}