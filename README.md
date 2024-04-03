# Projet Hospital

## Description
Ce projet est une application de gestion hospitalière développée en Java, utilisant le framework Spring Boot et JPA (Java Persistence API). Il permet la gestion des patients, des médecins, des consultations et des rendez-vous au sein d'un établissement de santé.

## Structure du Projet
- **Entities**: Ce répertoire contient les classes Java qui représentent les entités métier de l'application, telles que Patient, Medecin, Consultation et RendezVous.
- **Repositories**: Ce répertoire contient les interfaces qui définissent les méthodes de base pour interagir avec la base de données pour chaque entité. Ces interfaces sont implémentées par Spring Data JPA.

## Fonctionnalités
- Enregistrement des patients avec leurs informations personnelles.
- Enregistrement des médecins avec leurs spécialités.
- Programmation et suivi des consultations médicales.
- Gestion des rendez-vous entre les patients et les médecins.

## Installation
1. Assurez-vous d'avoir Java JDK installé sur votre système.
2. Clonez ce dépôt GitHub sur votre machine locale.
3. Ouvrez le projet dans votre IDE préféré (ex: IntelliJ IDEA, Eclipse).
4. Assurez-vous d'avoir Maven installé pour gérer les dépendances du projet.
5. Exécutez la classe `HospitalApplication` pour démarrer l'application.

## Utilisation
Une fois l'application démarrée, vous pouvez accéder aux fonctionnalités via une interface utilisateur ou en manipulant les données directement dans le code. Les entités sont automatiquement persistées dans la base de données grâce à JPA.

## Développement
Ce projet utilise Spring Boot pour gérer l'architecture de l'application et faciliter le développement. JPA est utilisé pour la couche de persistance afin d'interagir avec la base de données relationnelle. Les principales classes à modifier se trouvent dans les packages `entities` et `repositories`.

