class SearchInString{
    public static void main(String[] args) {
        String Name = "John Snow" ;
        String target = "h";
    }

    static  boolean Searchinstring(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (target == str.charAt(i)){
                return true;

            } else {
              return   false;
            }
        }
        return false;
    }
}