package Lecture_2;

/*  

public class Materials {
public static void main(String[] args) {
     var s = System.currentTimeMillis();
     String str = " ";
     StringBuilder sb = new StringBuilder();
     for (int i = 0; i < 100000; i++) {
         // str += "+";
         sb.append("+");
     }
     System.out.println(System.currentTimeMillis() - s);//1106   4
     System.out.println(str);
     System.out.println(sb);
 }
}

*/

// trim() удаляет начальные и конечные пробелы
// substring() возвращает подстроку, см.аргументы
// toLowerCase()/toUpperCase() нижний\верхний регистр
// compareTo() сравнивает две строки
// equals() сравнивает строки с учетом регистра
// equalsIgnoreCase() без учета регистра
// regionMatches() сравнивает подстроки в строках

/*  
public class Materials {
    public static void main(String[] args) {
                 String[] name = {"О", "л", "ь", "г", "а"};
                 String sk = "ОЛЬГА РУ.";
                 System.out.println((sk.toLowerCase())); //ольга ру.
                 System.out.println((String.join("", name))); //Ольга
                 System.out.println(String.join("","О", "л", "ь", "г", "а")); // Ольга
                 System.out.println(String.join(",","О", "л", "ь", "г", "а")); //О, л, ь, г, а
    }
}

*/

// много изменений в уже полученных данных String (разборка)
// много преобразований в при получении данных StringBuilder (сборка)

/* 
import java.io.File;

public class Materials {
    public static void main(String[] args) {
                 String pathProject = System.getProperty("user.dir");
                 String pathFile = pathProject.concat("/file.txt");
                 File f3 = new File(pathFile);
                 System.out.println(f3.getAbsolutePath());
                 // D:\Домашнее задание GeekBrains\Java(lectures)\file.txt
                 // PS D:\Домашнее задание GeekBrains\Java(lectures)
             }
         }
*/

/*  
import java.io.File;
 public class Materials {
     public static void main(String[] args) {
         try {
             String pathProject = System.getProperty("user.dir");
             String pathFile = pathProject.concat(("/file.txt"));
             File f3 = new File(pathFile);
             System.out.println("try");
         } catch (Exception e) {
             System.out.println("catch");
         } finally {
             System.out.println("finally"); //try finally
         }
     }
 }
*/

// isHidden() возвращает истину, если каталог или файл является скрытым
// length() возвращает размер файла в байтах
// lastModified() возвращает время последнего изменения файла или каталога
// list() возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles() возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
// mkdir() создает новый каталог
// renameTo(File dest) переименовывает файл или каталог

/*  
import java.io.File;
 public class Materials {
     public static void main(String[] args) {
         String pathProject = System.getProperty("user.dir");
         String pathDir = pathProject.concat("/files");
         File dir = new File(pathDir);
         System.out.println(dir.getAbsolutePath());
         if(dir.mkdir()) {
             System.out.println("+"); // +
         } else {
             System.out.println("-");
         }
         for (String fname : dir.list()) {
             System.out.println(fname);
         }
     }
 }
 */

import java.io.IOException;
import java.util.logging.*;

public class Materials {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Materials.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml");
        // logger.addHandler(ch);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        // ch.setFormatter(sFormat);
        // fh.setFormatter(sFormat);
        // ch.setFormatter(xml);
        fh.setFormatter(xml);

        // logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}