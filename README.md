# Java Polymorphism Example

A small Java program that demonstrates both kinds of **polymorphism**: compile-time (overloading) and runtime (overriding).

## What It Demonstrates

### 1. Compile-time polymorphism (method overloading)

`AnimalShape` has two `sound` methods with different parameters. Java chooses which one to call when the code is compiled.

```java
void sound()                  { ... }
void sound(String animalType) { ... }
```

### 2. Runtime polymorphism (method overriding)

`CatShape` extends `AnimalShape` and overrides `sound()`. A parent-type variable holds a child object, and Java chooses the method at runtime (dynamic method dispatch).

```java
AnimalShape myCat = new CatShape();
myCat.sound();   // runs CatShape's version
```

## Output

```
Animal makes a sound
Dog makes a specific sound
Cat meows (Runtime Polymorphism)
```

| Call | Version used | Type |
|------|--------------|------|
| `a.sound()` | `AnimalShape.sound()` | Overloading |
| `a.sound("Dog")` | `AnimalShape.sound(String)` | Overloading |
| `myCat.sound()` | `CatShape.sound()` | Overriding |

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac PolymorphismCharacteristics.java
java PolymorphismCharacteristics
```

## Project Structure

```
.
├── PolymorphismCharacteristics.java
└── README.md
```

## Next Steps

- Add more subclasses, such as `DogShape`, each with its own `sound()`
- Put different animals in one `AnimalShape[]` array and call `sound()` on each
- Compare with using an interface
