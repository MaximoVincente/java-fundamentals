/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() throws IOException {
        App classUnderTest = new App();
//        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
        Path gateFile = Paths.get("src/main/resources/gates.js");
        int errors = 46;
        assertEquals(errors, classUnderTest.linter(gateFile));
    }
}