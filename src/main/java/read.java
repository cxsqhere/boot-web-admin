import java.io.*;

public class read {
    public static void main(String[] args) {
        File file = new File("D:\\test\\src\\test.txt");
        countfile(file);
    }

    public static void countfile(File file) {
        int count = 0;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuffer sb = new StringBuffer();
        String line = null;
        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            sb.append(line);
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 统计字母个数
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
