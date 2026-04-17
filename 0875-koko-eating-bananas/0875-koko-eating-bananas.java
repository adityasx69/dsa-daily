class Solution {

    private long totalHours(int[] piles, int speed, int limit) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;
            if (hours > limit) return hours;
        }
        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (totalHours(piles, mid, h) <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}