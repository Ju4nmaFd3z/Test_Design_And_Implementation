# Tarea 1: Creación de casos de prueba

## 📋 Intro

Este documento contiene todos los casos de prueba para una aplicación de calculadora simple que realiza operaciones de suma, resta, multiplicación y división con números enteros.

Total de casos de prueba: 20 casos base + 10 casos adicionales propuestos = 30 casos

---

## Casos Base

### SUMA

| ID | Descripción | Entrada | Resultado Esperado |
|---|---|---|---|
| TC-SUMA-01 | Suma de dos números positivos | 5 + 10 | 15 |
| TC-SUMA-02 | Suma de número positivo y negativo | 20 + (-8) | 12 |
| TC-SUMA-03 | Suma de número con cero | 7 + 0 | 7 |
| TC-SUMA-04 | Suma de números extremos (máximo) | 2147483647 + 1 | Error/Desbordamiento |
| TC-SUMA-05 | Suma con entrada inválida | 5 + a | Error: Entrada no válida |

### RESTA

| ID | Descripción | Entrada | Resultado Esperado |
|---|---|---|---|
| TC-RESTA-01 | Resta de dos números positivos | 20 - 8 | 12 |
| TC-RESTA-02 | Resta de número negativo | 15 - (-5) | 20 |
| TC-RESTA-03 | Resta de cero | 25 - 0 | 25 |
| TC-RESTA-04 | Resta de números extremos (mínimo) | -2147483648 - 1 | Error/Desbordamiento |
| TC-RESTA-05 | Resta con entrada inválida | 10 - x | Error: Entrada no válida |

### MULTIPLICACIÓN

| ID | Descripción | Entrada | Resultado Esperado |
|---|---|---|---|
| TC-MULT-01 | Multiplicación de dos números positivos | 6 × 7 | 42 |
| TC-MULT-02 | Multiplicación de número positivo y negativo | 8 × (-4) | -32 |
| TC-MULT-03 | Multiplicación por cero | 100 × 0 | 0 |
| TC-MULT-04 | Multiplicación de números extremos | 100000 × 100000 | 10000000000 o Error |
| TC-MULT-05 | Multiplicación con entrada inválida | 3 × ! | Error: Entrada no válida |

### DIVISIÓN

| ID | Descripción | Entrada | Resultado Esperado |
|---|---|---|---|
| TC-DIV-01 | División de dos números positivos | 30 ÷ 5 | 6 |
| TC-DIV-02 | División de positivo entre negativo | 20 ÷ (-4) | -5 |
| TC-DIV-03 | División entre uno | 45 ÷ 1 | 45 |
| TC-DIV-04 | División por cero (ERROR CRÍTICO) | 10 ÷ 0 | Error: No se puede dividir entre cero |
| TC-DIV-05 | División con entrada inválida | 7 ÷ % | Error: Entrada no válida |

---

## Casos Adicionales

Escenarios adicionales para cobertura más exhaustiva:

| ID | Descripción | Entrada | Resultado Esperado |
|---|---|---|---|
| TC-ADIC-01 | División con resultado decimal | 7 ÷ 2 | 3 o 3.5 (según implementación) |
| TC-ADIC-02 | Operaciones en cadena | 5 + 3 - 2 = | 6 o Error |
| TC-ADIC-03 | Presionar igual sin segundo operando | 10 + = | Error o 20 (suma consigo mismo) |
| TC-ADIC-04 | Resta consigo mismo | 7 - 7 | 0 |
| TC-ADIC-05 | Botón Clear/Limpiar | [Operación] → Clear | Pantalla vacía, estado reiniciado |
| TC-ADIC-06 | Números con muchos dígitos | 123456789 + 987654321 | 1111111110 |
| TC-ADIC-07 | Resta resultando en negativo | 5 - 20 | -15 |
| TC-ADIC-08 | Multiplicación de dos negativos | (-6) × (-4) | 24 |
| TC-ADIC-09 | División de dos negativos | (-20) ÷ (-4) | 5 |
| TC-ADIC-10 | Entrada de número decimal | 5 + 3.5 | Error o Redondeo a entero |

---

### Tipos de Escenarios Cubiertos

✅ Números positivos  
✅ Números negativos  
✅ Operaciones con cero  
✅ Números extremos / Desbordamiento  
✅ Entradas inválidas (letras, símbolos)  
✅ **División por cero (ERROR CRÍTICO)**  
✅ Operaciones especiales (cadena, clear, decimales)  

### Casos Críticos

🔴 **TC-DIV-04** - División por cero  
🟡 **TC-SUMA-04, TC-RESTA-04, TC-MULT-04** - Desbordamiento de enteros  
🟡 **TC-ADIC-02** - Operaciones en cadena  
