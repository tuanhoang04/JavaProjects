public class Stringendswith {
    public static boolean solution(String str, String ending) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        StringBuffer sc = new StringBuffer(ending);
        sc.reverse();

        if(sb.length()<sc.length()){return false;}
        String ss = sc.toString();
        if (sb.substring(0,sc.length()).equals(ss)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        solution("", "");
    }
}
