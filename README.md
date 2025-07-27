# 🚀 Pipeline en Java con Spring Boot

Este proyecto es un ejemplo práctico de implementación del patrón **Pipeline** usando **Java 17**, **Spring Boot 3.5** y **Lombok**.

---

## 🧠 Descripción

El patrón Pipeline permite procesar un objeto a través de una serie de pasos encadenados, donde cada paso recibe un objeto, lo procesa y pasa el resultado al siguiente paso. Este patrón es ideal para flujos de trabajo donde varias transformaciones o validaciones deben aplicarse de forma ordenada.

📦 En este proyecto se procesa un objeto `Pedido` que contiene una lista de `Items`, y se pasa por pasos como validación, cálculo del total y aplicación de descuentos.

---

## Tecnologías usadas

- ☕ Java 17
- 🌱 Spring Boot 3.5.4  
- 🧰 Lombok  
- 📦 Maven
  
---

## 📁 Estructura del proyecto

```bash
src/
└── main/
├── java/com/example/patron_pipeline/
│ ├── controller/ # Controladores REST
│ ├── model/ # modelos de entidades (Pedido, Item)
│ ├── pipeline/ # Implementación genérica del pipeline
│ ├── pipeline/steps/ # Pasos concretos del pipeline
│ ├── services/ # Lógica de negocio y armado del pipeline
│ └── PatronPipelineApplication.java
└── resources/
└── application.properties
```

---

## ▶️ Cómo ejecutar

1. 🧬 Cloná el repositorio y abrilo con IntelliJ IDEA.
2. ✅ Verificá que tengas el plugin de Lombok y los procesadores habilitados.
3. 🏃 Ejecutá la clase `PatronPipelineApplication`.
4. 🧪 Probá el endpoint:

```bash
POST http://localhost:8080/pedidos/process
Content-Type: application/json
```
Con un body JSON como:

```json
{
  "cliente": "Jorge",
  "items": [
    { "nombre": "Mouse", "cantidad": 2, "precioUnidad": 1500 },
    { "nombre": "Teclado", "cantidad": 1, "precioUnidad": 3000 }
  ]
}
```

🔍 ¿Cómo funciona?

📥 `PedidoController` recibe la solicitud y la delega al PedidoService.

🧠  `PedidoService` crea y ejecuta un pipeline compuesto por varios pasos:

  - ✅ `ValidarPedido`: valida que el pedido tenga cliente e ítems.

  - 💰 `CalcularTotal`: calcula el total sumando precio * cantidad.

  - 🎁 `AplicarDescuento`: aplica un 10% de descuento si el total es mayor a 10.000.

Cada paso modifica el objeto Pedido y lo pasa al siguiente.

El resultado final es retornado como respuesta.
