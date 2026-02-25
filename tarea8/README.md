# Pruebas con JUnit y Mockito

## Descripción General

Esta tarea contiene 4 ejercicios que demuestran el uso de **Mockito** para crear pruebas unitarias con objetos simulados (mocks). Cada ejercicio verifica que un servicio interactúe correctamente con sus dependencias.

---

## Estructura del Proyecto

```
test-mockito/
├── ejercicio1/
│   ├── RepositoriUsuarios.java
│   ├── ServicioLogin.java
│   └── ServicioLoginTest.java
├── ejercicio2/
│   ├── ProveedorNotificaciones.java
│   ├── ServicioNotificacion.java
│   └── ServicioNotificacionTest.java
├── ejercicio3/
│   ├── ProveedorDescuentos.java
│   ├── SistemaOrdenes.java
│   └── SistemaOrdenesTest.java
└── ejercicio4/
    ├── RepositoriInventario.java
    ├── Inventario.java
    └── InventarioTest.java
```

---

## Ejercicio 1: Servicio de Login

### Objetivo
Verificar que un servicio de login consulta correctamente al repositorio de usuarios.

### Clases
- **RepositoriUsuarios**: Interfaz que define `existeUsuario(String email)`
- **ServicioLogin**: Servicio que depende de RepositoriUsuarios
- **ServicioLoginTest**: Tests con mocks

### Tests
- `testLoginUsuarioExiste()`: Verifica login exitoso
- `testLoginUsuarioNoExiste()`: Verifica login fallido

### Conceptos Aplicados
- `@Mock`: Crear mock del repositorio
- `@InjectMocks`: Inyectar el mock en el servicio
- `when().thenReturn()`: Configurar comportamiento del mock
- `verify()`: Verificar que el método fue llamado

---

## Ejercicio 2: Servicio de Notificación

### Objetivo
Verificar que un servicio de notificación invoca correctamente al proveedor de notificaciones.

### Clases
- **ProveedorNotificaciones**: Interfaz que define `enviarMensaje(String email, String mensaje)`
- **ServicioNotificacion**: Servicio que depende de ProveedorNotificaciones
- **ServicioNotificacionTest**: Tests con mocks

### Tests
- `testEnviarNotificacionCorrectamente()`: Verifica que el método fue llamado con los parámetros correctos
- `testEnviarMultiplesNotificaciones()`: Verifica múltiples llamadas

### Conceptos Aplicados
- `verify()`: Verificar interacciones
- `times()`: Verificar número de llamadas
- `anyString()`: Comodín para parámetros

---

## Ejercicio 3: Sistema de Órdenes con Descuentos

### Objetivo
Verificar que el sistema de órdenes calcula correctamente el total aplicando descuentos obtenidos del proveedor.

### Clases
- **ProveedorDescuentos**: Interfaz que define `obtenerDescuento(int cantidad)`
- **SistemaOrdenes**: Calcula el total con descuento
- **SistemaOrdenesTest**: Tests con mocks

### Tests
- `testCalcularTotalConDescuento()`: Verifica cálculo con 10% descuento
- `testCalcularTotalSinDescuento()`: Verifica cálculo sin descuento
- `testCalcularTotalConDescuentoGrande()`: Verifica cálculo con 20% descuento

### Conceptos Aplicados
- `assertEquals()`: Validar valores calculados
- `when().thenReturn()`: Retornar valores específicos del mock
- Validación de lógica de negocio

---

## Ejercicio 4: Sistema de Gestión de Inventario

### Objetivo
Verificar que el sistema de inventario elimina productos correctamente e investiga si el producto sigue en el inventario.

### Clases
- **RepositoriInventario**: Interfaz con métodos para existencia y eliminación
- **Inventario**: Sistema que gestiona el inventario
- **InventarioTest**: Tests con mocks

### Tests
- `testEliminarProductoExistente()`: Verifica eliminación exitosa
- `testEliminarProductoNoExistente()`: Verifica que no se elimina si no existe
- `testContineProductoExistente()`: Verifica presencia de producto
- `testContineProductoNoExistente()`: Verifica ausencia de producto

### Conceptos Aplicados
- `verify()`: Verificar llamadas a métodos
- `never()`: Verificar que un método NO fue llamado
- Validación de comportamientos condicionales

---

## Anotaciones Utilizadas

### JUnit 5
- `@Test`: Marca un método como prueba
- `@ExtendWith(MockitoExtension.class)`: Activa Mockito en JUnit 5

### Mockito
- `@Mock`: Crea un objeto simulado (mock)
- `@InjectMocks`: Inyecta los mocks en la clase bajo prueba
- `when().thenReturn()`: Configura el comportamiento esperado
- `verify()`: Verifica que un método fue llamado
- `times(n)`: Especifica el número de veces que debe ser llamado
- `never()`: Verifica que el método NO fue llamado
- `anyString()`: Comodín para cualquier argumento String

---

## Principios Clave

✅ **Aislamiento**: Los mocks simulan las dependencias externas
✅ **Verificación**: Se verifica que el código bajo prueba interactúa correctamente con sus dependencias
✅ **Control**: El comportamiento de las dependencias se controla totalmente
✅ **Rapidez**: Los tests se ejecutan rápido sin bases de datos o servicios reales

---

## Notas Importantes

- Los mocks NO ejecutan código real, solo simulan comportamiento
- Es importante verificar no solo el resultado, sino cómo se alcanzó ese resultado
- Use `verify()` para asegurar que las interacciones ocurren como se espera
- Las interfaces facilitan el mocking (se mockean interfaces, no clases concretas)