class StringManipulation{
    public String trimAndConcat(String string1, String string2){
        String trimstring1 = string1.trim();
        String trimstring2 = string2.trim();
        String string0 = trimstring1.concat(trimstring2);
        return string0;
    }
    public Integer getIndexOrNull(String string, char letter){
        int a = string.indexOf(letter);
        if (a == -1){
            return null;
        }
        return a;
    }
    public Integer getIndexOrNull(String string, String word){
        int a = string.indexOf(word);
        if (a == -1){
            return null;
        }
        return a;
    }
    public String concatSubstring(String string1, int num1, int num2, String string2)
}