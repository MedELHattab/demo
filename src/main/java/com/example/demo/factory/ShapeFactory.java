package com.example.demo.factory;

/**
 * Simple factory for creating shapes
 */
public class ShapeFactory {

    /**
     * Creates a shape based on the type string
     * @param shapeType The type of shape to create
     * @return The created shape
     */
    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;
    }
}