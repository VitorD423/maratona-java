package academy.devdojo.maratonajava.javacore.Wnio.test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;


public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
       Path path = Paths.get("pasta2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        //Quando essa classe for executada o metodo BasicFileAttributes o objeto que tem que ser
        //retornado que passa o teste é um BasicFileAttributes
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccesstime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime "+ creationTime);
        System.out.println("lastModifiedTime "+ lastModifiedTime);
        System.out.println("lastAccesstime "+ lastAccesstime);
        System.out.println("------------------------------------");
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime,newCreationTime,creationTime);

         creationTime = fileAttributeView.readAttributes().creationTime();
         lastModifiedTime = basicFileAttributes.lastModifiedTime();
         lastAccesstime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime "+ creationTime);
        System.out.println("lastModifiedTime "+ lastModifiedTime);
        System.out.println("lastAccesstime "+ lastAccesstime);
    }
}
