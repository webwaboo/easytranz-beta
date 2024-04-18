package com.example.easytranzv3.ui.routier.tdirigee

import com.example.easytranzv3.R

object RoutierTdirigeeDisputesContent {
    val DISPUTES = listOf(
        DisputesItem("depart", "- Au niveau national, délai commence le jour ou marchandise a été remise, ou pour perte total, le jour ou la marchandise aurait du être remise"),
        DisputesItem("interruption","- Au niveau national, seul l'action en justice ou le fait que TR reconnaisse sa faute interrompre prescription (lettre recommandé, demande expertise valent que dalle)\n" +
                "- Y a 3 cas de suspension :\n" +
                "* demandeur  peut pas agir a cause force majeure, contrat ou loi\n" +
                "* parties font appel à médiateur/conciliateur\n" +
                "* juge accorde mesure d'instruction avant procès"),
        DisputesItem("indivisble","blabla"),
        DisputesItem("Tdirigiee", "blabla")

    )


    data class DisputesItem(val title: CharSequence?, val details: String)
}