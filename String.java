public class P1{
    
    private String str;

    public P1(String str){
        this.str=str;

        String arr[]=str.split("str");
        for(int i=0; i<arr.length; i++){
            char ch[]=arr[i].toCharArray();

            if(ch[0]>96){
                ch[0] = (char)(ch[0]-32);
            }

            String s = new String(ch);
            arr[i] = s;
            System.out.println(arr[i]+" ");
        }
    }
}

class TestMain{
    public static void main(String[]args){
        String str = "welcome in java";
        new P1(str);
    }
}