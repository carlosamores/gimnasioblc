# **Body Factory** #

## Objetivos ##
Desarrollar un sistema que permita:
  * Facilitar a los gimnasios la tarea de definición de un programa de ejercicios apropiados para cada usuario.
  * Facilitar a los usuarios realizar un seguimiento de su evolución y desempeño en la ejecución de sus rutinas de tal forma que las puedan adaptar y mejorar.


---


## Contexto del desarrollo ##

Este proyecto es desarrollado en el contexto del modulo _Análisis y diseño orientado a objetos_ de la _[Maestría en gestión y desarrollo de software](http://www.autonoma.edu.co/posgradosUAM/maestriaDesarrolloSoftware/?Maestr%EDa_en_Gesti%F3n_y_Desarrollo_de_Proyectos_de_Software)_ de la _[Universidad Autónoma de Manizales](http://www.autonoma.edu.co)_

El grupo de trabajo BLC esta conformado por:
  * Beatriz Ayala
  * Lina María Ocampo
  * Claudia Marcela Ramírez


---


# Enunciado del proyecto #
_Proyecto Cupi-2 - UNIANDES_

## Propósito ##
Los gimnasios cuentan con especialistas en deportes que definen para cada usuario del gimnasio una rutina adecuada para cumplir algunos objetivos.
Sin embargo, el seguimiento y adaptación de estas rutinas es una labor que requiere mucha información y que usualmente no se hace con la regularidad necesaria.
Los usuarios de un gimnasio quisieran realizar un seguimiento más cercano de su desempeño para entender cómo cada ejercicio está contribuyendo en su desarrollo físico.
El propósito del sistema que se va a desarrollar es doble. Por un lado quisiéramos facilitar a los gimnasios la tarea de definición de un programa de ejercicios apropiados para cada usuario. Por otro lado queremos facilitar a los usuarios realizar un seguimiento de su evolución y desempeño en la ejecución de sus rutinas de tal forma que las puedan adaptar y mejorar.
## Descripción General ##
El corazón del sistema es la aplicación que permite crear perfiles de deportistas con sus rutinas y seguimientos.
### Perfil de un deportista ###
Un perfil contiene la información básica del usuario: su nombre, género y edad así como sus datos físicos como altura, peso, presión sanguínea, ritmo cardiaco y medidas de algunas partes de su cuerpo como cintura, piernas y brazos.
El usuario deportista puede definir un conjunto de objetivos de desarrollo físico como la pérdida de peso, reducción de medidas, tonificación, crecimiento muscular, etc. Finalmente, de manera periódica (p.e. semanalmente) los usuarios actualizan los datos de su perfil (nuevo peso, nuevas medidas, etc.)
Un ejemplo de lo que podría ser este proceso de registrar un usuario y sus objetivos, es lo de que encontramos en sistemas como el Wii Fit.
### Rutinas Físicas ###
Una rutina física es un conjunto de ejercicios, cada uno definido para cumplir con uno o más objetivos de un usuario. Una rutina debe definirse por un profesional quien, con base en su experiencia, tomará en cuenta el perfil del usuario y sus objetivos para definir tanto el tipo de ejercicios, como su duración, regularidad, número de series, y otra serie de parámetros que dependerán de la máquina que se utilizará.
Se espera que la información histórica del gimnasio pueda ayudarle al profesional a definir las rutinas más adecuadas. Por ejemplo, si un objetivo es mejorar la capacidad cardiovascular, el profesional podría realizar una consulta en el sistema y preguntar por las rutinas más exitosas para lograr ese objetivo en poblaciones de edad y peso similares al del deportista. La respuesta debe darse valorada con algunos criterios como regularidad con la que cumplen la rutina los deportistas, resultados obtenidos, etc.
De esta manera, dados los objetivos del deportista, el sistema podrá sugerir una rutina para él.
### Ejercicios y Máquinas ###
Los ejercicios que un deportista puede realizar están agrupados en categorías que son: aeróbicos (trotadora, escaladora, etc.), anaeróbicos (pesas), de flexibilidad y equilibrio (p.e. Pilates), de relajación (p.e. yoga) y de tonificación.
Cada ejercicio pertenece a una categoría, tiene una descripción, una explicación de cómo se realiza el ejercicio, máquinas que se necesitan e indica que zonas del cuerpo trabaja (p.e. pecho, brazos, piernas, espalda, abdominales).
El gimnasio cuenta con un conjunto de máquinas que permiten a los usuarios realizar sus rutinas. Las máquinas tienen un sistema simple que permite al usuario registrarse al iniciar su trabajo y que registra los resultados del ejercicio (p.e. para una trotadora almacena el tiempo, velocidad promedio, ritmo cardíaco promedio y las calorías quemadas). Al realizar un ejercicio el sistema debe recibir la información de la máquina y asociarla al perfil de un usuario.
### Requerimientos Básicos ###
Se espera que el sistema que UD. implemente permita al gimnasio crear los deportistas y sus perfiles, asociarles rutinas de ejercicios que utilicen las máquinas del gimnasio y que, a través de éstas, se pueda llevar registros de los ejercicios realizados y el desempeño.
El sistema debe permitir la búsqueda de información sobre la historia de un usuario en particular o de usuarios con perfiles similares para crear y/o adaptar las rutinas. Cuando se consulte la historia de un deportista en el gimnasio, el sistema debe ofrecerle varias vistas que permitan ver su progreso en el tiempo: peso, medidas, capacidad cardiovascular, etc.
El sistema debe también informar a los entrenadores sobre el desempeño pobre de algún deportista para que estos puedan reajustar el plan y verificar qué es lo que está sucediendo. Si por ejemplo, el problema es perdida de motivación, el gimnasio puede invitar a estos usuarios a sus charlas sobre salud, deporte y alimentación.


---


---
