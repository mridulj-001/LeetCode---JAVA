class RecentCounter {

    Queue<Integer> requests = new LinkedList<>();

        public RecentCounter(){


    }

    public int ping(int t){
        requests.add(t);

        while(requests.peek() < t - 3000){
            requests.poll();

        }

        return requests.size();
    }
}