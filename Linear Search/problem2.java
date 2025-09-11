public class problem2 {
    public static void main(String[] args) {
        //Searching a char in String
        String name="Adithya";
        System.out.println(linearsearch(name,'A'));
        System.out.println(linearSearch2(name,'b'));
    }
    // Using normal for loop
    public static boolean linearsearch(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    // Using Enhanced for loop
    public static  boolean linearSearch2(String str,char ch){
        if(str.length()==0){
            return false;
        }
        for(char a:str.toCharArray()){
            if(a==ch){
                return  true;
            }
        }
        return  false;
    }
}
