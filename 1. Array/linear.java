public class linear {

    static int linearSearch(String str,char key){
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        String arr = "Mithun";
        System.out.println(linearSearch(arr,'U'));;
    }
}