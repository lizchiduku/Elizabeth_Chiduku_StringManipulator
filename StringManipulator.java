public class StringManipulator {
    public String trimAndConcat(String string1, String string2){
        return string1.trim()+string2.trim();
    }
    public int getIndexOrNull(String fullstring, char findchar){
        return fullstring.indexOf(findchar);
    }
    public int getIndexOrNull(String fullstring, String findstring){
        return fullstring.indexOf(findstring);
    }
    String concatSubstring(String string1, int start, int end, String string2) {
        return string1.substring(start,end)+string2;
    }
}