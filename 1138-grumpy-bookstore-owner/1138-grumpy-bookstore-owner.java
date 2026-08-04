class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int left = 0;
        int right = minutes;

        int sum = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }

        int extra = 0;

        for (int i = left; i < right; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
        }

        int max = extra;

        while (right < customers.length) {

            if (grumpy[left] == 1)
                extra -= customers[left];

            if (grumpy[right] == 1)
                extra += customers[right];

            max = Math.max(max, extra);

            left++;
            right++;
        }

        return sum + max;
    }
}