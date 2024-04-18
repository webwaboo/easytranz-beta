package com.example.easytranzv3.ui.routier.citerne

import android.app.Application
import android.provider.Settings.Global.getString
import com.example.easytranzv3.R
import com.example.easytranzv3.ui.routier.general.RoutierGeneralDisputesContent

object RoutierCiterneDisputesContent {
    val DISPUTES = listOf(
        DisputesItem("depart", "- Au niveau national, délai commence le jour ou marchandise a été remise, ou pour perte total, le jour ou la marchandise aurait du être remise"),
        DisputesItem("interruption","- Au niveau national, seul l'action en justice ou le fait que TR reconnaisse sa faute interrompre prescription (lettre recommandé, demande expertise valent que dalle)\n" +
                "- Y a 3 cas de suspension :\n" +
                "* demandeur  peut pas agir a cause force majeure, contrat ou loi\n" +
                "* parties font appel à médiateur/conciliateur\n" +
                "* juge accorde mesure d'instruction avant procès"),
        DisputesItem("citerne", "- Au niveau national, délai commence le jour ou marchandise a été remise, ou pour perte total, le jour ou la marchandise aurait du être remise")

    )

    data class DisputesItem(val title: String, val details: String)
}