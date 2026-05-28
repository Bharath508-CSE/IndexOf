class FirstRepeatedChar {
    public static void main(String[] args) {
       String s="programming";
       String s1="";
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(s.indexOf(ch)!=s.lastIndexOf(ch))
           {
               s1+=ch;
               break;
           }
       }
       System.out.println(s1);
    }
    
}
