package ru.coderiders.teamtask;


import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class ReadAnnotation {

    public void readAnnotation(AnnotatedElement element) {
        Annotation[] annotations = element.getAnnotations();
        for (var i : annotations){
            if(i instanceof DefaultValue){
                
            }
        }
    }

}
