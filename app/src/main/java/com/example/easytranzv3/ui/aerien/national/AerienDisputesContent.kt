package com.example.easytranzv3.ui.aerien.national

object AerienDisputesContent {
    val DISPUTES = listOf(
        DisputesItem("depart", "- Au niveau national, délai commence le jour ou marchandise a été remise, ou pour perte total, le jour ou la marchandise aurait du être remise"),
        DisputesItem("interruption","- Au niveau national, seul l'action en justice ou le fait que TR reconnaisse sa faute interrompre prescription (lettre recommandé, demande expertise valent que dalle)\n" +
                "- Y a 3 cas de suspension :\n" +
                "* demandeur  peut pas agir a cause force majeure, contrat ou loi\n" +
                "* parties font appel à médiateur/conciliateur\n" +
                "* juge accorde mesure d'instruction avant procès"),
        DisputesItem("aerien","blabla"),
        DisputesItem("Causes Spécifiques D'exonération\n","- Convention Montréal a plusieurs cas :\n" +
                "- Vice propre\n" +
                "- Emballage défectueux\n" +
                "- Guerre\n" +
                "- Acte de l'autorité publique à l'entrée/sortie/transit\n" +
                "- Faute de l'ayant droit\n" +
                "- En cas de retard, TR doit prouver qu'il a pris toutes les mesures et au contraire que c’était impossible de les prendre\n")
    )

    data class DisputesItem(val title: String, val details: String)
}