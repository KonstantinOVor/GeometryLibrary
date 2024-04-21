package org.example.model.impl;

import lombok.RequiredArgsConstructor;
import org.example.model.GeometryLibrary;
@RequiredArgsConstructor
public class Circle implements GeometryLibrary {
    private final double radius;

    @Override
    public Double findingTheArea() {
        double area = Math.PI * radius * radius;
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public Double findingThePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return Math.round(perimeter * 10.0) / 10.0;
    }
}
