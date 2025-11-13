Home Screeem
📱 Descripción General

Activity Images es una aplicación móvil desarrollada con Jetpack Compose (Kotlin) que muestra una galería de los mejores futbolistas del mundo.
Permite visualizar sus imágenes, descripciones y navegar entre pantallas mediante un sistema de navegación

Jetpack Compose para la interfaz de usuario declarativa.
Navigation Compose para la gestión de rutas y pantallas.


Funcionalidades Principales
Pantalla Home (HomeScreen)

Muestra un carrusel horizontal (LazyRow) con los mejores futbolistas del mundo.
Cada elemento incluye:
Imagen con esquinas redondeadas (RoundedCornerShape(16.dp)).
Nombre o posición en el ranking.
Al hacer clic en un jugador, navega a la pantalla de detalles


Pantalla Detalle (DetailsScreen)
Muestra información más completa sobre el futbolista seleccionado:
Imagen ampliada.
Descripción detallada.
Botón para regresar a la pantalla anterior.
Implementa navegación dinámica mediante argumentos (teamId).

Pantalla de Configuración (SettingsScreen)
Accesible desde el icono de engranaje (Settings) en la barra superior.
Muestra opciones o información general del sistema.
Incluye botón de regreso.

Gráfico de navegación (AppNavGraph.kt)
Define el inicio en HomeScreen.
Usa argumentos para DetailsScreen.
Implementa botones de regreso (onBack()).

Repositorio de Datos

TeamRepository contiene una lista estática de objetos Team, simulando una base de datos.
Cada futbolista tiene:
id: identificador único.
name: texto mostrado en pantalla.
imageResId: referencia a la imagen en /res/drawable.
description: texto explicativo o biografía.

Flujo de Uso
El usuario abre la aplicación → se carga la pantalla Home.
En el carrusel, toca la imagen de un jugador → se abre la pantalla Detalle.
En los detalles, puede leer más información y regresar.
Desde el ícono ⚙️ accede a la pantalla de Configuración.
