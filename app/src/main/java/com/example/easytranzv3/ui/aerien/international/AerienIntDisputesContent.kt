package com.example.easytranzv3.ui.aerien.international

object AerienIntDisputesContent {
    val DISPUTES = listOf(
        DisputesItem("depart", "- Au niveau national, délai commence le jour ou marchandise a été remise, ou pour perte total, le jour ou la marchandise aurait du être remise"),
        DisputesItem("interruption","- Au niveau national, seul l'action en justice ou le fait que TR reconnaisse sa faute interrompre prescription (lettre recommandé, demande expertise valent que dalle)\n" +
                "- Y a 3 cas de suspension :\n" +
                "* demandeur  peut pas agir a cause force majeure, contrat ou loi\n" +
                "* parties font appel à médiateur/conciliateur\n" +
                "* juge accorde mesure d'instruction avant procès"),
        DisputesItem("aerien","blabla"),
        DisputesItem("international", "international baybee !!!!!"),
        DisputesItem("Causes Spécifiques D'exonération\n","- Convention Varsovie (TR intérieur) prévoit 2 cas d’exonération :\n" +
                "- TR prouve qu'il a pris toutes les mesures pour éviter dommage ou prouve que c'est impossible de les prendre\n" +
                "- Faute de l'ayant droit\n" +
                "- Et c'est tout, tout autre moyen est nul\n")
    )

    data class DisputesItem(val title: String, val details: String)
}