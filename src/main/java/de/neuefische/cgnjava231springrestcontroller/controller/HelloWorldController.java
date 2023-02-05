package de.neuefische.cgnjava231springrestcontroller.controller;

import org.springframework.web.bind.annotation.*;

/**
 * 1. Setze ein Spring Web Projekt auf.
 * 5. Frage die Endpunkte mit Postman ab
 */

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    /**
     * 2. Erstelle einen Webcontroller `HelloWorldController` mit einem GET Endpunkt, welcher den String "hello world" zurückgibt.
     */
    @GetMapping
    public String helloSpring() {
        return "Hello World!";
    }

    /**
     * 3. Schreibe einen zusätzlichen GET-Endpunkt, der den Vornamen als Query-Parameter entgegennimmt und den Aufrufer persönlich begrüßt
     */
    @GetMapping("/greeting")
    public String helloSpring(@RequestParam String firstName) {
        return "Hello " + firstName + "!";
    }

    /**
     * 4. Schreibe einen zusätzlichen POST-Endpunkt, der im Body einen String enthält und die Länge des Texts zurückgibt
     */
    @PostMapping
    public int getLength(@RequestBody String text) {
        return text.length();
    }
}
