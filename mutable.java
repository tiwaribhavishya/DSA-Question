public class mutable {
    public static void main(String[] args) {
    //     StringBuffer s1 = new StringBuffer("virat");
    //     System.out.println(s1);
    //     s1.append("kohli");
    //     System.out.println(s1);
           
           //using finalkeyword
       // final StringBuffer sb = new StringBuffer("virat");
           //sb.append("kohli");
          // System.out.println(sb);
          // sb = new StringBuffer("sachin");
          //System.out.println(sb);

         //  StringBuilder sb = new StringBuilder();
         //  System.out.println(sb.capacity());
         //  sb.append("hdbnjhcbis bchbbdcghshcbsgbfaddcsuddcsbbadv");
         //  System.out.println(sb.capacity());

         StringBuffer sb2 = new StringBuffer("Sachin");
         System.out.println(sb2);
         System.out.println(sb2.capacity());
         System.out.println(sb2.charAt(2));
         sb2.setCharAt(1,'A'); // It is using for replace charecture:
         System.out.println(sb2);







     }
}
