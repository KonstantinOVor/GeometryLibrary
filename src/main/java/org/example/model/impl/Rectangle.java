package org.example.model.impl;

import lombok.RequiredArgsConstructor;
import org.example.model.GeometryLibrary;
@RequiredArgsConstructor
public class Rectangle implements GeometryLibrary {
    private final double length;
    private final double width;
    @Override
    public Double findingTheArea() {
        return length * width;
    }

    @Override
    public Double findingThePerimeter() {
        return 2 * (length + width);
    }
}
