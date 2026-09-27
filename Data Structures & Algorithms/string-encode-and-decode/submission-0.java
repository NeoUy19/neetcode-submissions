class Solution {
    final char delimiter = '#';
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String string : strs){
            sb.append(string.length());
            sb.append(delimiter);
            sb.append(string);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new LinkedList<>();
        char[] charArr = str.toCharArray();

        for (int i = 0 ; i < charArr.length ; i++){
            StringBuilder sb = new StringBuilder();
            while(charArr[i] != delimiter){
                sb.append(charArr[i++]);
            }
            i++;
            int numChars = Integer.valueOf(sb.toString());
            int end = i + numChars;
            sb = new StringBuilder();
            while(i < end){
                sb.append(charArr[i++]);
            }
            i--;
            result.add(sb.toString());
        }
        return result;
    }
}
