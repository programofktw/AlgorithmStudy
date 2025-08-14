package baekjoon.class4;


import java.sql.Array;
import java.util.*;

/*
거짓말
자신이 과장해서 이야기할 수 있는 최대 파티의 개수를 반환할 것.

이때 진실을 알고 있는 사람이 있을 경우 해당 파티에서는 진실을 말할 수 없음

일단 연결관계를 표현해주어야하고, 그 후 BFS 탐색을 해주면 됨.
 */
public class BaekJoon1043 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //사람들 인원 수
        int N = scan.nextInt();

        //파티 수
        int M = scan.nextInt();

        //파티리스트(각 파티별 참석한 인원)
        List<List<Integer>> partyList = new ArrayList<>();

        
        //각 사람이 파티에서 만난 연결 그래프
        List<Integer>[] meetGraph = new ArrayList[N+1];

        //그래프 초기화
        for(int i = 0 ;i<N+1;i++){
            meetGraph[i] = new ArrayList<>();
        }

        //진실을 아는 사람 집합
        Set<Integer> knownTrue = new HashSet<>();

        //진실을 아는 사람 수
        int knownTruePeople = scan.nextInt();

        //집합에 진실을 아는 사람 수 추가
        for(int i = 0; i <knownTruePeople;i++){
            knownTrue.add(scan.nextInt());
        }

        //각 파티 별 참여 인원 추가
        for(int i = 0; i <M;i++){
            List<Integer> party = new ArrayList<Integer>();

            //파티 참가원 수
            int partyPeople = scan.nextInt();

            //파티 참가자 체크
            for(int j= 0;j<partyPeople;j++){
                party.add(scan.nextInt());
            }

            // 파티 내 사람들 연결시키기
            for (int j = 0; j < party.size(); j++) {
                for (int k = j + 1; k < party.size(); k++) {
                    meetGraph[party.get(j)].add(party.get(k));
                    meetGraph[party.get(k)].add(party.get(j));
                }
            }


            partyList.add(party);
        }

        //각 파티 참여자들을 통해 진실을 아는 사람 공유(BFS)
        boolean[] visited = new boolean[N+1];

        Queue<Integer> q = new LinkedList<>();

        //진실을 아는 사람부터 BFS 시작
        for(int knowns : knownTrue){
            visited[knowns] = true;
            q.add(knowns);
        }

        //BFS
        while(!q.isEmpty()){
            //진실을 아는 사람 빼오기
            int now = q.poll();
            //해당 사람과 만난 사람들 탐색
            for(int meet : meetGraph[now]){
                //아직 진실을 모르는 사람의 경우
                if(!visited[meet]){
                    //진실을 알려주고
                    visited[meet] = true;
                    //그 사람의 주변 사람 탐색.
                    q.add(meet);
                }
            }
        }
        
        //과장해도 되는 파티 수
        int count = 0;
        
        //각 파티에 진실을 아는 사람이 껴있는지 확인해보기
        A:for(List<Integer> party:partyList){
            for(Integer partyPerson : party){
                if(visited[partyPerson]){
                    continue A;
                }
            }
            //파티에 진실을 아는 사람이 없으니 과장할 것
            count++;
        }

        System.out.println(count);


    }
}
