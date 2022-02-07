# Drawing shapes
## Difficulty: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) 

Write a program that allows you to draw a rectangle, circle and square at any position and in any colour. To do this, write a super class _Shape_ and its subclasses _Rectangle_, _Circle_ and _Square_.

With all _Shape_ instances you should be able to do the following:
- When creating a Shape, you must be able to give a position (x, y coordinates) and a colour in which the figure must be drawn.
- It must be possible to calculate the surface of the shape (method: _getArea()_, gives a double).
- It must be possible to calculate the circumference of the shape (method: _getCircumference()_, gives a double).
- It must be possible to actually draw the figure using the SaxionApp, by calling the _draw()_ method. This method also ensures that the colour is set correctly and that any border is disabled.

To help you on your way, we have already implemented the `Application` class so that you can see exactly what needs to be printed. It is of course up to you to give the correct implementations of the other classes.

## Examples

![Example](sample_output0.png)

![Example](sample_output1.png)

![Example](sample_output2.png)

## Relevant links
* [Java documentation for the SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)
