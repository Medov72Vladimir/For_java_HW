// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

package For_java_HW;
public class Task_2_0 {

    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbB";
        String res = findjewelsInStones(jewels, stones);
        System.out.println(res);
    }
    public static String findjewelsInStones(String jewels,String stones){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < jewels.length(); i++){
            int count = 0;
            for(int j = 0; j < stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
            res.append(jewels.charAt(i)).append(count);
        }
        return res.toString();
    }
}
