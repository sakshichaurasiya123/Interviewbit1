public class Solution {
    public String solve(String A) {
    char ch[]=A.toCharArray();
    Queue<Character>q=new LinkedList<>();
    StringBuffer br=new StringBuffer();
    LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
    for(char i:ch)
    {
        map.put(i, map.getOrDefault(i, 0) + 1);

        if(map.get(i)==1)
            q.add(i);
        while(q.size()!=0){
            char c=q.peek();
            if(map.get(c)==1){
                br.append(c);
                break;
            }
            else{
               
                q.remove();
            }
        }
        if(q.size()==0)
            br.append("#");

    }
   
    return br.toString();
    }
}
