// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

public class task1 {
    public static void main(String[] args) {
        String s = "cba";
        int[] index = {2, 1, 0};
        System.out.println(shuffle(s, index));
    }
    
    public static String shuffle(String s, int[] index){
        char[] moved = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            moved[index[i]] = s.charAt(i);
        }
        return new String(moved);
    }
}
