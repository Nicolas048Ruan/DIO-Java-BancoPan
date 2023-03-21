package com.aulas;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;

public class CondicionaisTest {
    
    @Test
    
    // @EnabledIfEnvironmentVariable(named = "USER", matches = "Willyan") // O nome da variável q vai olhar é USER e ela tem q ser Willyan

    // @DisabledIfEnvironmentVariable(named = "USER", matches = "root") // Se o USER for root eu n executo esse teste

    // @EnabledOnOs(OS.LINUX) // Só executa se for Linux

    // @EnabledOnOs({OS.MAC, OS.LINUX}) // Só executa se for Mac ou Linux

    // @EnabledOnJre(value = JRE.JAVA_17) // Só executa no Java 17

    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17) // Só executa entre Java 11 e Java 17
    public void validarSomenteNoUsuarioWillyan() {
        Assertions.assertEquals(10, 5 + 5);
    }

}
