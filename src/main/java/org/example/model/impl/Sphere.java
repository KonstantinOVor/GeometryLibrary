package org.example.model.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.ThreeDimensionalShapes;

@RequiredArgsConstructor
@Slf4j
public class Sphere implements ThreeDimensionalShapes {

    private final double radius;


    @Override
    public Double findVolume() {
        log.info("Sphere: {} ", radius);

        return (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }

    @Override
    public Double findSurfaceArea() {
        log.info("Sphere: {} ", radius);

        return 4 * Math.PI * radius * radius;
    }
}
