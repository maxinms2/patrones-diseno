package patrones.composite.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileSystemConfiguration {

    @Bean
    public File file1() {
        return new File("Archivo1.txt");
    }

    @Bean
    public File file2() {
        return new File("Archivo2.txt");
    }

    @Bean
    public Directory root(Directory subDirectory, File file1) {
        Directory root = new Directory("Root");
        root.add(file1);
        root.add(subDirectory);
        return root;
    }

    @Bean
    public Directory subDirectory(File file2) {
        Directory subDir = new Directory("Carpeta1");
        subDir.add(file2);
        return subDir;
    }
}
