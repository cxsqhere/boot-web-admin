import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Str {
    public static void charAll(ArrayList<Character> a){
        for (char i = 'a';i <= 'z';i++) {
            a.add(i);
        }
        for(char i ='A';i<='Z';i++) {
            a.add(i);
        }
        for(char i = '0';i<='9';i++) {
            a.add(i);
        }

    }
    //set是不可重复的
    //Count字符串数目,Str_length字符串长度
    public static void rd(int Count, int Str_length){
        List<String> list= new ArrayList<>();
        //字母和数字组成
        ArrayList<Character> a = new ArrayList<>();
        charAll(a);
        //set
        HashSet<Character> s1 = new HashSet<>();
        HashSet<StringBuilder> s2 = new HashSet<>();
        //随机获得元素
        while (true){
            //在a.size()中获取随机数
            int a1= (int) (Math.random()*a.size());
            //获取到的数，存到数组中
            s1.add(a.get(a1));
            //Str_length字符串长度够了就生成字符串，存到s2数组里面
            if(s1.size()==Str_length){
                //生成字符串
                StringBuilder sb=new StringBuilder();
                for (Object o:s1) {
                    sb.append(o.toString());
                }
                //字符串存到s2数组里面
                s2.add(sb);
                break;
            } if (s2.size() == Count) {
                break;
            }}
        for(Object str:s2){
            list.add(str.toString());
        }
    }
    public static void main(String[] args) {
        rd(1,2);
    }
}
