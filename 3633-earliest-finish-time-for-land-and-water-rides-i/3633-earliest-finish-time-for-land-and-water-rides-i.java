class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int landFinish = landStartTime[i]+landDuration[i];
                int finish1 = Math.max(landFinish,waterStartTime[j]) + waterDuration[j];

                int waterStart = waterStartTime[j]+waterDuration[j];
                int finish2 = Math.max(waterStart,landStartTime[i]) + landDuration[i];
                ans = Math.min(ans,finish1);
                ans = Math.min(ans,finish2);
            }
        }
        return ans;
    }
}

// test cases failed
// class Solution {
//     public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
//         int ans = Integer.MAX_VALUE;
//         if(landStartTime[0]<waterStartTime[0]){
//             for(int i=0;i<landStartTime.length;i++){
//             int startTime = landStartTime[i] + landDuration[i];
//             int total = Integer.MAX_VALUE;
//             for(int j=0;j<waterStartTime.length;j++){
//                 if(startTime < waterStartTime[j]){
//                     int time = waterStartTime[j] + waterDuration[j];
//                     total = Math.min(total,time);
//                 }else{
//                     int time = startTime + waterDuration[j];
//                     total = Math.min(total,time);
//                 }
//             }
//             totalMin = Math.min(total,totalMin);
//             }
//         }
//         else{
//             for(int i=0;i<waterStartTime.length;i++){
//             int startTime = waterStartTime[i] + waterDuration[i];
//             int total = Integer.MAX_VALUE;
//             for(int j=0;j<landStartTime.length;j++){
//                 if(startTime < landStartTime[j]){
//                     int time = landStartTime[j] + landDuration[j];
//                     total = Math.min(total,time);
//                 }else{
//                     int time = startTime + landDuration[j];
//                     total = Math.min(total,time);
//                 }
//             }
//             totalMin = Math.min(total,totalMin);
//             }
//         }
//         return totalMin;
//     }
// }