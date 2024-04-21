package org.example.model.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.ThreeDimensionalShapes;

@RequiredArgsConstructor
@Slf4j
public class Cube implements ThreeDimensionalShapes {
    private final double sideLength;


    @Override
    public Double findVolume() {
        log.info("Cube: {} ", sideLength);

        return sideLength * sideLength * sideLength;
    }

    @Override
    public Double findSurfaceArea() {
        log.info("Cube: {} ", sideLength);

        return 6 * sideLength * sideLength;
    }
}
