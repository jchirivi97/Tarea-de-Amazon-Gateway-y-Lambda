# Hello World: AWS Lambda & Gateway Services en Java



### Cree la función lambda

En la consola de AWS seleccione el servicio Lambda y cree una función siguiendo estos pasos:

### Cree un ROL en el servicio IAM de AWS


![Captura](https://user-images.githubusercontent.com/48265107/78063029-2a75d080-7355-11ea-8765-800582ecd843.JPG)

![Captura](https://user-images.githubusercontent.com/48265107/78063173-6872f480-7355-11ea-8394-1e4003fec9e2.JPG)

### Servicio Lambda

-Oprima el botón de crear una función. Cree la función desde el inicio (From scratch)

-Asígnele un nombre, por ejemplo “square"

-Seleccione el “Runtime” a Java 8

-Seleccione usar un Rol existente y use el rol que creó en el paso 1.

![Captura](https://user-images.githubusercontent.com/48265107/78079329-83536200-7371-11ea-9b7b-7fb7a6f2ce80.JPG)

-En la sección “Function code” cargue el código

-En el campo “Handler” escriba: {ruta de la clase incluyendo el paquete}::{Nombre del método}. Es decir: 

-Oprima el botón de guardar

-Ahora vamos a probar que funcione:

-En la parte superior en el cuadro de selección que dice ”Select a test event” seleccione “Configure test events”.

-Asigne un nombre de evento, por ejemplo “testSquare"

-En el cuadro de texto, borre el JSON que aparece y solo deje el número 5

-Oprima el botón de crear.

![Captura](https://user-images.githubusercontent.com/48265107/78087821-e64ff380-7387-11ea-81ce-3204b8c44c8a.JPG)

## Api Gateway

-En el API de mathServices en el botón de acciones al lado de recirsoso seleccione “Create Method"

- En el campo de “Lambda Function” escriba el nombre de la función que creó en le paso anterior y salve.

![Captura](https://user-images.githubusercontent.com/48265107/78088229-25327900-7389-11ea-8ef8-438569362f94.JPG)


![Captura](https://user-images.githubusercontent.com/48265107/78089272-8a3b9e00-738c-11ea-90c6-069e67a3968c.JPG)

## Aplicativo Web

![Captura](https://user-images.githubusercontent.com/48265107/78089402-ee5e6200-738c-11ea-8d06-0d3c69bbd0dd.JPG)


![Captura](https://user-images.githubusercontent.com/48265107/78089455-164dc580-738d-11ea-8846-d5c72abcca29.JPG)






