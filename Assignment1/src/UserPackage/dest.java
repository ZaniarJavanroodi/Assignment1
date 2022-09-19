/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserPackage;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Zaniar
 */
public class dest {
        Path userDirectory = Paths.get("");              

    public Path getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(Path userDirectory) {
        this.userDirectory = userDirectory;
    }
        
    }


