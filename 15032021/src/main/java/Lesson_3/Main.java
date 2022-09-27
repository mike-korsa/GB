package Lesson_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File file = new File("C:/Users/Artem/Desktop/Новая папка (3)/5");
//        file.mkdirs();

//        File file = new File("123");
//////
////        String[] lits = file.list();
////
////        for (String o : lits) {
////            System.out.println(o);
////        }
////        System.out.println(lits);
//
//        String[] lits = file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.startsWith("t");
//            }
//        });
//
//        for (String o : lits) {
//            System.out.println(o);
//        }

//        File newFile = new File("123/conf1.jpeg");
//        try {
//            newFile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        File newFile = new File("123/conf1.txt");
//        System.out.println(newFile.getPath());
////        try {
////            newFile.createNewFile();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//        if (newFile.exists()) {
//            System.out.println("file exists");
//        }

//        long t = System.currentTimeMillis();


//        try (FileInputStream in = new FileInputStream("123/test.txt")) {
//
//            int x;
//            while ((x = in.read()) > -1) {
//                System.out.print((char)x);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (FileInputStream in = new FileInputStream("123/test.txt")) {
//            byte[] arr = new byte[512];
//            int x;
//            while ((x = in.read(arr)) > 0) {
//                System.out.print(new String(arr, 0, x, "UTF-8"));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Время " + (System.currentTimeMillis() - t));


//
//        try (FileInputStream in = new FileInputStream("123/4/test.txt")) {
//            byte[] arr = new byte[512];
//            int x;
//            while ((x = in.read(arr)) > 0) {
//                System.out.print(new String(arr, 0, x, "UTF-8"));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println();
//        System.out.println(System.currentTimeMillis() - t);

//
//        System.out.println(System.currentTimeMillis() - t);







//        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("123/test.txt"), "UTF-8")) {
//            int x;
//            while ((x = isr.read()) != -1) {
//                System.out.println((char) x);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        BufferedReader br = null;
//        FileReader fr = null;
//
//        try {
//            fr = new FileReader("123/test.txt");
//            br = new BufferedReader(fr);
//            String currentLine;
//
//            while ((currentLine = br.readLine()) != null) {
//                System.out.println(currentLine);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        PipedInputStream in = null;
//        PipedOutputStream out = null;
//
//        in = new PipedInputStream();
//        out = new PipedOutputStream();
//        out.connect(in);


//        ArrayList<InputStream> ail = new ArrayList<>();
//        ail.add(new FileInputStream("123/test1.txt"));
//        ail.add(new FileInputStream("123/test2.txt"));
//        ail.add(new FileInputStream("123/test3.txt"));
//
////        for (InputStream  a : ail ) {
////            System.out.println(a);
////        }
//
//        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(ail));
//
//        int x;
//        while ((x = in.read()) != -1) {
//            System.out.print((char) x);
//        }
//
//        in.close();

//        try (RandomAccessFile raf = new RandomAccessFile("123/test1.txt", "rw")) {
//            raf.seek(2);
//            System.out.println((char) raf.read());
//            raf.seek(1);
//            System.out.println((char) raf.read());
//            raf.seek(0);
//            System.out.println((char) raf.read());
//        }

//        Book book = new Book("Jungle book");
//        Students s = new Students(1, "Bob");
//        s.setBook(book);
//////
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stud.ser"));
//        oos.writeObject(s);
//        oos.close();
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stud.ser"));
//        Students s1 = (Students)ois.readObject();
//        ois.close();
//        s1.info();

    }
}
