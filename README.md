# SAFRAN

**Safran/Optifood** est un projet créé lors de la semaine de l'innovation.

Ce projet à pour but d'aider l'utilisateur à gérer ses stocks dans sa cuisine et de rendre ce stock accessible sur smartphone.
Il est composé d'un bloc balance (pour mesurer la masse des produits), d'un écran tactile pour la gestion du stock ainsi que d'une caméra pour scanner les tickets de caisse.

## 1. Fonction principale

**Gestion de stock :**

* Ajouter/Supprimer un élément du stock
	* Scanner les codes barres
	* Ajouter manuellement le produit
* Modifier la quantité d'aliment (à l'unité ou en fonction de la masse)
* Consulter son stock sur un appareil mobile (smartphone)


## 2. Contraintes

* Adaptabilités dans la cuisine 
	* Incrustation
	* Superposition au plan de travail
* Mesure de la masse (0 -> 5 kg)
* Connection à Internet
* Résister aux aléas de la cuisine


## 3. Fonctions complémentaires pouvant être retenues

* Suggestions de recettes en fonction du stock et des goûts de l'utilisateur
* Création et partage de recettes par les utilisateurs
* Ajout du régime alimentaire (sans gluten, ...)
* Reconnaissance vocale (SR)
* Text-To-Speech (TTS)


## 4. Matériel physique

### 4.1. Balance

* Capteurs de pression
* Affichage LED
* Port pour communication avec la borne

### 4.2. Borne

* Micro-ordinateur (Raspberry, ...)
* Ecran tactile 7"
* Pins/Connecteurs pour récupérer la masse mesurée par la balance
* Caméra (Scanner les codes barres des produits)
* Connection à Internet (Wifi || Ethernet)
* Micro

## 5. Pistes logiciel

* Application serveur pour la borne
	* Nouvel OS -> Permet une meilleur optimisation mais plus complexe et plus lent à mettre en place
	* Serveur WEB
* Application mobile : Android
* Base de données d'aliments: *Open Food Fact*