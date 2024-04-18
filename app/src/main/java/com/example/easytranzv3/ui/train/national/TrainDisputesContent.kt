package com.example.easytranzv3.ui.train.national

object TrainDisputesContent {
    val DISPUTES = listOf(
        DisputesItem("depart", "- Au niveau national, délai commence le jour ou marchandise a été remise, ou pour perte total, le jour ou la marchandise aurait du être remise"),
        DisputesItem("interruption","- Au niveau national, seul l'action en justice ou le fait que TR reconnaisse sa faute interrompre prescription (lettre recommandé, demande expertise valent que dalle)\n" +
                "- Y a 3 cas de suspension :\n" +
                "* demandeur  peut pas agir a cause force majeure, contrat ou loi\n" +
                "* parties font appel à médiateur/conciliateur\n" +
                "* juge accorde mesure d'instruction avant procès"),
        DisputesItem("Débiteur Du Prix De Transport\n","- Soit TR regarder si c'est du port payé (expéditeur) ou port dû (destinataire)\n" +
                "- Si y a rien de précisé il se retourne vers DD\n")
    )

    data class DisputesItem(val title: String, val details: String)
}