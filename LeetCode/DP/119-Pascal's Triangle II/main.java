import java.util.ArrayList;
import java.util.List;
public class main {
    // 
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);

        for(int i = 1; i<=rowIndex; i++){
            result.add(1);

            for(int j = i-1; j>0; j--){
                result.set(j, result.get(j) + result.get(j-1));
            }
    
        }
        return result;
    }
    public static void main(String[] args) {
        main sol = new main();
        int rowIndex = 3;
        List<Integer> row = sol.getRow(rowIndex);
        System.out.println(row); // Output: [1, 3, 3, 1]
    }
}