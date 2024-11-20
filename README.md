# Genèrics en Java 🎯

## 📄 Descripció - Enunciat de l'exercici

Aquest projecte està format per 5 exercicis que exploren els conceptes de mètodes genèrics en Java:

### Nivell 1 ⭐
#### Exercici 1: NoGenericMethods
Implementa una classe que només pot treballar amb tres elements del mateix tipus, mostrant les limitacions de no usar genèrics.

Crea una classe anomenada NoGenericMethods que emmagatzemi tres arguments del mateix tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres. Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.

#### Exercici 2: GenericMethods
En aquest exercici es demostra la flexibilitat dels mètodes genèrics en acceptar i imprimir tres elements de qualsevol tipus i en qualsevol ordre.

Crea una classe anomenada Persona amb els atributs nom, cognom i edat. Després crea una classe anomenada GenericMethods amb un mètode genèric que accepti tres arguments de tipus genèric. Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut. Al main() de la classe principal, crida el mètode genèric amb diferents tipus de paràmetres.

### Nivell 2 ⭐⭐
#### Exercici 1
L'exercici ensenya a crear un mètode genèric amb la particularitat que un dels seus arguments és d'un tipus específic (no genèric).

Modifica l'exercici anterior de manera que un dels arguments del mètode genèric no sigui genèric.

#### Exercici 2
L'exercici demostra com utilitzar varargs (arguments variables) en un mètode genèric per acceptar una quantitat indefinida de paràmetres.

Modifica l'apartat anterior de manera que els arguments del mètode genèric siguin una llista d'arguments de variable indefinida.

### Nivell 3 ⭐⭐⭐
#### Exercici 1: Telefon
L'exercici ensenya a utilitzar genèrics amb límits (bounds) de dues maneres: un mètode que accepta tipus que implementin la interfície Telefon i un altre que accepta tipus que siguin subclasse de Smartphone, demostrant que el primer només pot accedir als mètodes de la interfície mentre que el segon pot accedir a tots els mètodes de Smartphone.

Per fer aquest exercici necessites una interfície anomenada Telefon i tres classes: Smartphone, Generica i la Principal. La interfície Telefon ha de tenir un mètode anomenat trucar(). La classe Smartphone ha d’implementar Telefon, i a més del mètode trucar(), també ha de tenir el mètode ferFotos(). La classe Generica ha de tenir dos mètodes genèrics, el primer ha de rebre un tipus d’argument limitat per la interfície Telefon i el segon ha de rebre un argument limitat per la classe Smartphone. Des d’aquests dos mètodes crida els mètodes pertinents de Telefon i Smartphone. En el main() de la classe Principal, passa un objecte de la classe Smartphone als dos mètodes genèrics de la classe Generica. El mètode limitat per la interfície Telefon, de la classe Generica, pot cridar al mètode ferFotos()?

## 💻 Tecnologies Utilitzades

- Java SE Development Kit (JDK) 17
- IntelliJ IDEA
- Git
- GitHub

## 📋 Requisits

- Java JDK 17 o superior
- IntelliJ IDEA (Community o Ultimate Edition)
- Git instal·lat al sistema

## 🛠️ Instal·lació

1. Clona el repositori:
```bash
git clone https://github.com/EnricW/1.6-Generics.git
```

2. Obre el projecte amb IntelliJ IDEA:
   - Obre IntelliJ IDEA
   - File -> Open
   - Selecciona la carpeta del projecte
   - Espera que el projecte s'indexi i es configurin les dependències

## ▶️ Execució

1. Navega fins a la classe principal que conté el mètode main
2. Fes clic dret sobre la classe
3. Selecciona "Run Main.main()"
