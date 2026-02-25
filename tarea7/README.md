# Tiempo - Pruebas Unitarias con JUnit

## Descripción
Ejercicio de pruebas unitarias utilizando JUnit 5 para validar el comportamiento de una clase `Tiempo` que gestiona intervalos de tiempo en horas, minutos y segundos.

## Estructura del Proyecto
```
tarea7/
├── src/
│   ├── main/java/com/eed/tiempo/
│   │   ├── Tiempo.java
│   │   └── CantidadNegativaException.java
│   └── test/java/com/eed/tiempo/
│       └── TiempoTest.java
├── pom.xml
└── README.md
```

## Requisitos
- Java 11 o superior
- Maven 3.6 o superior
- JUnit 5 (Jupiter)

## Restricciones del Sistema

Según el enunciado, el sistema de gestión de tiempo tiene las siguientes restricciones:

1. **No se admiten períodos de tiempo negativos**
2. **Todos los períodos deben estar normalizados:**
   - Segundos y minutos < 60
   - Horas < 24
3. **Detectar errores cuando se devuelva null**

## Casos de Prueba

### Operación: Constructor
- **testConstructorValido**: Verifica que un constructor con valores válidos crea correctamente un objeto
- **testConstructorHorasNegativas**: Verifica que horas negativas lanzan `CantidadNegativaException`
- **testConstructorMinutosNegativas**: Verifica que minutos negativos lanzan `CantidadNegativaException`
- **testConstructorSegundosNegativas**: Verifica que segundos negativos lanzan `CantidadNegativaException`

### Operación: Getters
- **testGetHoras**: Verifica que `getHoras()` devuelve el valor correcto
- **testGetMinutos**: Verifica que `getMinutos()` devuelve el valor correcto
- **testGetSegundos**: Verifica que `getSegundos()` devuelve el valor correcto

### Operación: Normaliza
- **testNormalizaSegundosMayoresA60**: Verifica que segundos > 60 se normalizan correctamente
- **testNormalizaMinutosMayoresA60**: Verifica que minutos > 60 se normalizan correctamente
- **testNormalizaCombinado**: Verifica que la normalización funciona con múltiples campos desbordados

### Operación: Suma con Tiempo
- **testSumaConTiempo**: Verifica que la suma de dos objetos `Tiempo` es correcta
- **testSumaConTiempoNormalizacion**: Verifica que la suma se normaliza automáticamente

### Operación: Suma con Enteros
- **testSumaConEnterosSimple**: Verifica que la suma con valores enteros funciona sin necesidad de normalización
- **testSumaConEnterosNormalizacion**: Verifica que la suma con valores que requieren normalización funciona correctamente
- **testSumaConEnterosNegativoHoras**: Verifica que sumar horas negativas lanza excepción
- **testSumaConEnterosNegativoMinutos**: Verifica que sumar minutos negativos lanza excepción
- **testSumaConEnterosNegativoSegundos**: Verifica que sumar segundos negativos lanza excepción

### Operación: ToString
- **testToString**: Verifica que el método `toString()` devuelve una representación correcta

## Preparación de Pruebas (@BeforeEach)

Antes de cada prueba se crean dos objetos tiempo:
- `tiempo1`: 2 horas, 30 minutos, 45 segundos
- `tiempo2`: 1 hora, 15 minutos, 20 segundos

```java
@BeforeEach
void setUp() throws CantidadNegativaException {
    tiempo1 = new Tiempo(2, 30, 45);
    tiempo2 = new Tiempo(1, 15, 20);
}
```

## Cómo ejecutar las pruebas

```bash
mvn test
```

O desde tu IDE (Eclipse, IntelliJ, etc.):
- Click derecho en `TiempoTest.java` → Run As → JUnit Test

## Resultados Esperados
Todas las pruebas deben pasar correctamente (17/17).

## Excepciones Personalizadas

- **CantidadNegativaException**: Se lanza cuando se intenta crear un tiempo con valores negativos o se realiza una operación que resultaría en valores negativos

## Cambios Realizados en el Código Original

### 1. **Corrección en método `normaliza()`** (línea 50)
**Problema:** Al normalizar minutos negativos, se sumaba 59 en lugar de 60
```java
// ❌ ANTES
while (this.minutos < 0) {
    this.minutos += 59;
    this.horas--;
}
```

**Solución:**
```java
// ✅ DESPUÉS
while (this.minutos < 0) {
    this.minutos += 60;
    this.horas--;
}
```

Lo mismo para segundos:
```java
// ❌ ANTES
while (this.segundos < 0) {
    this.segundos += 59;
    this.minutos--;
}
```

**Solución:**
```java
// ✅ DESPUÉS
while (this.segundos < 0) {
    this.segundos += 60;
    this.minutos--;
}
```

### 2. **Corrección en método `suma(int, int, int)`** (línea 73)
**Problema:** El método no normalizaba los valores después de sumar, causando que valores > 59 lanzaran excepción
```java
// ❌ ANTES
public void suma(int sumaHoras, int sumaMinutos, int sumaSegundos) throws CantidadNegativaException {
    setHoras(horas + sumaHoras);
    setMinutos(minutos + sumaMinutos);
    setSegundos(segundos + sumaSegundos);
}
```

**Solución:**
```java
// ✅ DESPUÉS
public void suma(int sumaHoras, int sumaMinutos, int sumaSegundos) throws CantidadNegativaException {
    setHoras(horas + sumaHoras);
    setMinutos(minutos + sumaMinutos);
    setSegundos(segundos + sumaSegundos);
    normaliza();
}
```