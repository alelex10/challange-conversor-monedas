📋Dependencias
gson-2.10.1 Ver enlace: https://mvnrepository.com/artifact/com.google.code.gson/gson
Api del sitio: https://v6.exchangerate-api.com
Versiones probadas desde consola e Intellij: openjdk-17 ; openjdk-21 (Verificar que las versiones de 'javac' y 'java' (compilador y jre) coincidan en caso de tener dos o más versiones de java instaladas si se desea compilar desde la consola)

📝 Descripción
Challenger conversión de monedas de Alura Latam, es una aplicación de conversión de monedas el cual realiza una petición a una API para realizar la comprobación de divisas, es intuitiva ya que tiene una interfaz sencilla

del programa G6 de Alura Latam en donde se desarrolló una aplicación java que convierte devisas por medio de solicitudes a una api. La aplicación posee una consola que el usuario puede utilizar para hacer todas las operaciones de conversión, es intuitiva y de fácil uso.
Estructura 💻
src/main/java/com.example.conversormonedas/
EntryPoint.java: Manda llamar al gui para una compilación exitosa con maven.
CurrencyConverterGUI.java: Interfaz de usuario para la aplicación de conversión de monedas.
CurrencyConverter.java: Lógica para realizar las conversiones de moneda.
CurrencyCoins.java: Gestión de la lista de monedas disponibles.
Currency.java: Representación de una moneda individual.
ExchangeRateAPI.java: Comunicación con una API externa para obtener tipos de cambio.
ConversionRecord.java: Representación de un registro de conversión de moneda.
ConversionHistory.java: Gestión del historial de conversiones de moneda.
NOTA: Dentro del IDE es posible ejecutar tanto EntryPoint como CurrencyConverterGUI, Entrypoint solo esta ahí para empaquetar correctamente el .exe con maven.
Autor ✒️
Alejandro Verduguez
