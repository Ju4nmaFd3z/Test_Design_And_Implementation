# Cuenta Bancaria - Pruebas Unitarias con JUnit

## Descripción
Ejercicio de pruebas unitarias utilizando JUnit 5 para validar el comportamiento de una clase `Cuenta` que gestiona operaciones bancarias básicas: ingresos, reintegros y transferencias entre cuentas.

## Estructura del Proyecto
```
tarea6/
├── src/
│   ├── main/java/com/ejemplo/demo/
│   │   ├── Cuenta.java
│   │   ├── CantidadNegativaException.java
│   │   ├── ReintegroException.java
│   │   └── TransferenciaException.java
│   └── test/java/com/ejemplo/demo/
│       └── CuentaTest.java
├── pom.xml
└── README.md
```

## Requisitos
- Java 11 o superior
- Maven 3.6 o superior
- JUnit 5 (Jupiter)

## Restricciones del Sistema

Según el enunciado, el sistema bancario tiene las siguientes restricciones:

1. **No se admiten cuentas con saldo negativo**
2. **No puede realizarse un ingreso de una cantidad negativa**
3. **Para realizar una transferencia debe haber dinero suficiente en la cuenta origen**

## Casos de Prueba

### Operación: Ingreso
- **testIngresoPositivo**: Verifica que un ingreso válido incrementa el saldo correctamente
- **testIngresoNegativo**: Verifica que un ingreso negativo lanza `CantidadNegativaException`

### Operación: Reintegro
- **testReintegroValido**: Verifica que un reintegro válido decrementa el saldo correctamente
- **testReintegroSinSaldoSuficiente**: Verifica que un reintegro sin saldo suficiente lanza `ReintegroException`

### Operación: Transferencia
- **testTransferenciaValida**: Verifica que una transferencia válida decrementa la cuenta origen e incrementa la cuenta destino
- **testTransferenciaSinSaldoSuficiente**: Verifica que una transferencia sin saldo suficiente lanza `TransferenciaException`

## Preparación de Pruebas (@BeforeEach)

Antes de cada prueba se crean dos cuentas:
- `cuenta100`: cuenta con saldo inicial de 100€
- `cuenta200`: cuenta con saldo inicial de 200€
```java
@BeforeEach
void setUp() throws Exception {
    cuenta100 = new Cuenta(100);
    cuenta200 = new Cuenta(200);
}
```