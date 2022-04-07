package programs;

public class ExamStringQuestion {
    public static void main(String[] args) {
        String str1 = "Java Programming is fun";
        String str2 = "But only if";
        String str3 = "You actually study for it.";
        StringBuffer strBuff1 = new StringBuffer();
        StringBuffer strBuff2 = new StringBuffer();
        StringBuffer strBuff3 = new StringBuffer();
        strBuff1.append("Length of: ").append(str1).append(" is " + str1.length());
        strBuff2.append("Length of: ").append(str2).append(" is " + str2.length());
        strBuff3.append("Length of: ").append(str3).append(" is " + str3.length());
        System.out.println(strBuff1);
        System.out.println(strBuff2);
        System.out.println(strBuff3);
        String key = "study";
        int indexKey = str3.indexOf(key);
        System.out.println("Found key at " + indexKey);
        String substr = str1.substring(12, 16);
        System.out.println("Substring is " + substr);
    }
}
