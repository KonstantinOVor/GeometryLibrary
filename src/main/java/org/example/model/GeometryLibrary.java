package org.example.model;
public interface GeometryLibrary {
    Double findingTheArea();
    Double findingThePerimeter();


    default Double getArea(){
        return findingTheArea();
    };
    default Double getPerimeter(){

        return findingThePerimeter();
    };
    default String name(){
        return GeometryLibrary.class.getName();
    }
}
