public class Testing {

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] str = s.split(" ");
        String[] str1 = new String[str.length];
        for(int i=0; i<str.length; i++) {
            System.out.println(str[i].charAt(str[i].length()-1));
            System.out.println(str[i].charAt(str[i].length()-1));
            //System.out.println(str1[Character.getNumericValue(str[i].charAt(str[i].length()-1))]);
            str1[Character.getNumericValue(str[i].charAt(str[i].length()-1))] = str[i].substring(0, Character.getNumericValue(str[i].charAt(str[i].length()-1)));
        }
        System.out.println(str1.toString());
    }
}
