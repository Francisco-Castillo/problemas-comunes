package com.fcastillo.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Laboratorio> lista1 = new ArrayList<>();
        List<Laboratorio> lista2 = new ArrayList<>();

        lista1.add(new Laboratorio(1, "Laboratorio A"));
        lista1.add(new Laboratorio(2, "Laboratorio B"));
        lista1.add(new Laboratorio(3, "Laboratorio C"));

        lista2.add(new Laboratorio(1, "Laboratorio A"));
        lista2.add(new Laboratorio(4, "Laboratorio D"));
        lista2.add(new Laboratorio(5, "Laboratorio E"));

        List<Laboratorio> laboratorios = lista1
                .stream()
                .filter(item1 -> lista2
                        .stream()
                        .anyMatch(item2 -> item2.getId() == item1.getId()))
                .collect(Collectors.toList());

        laboratorios.forEach(System.out::println);
    }
}
