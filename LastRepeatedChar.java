class LastRepeatedChar {
    public static void main(String[] args) {
       String s="programming";
       char c=' ';
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(s.indexOf(ch)!=s.lastIndexOf(ch))
           {
               c=ch;
           }
       }
       System.out.println(c);
    }
    
}
