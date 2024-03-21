package GreedyAlgorithems;

public class FrectionalKnapSack {
    static class IteamValue {
        int profit;
        int weight;
        public IteamValue(int profit,int wit){
            this.profit = profit;
            this.weight = wit;
        }
    }
    public static void main(String[] args) {
        IteamValue arr[] = {new IteamValue(25, 5),new IteamValue(75, 10),new IteamValue(100, 12)
                           , new IteamValue(50, 4) ,  new IteamValue(45, 7),
                           new IteamValue(90, 9), new IteamValue(30, 3)};
        
    }
}
