class Solution {
    class Pair{
        String word;
        int step;
        Pair(String word,int step){
            this.word = word;
            this.step = step;
        }
    }
    public int ladderLength(String st, String ed, List<String> w) {
        Set<String> dict = new HashSet<>(w);
        if(!dict.contains(ed))return 0;

        Queue<Pair> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        q.add(new Pair(st,1));
        while(!q.isEmpty()){
            Pair r = q.poll();
            String word = r.word;
            int step = r.step;

            if(word.equals(ed)) return step;
            char[] arr = word.toCharArray();
            for(int i=0; i<arr.length; i++){
                char ori = arr[i];
                for(char ch ='a'; ch<='z'; ch++){
                    if(ch == ori)continue;
                    arr[i] = ch;
                    String ne = new String(arr);
                    if(dict.contains(ne) && !visited.contains(ne)){
                        dict.remove(ne);
                        q.add(new Pair(ne , step+1));
                        visited.add(ne);
                    }
                    arr[i]=ori;
                }
            }
        }
        return 0;
    }
}