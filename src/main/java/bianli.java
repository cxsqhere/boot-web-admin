import java.io.File;

public class bianli {
    public static void main(String[] args) {
        File file = new File("D:\\test\\src");
        printFile(file);
        System.out.println("hello world");
    }

    public static void printFile(File file) {
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().replaceAll("(.jpg)+", "").length() != files[i].getName().length()) {
                System.out.println(files[i].getName());
            }
        }
    }
}
