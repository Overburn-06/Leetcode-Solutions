class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       
        double [][]cars=new double [position.length][2];
        for(int i=position.length-1;i>=0;i--){
            cars[i][0]=(double)position[i];
            cars[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        int count=0;
        double prev=0;
        for(int i=0;i<cars.length;i++){
            if(cars[i][1]>prev){
                count++;
                prev=cars[i][1];
            }
        }
        return count;
    }
}