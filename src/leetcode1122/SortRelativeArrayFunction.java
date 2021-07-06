package leetcode1122;

public class SortRelativeArrayFunction {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k = 0;
        int size = 1001;
        
        int[] cnt = new int[size];
        
        int[] answer = new int[arr1.length];
        
        // Count each element in arr1
        for(int i : arr1){
            cnt[i] = cnt[i] + 1;
        }
        
        // Sort the same element in both array by the order of arr2
        for(int i : arr2){
            // Put each element starting from the first and put it in the answer array
            while(cnt[i]-- > 0){
                answer[k] = i;
                k++;
            }
        }
        
        // Sort the number that in only in arr1, but not in arr2
        for(int i = 0; i < size; i++){
            // Put each element that is not in arr2 starting from the end of the answer array
            while(cnt[i]-- > 0){
                answer[k] = i;
                k++;
            }
        }
        
        return answer;
    }
    
    // If 0 <= arr1[i], arr2[i] <= 1000 doesn't exist
//    public int[] relativeSortArray(int[] arr1, int[] arr2) {
//        TreeMap<Integer, Integer> map = new TreeMap<>();
//        for(int n : arr1) map.put(n, map.getOrDefault(n, 0) + 1);
//        int i = 0;
//        for(int n : arr2) {
//            while(map.get(n) > 0) {
//                arr1[i++] = n;
//                map.put(n, map.get(n)-1);
//            }
//        }
//        for(int n : map.keySet()){
//            while(map.get(n) > 0) {
//                arr1[i++] = n;
//                map.put(n, map.get(n)-1);
//            }
//        }
//        return arr1;
//    }
}
