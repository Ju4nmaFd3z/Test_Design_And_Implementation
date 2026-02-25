# Calculadora - Pruebas Unitarias con JUnit

## Descripción
Ejercicio de pruebas unitarias utilizando JUnit 5 para validar el comportamiento de una clase `Calculadora` que implementa operaciones básicas: suma, resta, multiplicación y división.

## Estructura del Proyecto
```
tarea5/
├── src/
│   ├── main/java/com/ejemplo/demo/
│   │   └── Calculadora.java
│   └── test/java/com/ejemplo/demo/
│       └── CalculadoraTest.java
├── pom.xml
└── README.md
```

## Requisitos
- Java 11 o superior
- Maven 3.6 o superior
- JUnit 5 (Jupiter)

## Casos de Prueba

### Operaciones Básicas
- **testSumar**: Verifica que 5 + 3 = 8
- **testRestar**: Verifica que 10 - 4 = 6
- **testMultiplicar**: Verifica que 6 × 7 = 42
- **testDividir**: Verifica que 20 ÷ 4 = 5

### Casos Especiales
- **testDividirPorCero**: Verifica que dividir entre cero lanza `ArithmeticException`