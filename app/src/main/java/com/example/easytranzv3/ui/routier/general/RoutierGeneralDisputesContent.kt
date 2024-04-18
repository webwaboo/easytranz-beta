package com.example.easytranzv3.ui.routier.general

import com.example.easytranzv3.R

object RoutierGeneralDisputesContent {
    val DISPUTES = listOf(
        DisputesItem("prescription","1an (5 ans en cas de dol)"),
        DisputesItem("Départ Du Délai De Prescription", "- Au niveau national, délai commence le jour ou marchandise a été remise,\n" +
                "ou pour perte total, le jour ou la marchandise aurait du être remise"),
        DisputesItem("Interruption/ Suspension Du Délai De Prescription","- Au niveau national, seul l'action en justice ou le fait que TR reconnaisse sa faute interrompre prescription (lettre recommandé, demande expertise valent que dalle)\n" +
                "\n- Y a 3 cas de suspension :\n" +
                "* demandeur  peut pas agir a cause force majeure, contrat ou loi\n" +
                "* parties font appel à médiateur/conciliateur\n" +
                "* juge accorde mesure d'instruction avant procès"),
        DisputesItem("Forclusion","3 jours"),
        DisputesItem("Choix Du Véhicule","TR devrait choisir mais Exp peut designer un véhicule"),
        DisputesItem("Exécution Du Chargement","MOINS DE 3 TONNES:\n" +
                "   TR s'occupe de charger, il est présumé responsable même si l’expéditeur l'aide\n" +
                "\nPLUS DE 3 TONNES:\n" +
                "   Exp s'occupe de charger, TR est responsable que marchandise est chargé même si il a aidé\n"),
        DisputesItem("Exécution Du Déchargement", "MOINS DE 3 TONNES:\n" +
                "TR s'occupe de décharger, il est présumé responsable même si le destinataire l'aide\n"+
                "\nPLUS DE 3 TONNES:\n" +
                "Dest s'occupe de décharger, TR est responsable que quand marchandise est déchargé même si il a aidé\n"),
        DisputesItem("Dommage Survenue Durant (de)chargement\n","La faute incombe au responsable du chargement\n"),
        DisputesItem("Délai Chargement/ Déchargement\n","MOINS DE 3 TONNES:\n" +
                "   <100kg+moins 20 colis = 15min\n" +
                "   Autres cas = 30min\n" +
                "\nPLUS DE 3 TONNES:\n" +
                "   -envoi entre 3-10t ET moins 30m3:\n"+
                "       *RDV respecté = 1h\n" +
                "       *plage respecté= 1h30\n" +
                "       *autres cas= 2h\n" +
                "\n   -envoi plus 10t OU >30m3:\n" +
                "       *RDV respecté = 1h\n" +
                "       *plage respecté= 2h\n" +
                "       *autres cas= 3h\n"+
                "\n   RDV= jour et heure précise, si retard 30min, on allonge temps de 30min\n" +
                "   Au-delà, heure « autres cas »+15min\n" +
                "   Plage horaire= amplitude max de 4h\n" +
                "   Si Transporteur arrive en avance, durée commence qu'a heure du RDV\n"),
        DisputesItem("Délai Anormal D'attente\n","MOINS DE 3 TONNES\n" +
                "Pas de délai anormal, c'est empêchement a la livraison directe\n" +
                "\nPLUS DE 3 TONNES\n " +
                "max 24h, puis empêchement à la livraison\n"),
        DisputesItem("Refus De Chargement\n","en cas de refus de chargement, indemnisation égale au prix du transport (si pas de sa faute ou force majeure)\n"),
        DisputesItem("Contrôle Au Chargement\n","si défaut apparent : faire des réserves\n" +
                "\nSi défaut non-apparent : possibilité de prouver a posteriori\n"),
        DisputesItem("Délai D'exécution Du Transport\n" ,"Délai Transport : Commence À 0h Le Lendemain De L'envoi\n" + "1jour/450km\n"),
        DisputesItem("Livraison : 8h Le Matin Après Délai Transport\n","Villes>5000 habitants + sous préfecture Ou envoi > 3 tonnes\n" +
                "1 jour\n" +
                "\nVilles < 5000 habitant\n" +
                "Envoi < 3 tonnes\n"),
        DisputesItem("En Cas De Retard\n","En cas de retard la victime doit faire une mise en demeure  :\n" +
                "envoyer un mail au TR lui sommant de livrer et lui réclamant des dommages et intérêts pour le retard (ils seront calculé à partir de mise en demeure)\n"),
        DisputesItem("Défaillance Du Transporteur A L'enlèvement\n","- Si y avait RD, TR vient pas + pas de news  : Exp cherche nouveau TR après délai 2h\n" +
                "*Si y avait RDV, TR vient mais prévient du retard  : retard < 2h= Exp doit attendre, mais retard => 2h Exp peut chercher nouveau TR\n" +
                "*Si y avait pas de RDV, Exp peut rechercher nouveau TR qu'après «  délai raisonnable  » ... lol\n"),
        DisputesItem("Modifications En Cours De Transport\n","- ... « donneur d'ordre dispose de la marchandise jusqu'à ce que destinataire fasse valoir ses droits » ... donc, si destinataire fait le boss, il a juste à faire un mail\n" +
                "*TR est obligé de se conformer sauf s'il prouve que c’est contraire à engagements antérieurs\n" +
                "*On change prix transport et la vie continue\n"),
        DisputesItem("En Cas D'empêchement Au Transport\n","*Y a problème = appelle DD. Si pas de réponse débrouille-toi pour conserver/acheminer marchandise à bon port MAIS pas droit livrer autre part sans ordre DD !\n" +
                "*Si c'est pas faute TR, DD rembourse tous les frais\n" +
                "*Si c'est à cause force majeur, TR peut se faire rembourser trajet déjà effectué\n"),
        DisputesItem("Modalités De Livraison\n","Pour marchandise générale, /nsi marchandise est livrée dans locaux TR, un avis d'arrivée est envoyé à destinataire qui à 5 jours pour chercher la marchandise\n" +
                "\n*TR doit vérifier destinataire et peut pas changer destinataire (sauf si empêchement livraison)\n" +
                "*lieu de livraison pour envoi < 3t = rue, seuil magasin, pied du véhicule\n" +
                "envoi > 3t = enceinte de établissement/chantier\n" +
                "*Si destinataire est pas la pour livraison, TR peut livrer QUE s'il a fait la demande avant, et que ça été acceptée, sinon queudechi\n"),
        DisputesItem("Signalement Des Dommages À La Livraison\n","Destinataire doit vérifier la marchandise à réception\n" +
                "même si TR fait le chaud en disant qu'il est presser, ta gueule c'est du temps de mise à disposition,  si t'es pas content je refuse la marchandise.\n" +
                "On peut prévoir de retarder la livraison pour laisser le destinataire vérifier, mais si le chauffeur est plus la... c'est tout sur sa gueule\n" +
                "si on  détecte dommage lors de verif,  on peut directement entamer la présomption de responsabilité du TR avec la réserve (bien détaillé, hein ! « manquant », « sous réserve de déballage »  ça vaut rien !\n" +
                "En transport national, c'est recommandé de marquer les réserves sur LDV de destinataire ET Transporteur, plus signature, cachet date/heure\n"),
        DisputesItem("Signalement Des Dommages Après Livraison\n","- Responsabilité TR fini si dans les 3 jours ouvrables, destinataire a pas fait de protestation motivée (perte partielle/ avarie)\n" +
                "- Si TR accepte réserves (clair, net, précises), destinataire a pas besoin de les confirmer via écrit\n" +
                "- MAIS si destinataire a pas fait de réserves/sont pourries/TR a contesté, il FAUT envoyer protestation motivée, sinon y a forclusion et plus responsabilité TR!\n" +
                "- Si tu envois protestation APRES LIVRAISON,  y a plus présomption responsabilité, donc c'est au destinataire de prouver lien de causalité\n" +
                "- Demande expertise judiciaire équivaut à protestation motivé et pas d'autres formalité\n"),
        DisputesItem("En Cas D'empêchement À La Livraison\n","- Demander instruction au DD/expéditeur (y a délai selon contrat-type)\n" +
                "- Se conformer aux instructions et facturer si besoin est\n" +
                "- TR envoi avis de souffrance pour demander instruction\n" +
                "- Si envoi < 3t TR doit laisser avis de passage (livraison à domicile) ou avis d'arrivée (livraison dans locaux TR)\n"),
        DisputesItem("En Cas De Laissé-Pour-Compte\n","- C'est une perte totale, TR devra indemniser selon règle propre au contrat applicable\n" +
                "- TR peut la vendre/ détruire mais il est pas proprio donc ayant droit peut contrôler modalité de vente ou imposer destruction\n" +
                "- Pour routier national, si marchandise est détruite à demande de ayant droit, indemnité est réduit de 1/3\n"),
        DisputesItem("Débiteur Du Prix De Transport\n","- Soit TR regarder si c'est du port payé (expéditeur) ou port dû (destinataire)\n" +
                "- Si y a rien de précisé il se retourne vers DD\n"),
        DisputesItem("L'exception D'inexécution\n","- Mécanisme général du droit des contrats, utilisable par n'importe quel créancier\n" +
                "- Ça consiste à pas exécuter le contrat tant prix est payé\n" +
                "- Mais c'est chaud en fait, tu peux pas demander règlement à l’enlèvement...\n" +
                "- Donc du coup, c'est plus : tu refuses le chargement tant que les anciennes factures sont pas payé\n" +
                "- Contrat est suspendu mais une fois facture payé, on reprend expédition\n"),
        DisputesItem("Le Droit De Rétention\n","- TR grade en otage marchandise, tant que facture sont pas payé\n" +
                "- Mais il doit garder marchandise en bon état\n" +
                "- Et ça risque de ruiner relation commercial avec DD / destinataire... mais bon entre travailler à perte ou récupérer un peu de thune\n"),
        DisputesItem("Le Privilège Du Transporteur\n","- TR peut réclamer créances en priorité par rapport aux autres créanciers\n" +
                "- Et ça concerne toutes les créances liée au transport même les anciennes\n" +
                "- Il peut réclamer ça au DD, expéditeur réel ou destinataire\n" +
                "- Par contre, faut que propriétaire de cam retenue a l'instant présent soit aussi impliqué dans les anciens transport\n" +
                "- Et TR peut demander au juge qu'on lui donne la marchandise, elle sera évalué par un expert  et il pourra se faire rembourser avant les autres\n" +
                "- Ça marche pour tous les modes de transport sauf le maritime\n"),
        DisputesItem("L'action Directe En Paiement\n","- TR peut demander à expéditeur ou destinataire de le payer, que ce soit le « débiteur naturel » ou pas (à eux de démerder après)\n" +
                "- Mais ça marche pas pour le déménagement, impossible de demander au consommateur de repayer le prix\n" +
                "- Si expéditeur veut échapper à l'action directe, il doit prouver que sous traitance était interdite et que sous-traitant le savez, sinon il doit payer TR principal ET sous-traitant\n" +
                "- Si prestataire logistique veut échapper à action directe, il doit marquer « pour le compte de... » sur LDV, sinon c'est lui le vrai destinataire...\n" +
                "- C'est applicable pour routier national et international si droit français s'applique\n"),
        DisputesItem("Révision Du Prix Du Transport *\n","- Si contrat mentionne expressément les charges  de carburant comprises dans prix transport, le prix est révisé automatiquement pour couvrir une éventuelle variation du prix des carburant entre date négociation et date exécution. Facture doit mentionner ces charges\n" +
                "- Si contrat mentionne pas part charge carburant, faut utiliser indice publiés par le comité national routier\n" +
                "- Non respect de ces dispositions = 15 000€ d'amende max\n"),
        DisputesItem("Tribunal Compétent\n","- Compétence matérielle : le tribunal commercial sera celui qui est compétent si demandeur est commerçant. Sinon,voir une autre juridiction civile selon montant en jeu\n" +
                "- Compétence territoriale : c'est tribunal du domicile défendeur\n" +
                " - Mais demandeur peut choisir celui lieu exécution/livraison\n" +
                "- On peut prévoir des clauses attributives pour choisir tribunal, mais elles sert à rien si défendeur est non-commerçant\n"),
        DisputesItem("Parties À L'action\n","- Au niveau national, Exp et Dest peuvent lancer procédure contre TR réel, même si c'est Commissionnaire qui s'en occupe et même si nom sous-traitant apparaît pas sur LDV\n" +
                "- En droit français, chacun des TR successif peut être attaqué\n" +
                "- Assureur qui a indemnisé le dommage peut aussi attaqué TR\n" +
                "en cas de dommage, transporteur peut rechercher le partage de responsabilité avec expéditeur\n"),
        DisputesItem("Exonération Via Force Majeur (pour Perte, Avarie Ou Retard)\n","- Force majeure doit être imprévisible, irrésistible et extérieur, mais pour l'utiliser c'est coup de poker\n"),
        DisputesItem("Exonération Via Vice Propre (pour Avarie)\n","- Défaut inhérent à la marchandise\n" +
                "- Attention fragilité marchandise, manque d'emballage sont pas des vices\n" +
                "- En revanche, fruit trop mature, marchandise déjà décongelé, animaux déjà malade avant chargement, évaporation... peuvent être des moyens d’exonération\n" +
                "- ATTENTION freinte de route (=tolérance de perte du à la nature de la cam) existe pas en droit français\n"),
        DisputesItem("Exonération Via Faute Du Cocontractant (pour Perte, Avarie Ou Retard)\n","- Faute de Exp ou Dest comme :\n" +
                "information erronée ou incomplète sur nature marchandise, mauvaise préparation marchandise, mauvais chargement/arrimage marchandise... mais faut que défaut soit non-apparent\n"),
        DisputesItem("Recours Du Transporteur Contre Son Sous-Traitant\n","- TR principal peut se retourner contre sous-traitant s'il prouve que dommage a eu lieu pendant sa tournée\n" +
                "- Les TR successifs peuvent s’exonérer si y a réserves a enlèvement et livraison\n"),
        DisputesItem("Indemnisation\n","- Réparation intégral est très rare, souvent y a des plafonds pour limiter montant\n" +
                "- Y a plafond pour contrat-type mais ils peuvent être remplacé par TR, ou par DD via déclaration de valeur (à inscrire sur LDV + majoration du prix de transport)\n" +
                "- Et si Exp veut changer indemnisation pour retard, c'est une déclaration d’intérêt spéciale\n")

    )


    data class DisputesItem(val title: String, val details: String)

}