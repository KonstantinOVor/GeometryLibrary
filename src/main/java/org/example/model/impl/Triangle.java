package org.example.model.impl;

import lombok.RequiredArgsConstructor;
import org.example.model.GeometryLibrary;
@RequiredArgsConstructor
public class Triangle implements GeometryLibrary {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    @Override
    public Double findingTheArea() {

        double semiPerimeter = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public Double findingThePerimeter() {
        return sideA + sideB + sideC;
    }
}
