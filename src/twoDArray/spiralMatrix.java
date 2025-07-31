package twoDArray;

public class spiralMatrix {

        public int maxProduct(int[] nums) {
            int n = nums.length;
            int ans = Integer.MIN_VALUE;
            int prefix =1;
            int suffix = 1 ;

            for(int i =0 ; i<=n-1 ; i++){


                if(prefix == 0 ){
                    prefix = 1 ;
                }
                if(suffix == 0 ){
                    suffix = 1 ;
                }
                prefix = prefix * nums[i];
                suffix = suffix * nums[n-i-1];
                ans = Math.max(ans, Math.max(prefix,suffix ));
            }

            return ans;
        }



}
