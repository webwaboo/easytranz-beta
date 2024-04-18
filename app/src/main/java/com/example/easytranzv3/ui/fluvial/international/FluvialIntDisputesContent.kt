package com.example.easytranzv3.ui.fluvial.international

object FluvialIntDisputesContent {
    val DISPUTES = listOf(
        DisputesItem("depart", "- Au niveau national, délai commence le jour ou marchandise a été remise, ou pour perte total, le jour ou la marchandise aurait du être remise"),
        DisputesItem("interruption","- Au niveau national, seul l'action en justice ou le fait que TR reconnaisse sa faute interrompre prescription (lettre recommandé, demande expertise valent que dalle)\n" +
                "- Y a 3 cas de suspension :\n" +
                "* demandeur  peut pas agir a cause force majeure, contrat ou loi\n" +
                "* parties font appel à médiateur/conciliateur\n" +
                "* juge accorde mesure d'instruction avant procès"),
        DisputesItem("Débiteur Du Prix De Transport\n","- CMNI c'est expéditeur qui doit payer, mais si destinataire réclame marchandise c'est lui qui doit payer\n")
    )

    data class DisputesItem(val title: String, val details: String)
}