class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int pn=players.length;
        int tn=trainers.length;

        int i=0;
        int j=0;

        Arrays.sort(players);
        Arrays.sort(trainers);

        while(i<pn && j<tn){
            if(players[i]<=trainers[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}