Description
Le projet "Gestion de Stock" est une application destinée à la gestion efficace du stock pour un magasin de vente de produits informatiques. L'application permet de gérer les produits, les catégories, les commandes et les lignes de commande, facilitant ainsi le suivi des ventes et des inventaires.

Technologies Utilisées
Java : Langage de programmation principal utilisé pour le développement de l'application.
Hibernate : Framework pour la gestion de la persistance des données via JPA.
MySQL : Système de gestion de base de données relationnelle pour stocker les informations des produits et des commandes.
JDBC : API Java pour interagir avec la base de données.
Structure du Projet
A. Couche Persistance
Classes Entités : Développées dans le package ma.projet.classes, elles représentent les objets de la base de données.
Fichier de Configuration : hibernate.cfg.xml est créé dans le package ma.projet.config pour configurer la connexion à la base de données.
Classe HibernateUtil : Située dans le package ma.projet.util, elle permet de créer une instance de SessionFactory.
B. Couche Service
Interface Générique IDao : Définie dans le package ma.projet.dao, elle fournit les méthodes de base pour l'accès aux données.
Classes Services :
ProduitService : Gère les opérations liées aux produits.
CategorieService : Gère les opérations liées aux catégories.
CommandeService : Gère les opérations liées aux commandes.
LigneCommandeService : Gère les opérations liées aux lignes de commande.


https://github.com/user-attachments/assets/1ec67a72-8713-4130-b3aa-077fd385dfb5

