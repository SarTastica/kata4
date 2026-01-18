Kata 4: Arquitectura MVC
> **El reto:** *Separar lo que se ve de lo que se calcula.*

Integramos la visualización gráfica con **JFreeChart**. La clave es la implementación estricta del patrón **Modelo-Vista-Controlador**:
* **Model:** Los datos.
* **View:** El gráfico de barras.
* **Control:** El orquestador que conecta ambos sin que se conozcan entre sí.
