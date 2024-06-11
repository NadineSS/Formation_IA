# Formation_IA

L’intelligence artificielle générative a déjà un impact significatif sur le développement informatique. Elle intervient dans des domaines tels que la génération de code, l’écriture de documentation, la création de cas de test et l’optimisation du code.

Son utilisation offre un gain de productivité important dans le développement informatique estimé à 55% par Github Copilot, l'une des premières IA génératives grands public pour le développement informatique.

Bien que ces outils présentent encore des limites tant dans les réponses fournies que sur des questions plus sensibles de sécurité, leur adoption est de plus en plus importante dans le monde informatique.

De plus, les principaux problèmes de ces outils sont déjà en cours de résolution par les équipes proposants ces solutions.

C'est dans ce cadre que cette formation vise à vous sensibiliser à l'usage des ces outils afin de vous fournir toutes les clés de compréhension tant dans leurs bénéfices que dans leurs limites.

Cette formation pratique vous invite à développer un projet Spring-Boot classique afin de découvrir et pratiquer les différents cas d'usages que l'on peut rencontrer avec une IA générative.

Le projet a pour but d'appeler une API de coktails pour préparer aux vacances 😎. 

La formation est divisée en 5 exercices qui vous invite à pratiquer un cas précis détailler dans ce README.

Chaque exercice possède sa branche qu'il faudra checkout avant de commencer.

## 01 - Génération par auto-complétion

Ce premier exercice se concentre sur une fonctionnalité phare des IA génératives de développement, l'auto-complétion automatique dans l'IDE.

Pour commencer n'oubliez pas de checkout la branche 01-generate-with-autocomplete.

La fonctionnalité d'auto-complétion fonctionne de manière transparente dans l'IDE. 

Pour l'expérimenter créez une route /cocktail dans le [CocktailController.java](./src/main/java/com/formation/AI/controller/CocktailController.java).

Commencez par écrire un commentaire décrivant votre besoin comme par exemple : 
    ```// make a route /cocktail with @GetMapping```

Il est également possible d'écrire simplement  le début de la méthode et une proposition devrait apparaître en grisé. 
    
Pour accepter une proposition faites TAB.

Une fois cette première route créée, essayez d'en faire une 'byId', l'IA devrait analyser la route que vous venez de faire afin de vous en proposer une plus rapidement.

## 02 - Génération par chat

Ce second exercice se concentre sur une fonctionnalité qui permet au développeur d'exprimer son besoin à l'IA via le langage naturel.

Pour commencer n'oubliez pas de checkout la branche 02-generate-with-chat.

Dans l'outil IDX, il existe 2 moyens de générer du code via langage naturel.

Le premier est de se mettre dans l'IDE et de faire ``CRTL+i``. Cette commande ouvre une fenêtre de dialogue dans laquelle vous pouvez demander à l'IA ce que vou voulez.

La deuxième solution est l'accès à un chat plus classique en cliquant en haut à droite sur l'étoile. Ce chat permet de discuter avec l'IA en lui demandant de générer du code ou expliquer une erreur par exemple. 

Pour cet exercice vous devez compléter les classes [CocktailController.java](./src/main/java/com/formation/AI/controller/CocktailController.java), [CocktailService.java](./src/main/java/com/formation/AI/service/CocktailService.java) [CocktailRepository.java](./src/main/java/com/formation/AI/repository/CocktailRepository.java) et [CocktailModel.java](./src/main/java/com/formation/AI/model/CocktailModel.java) afin d'appeler .

### Resources

Plusieurs resources sont à disposition pour réaliser cet exercice, tout d'abord le fichier [sample-data.json](./src/main/resources/)