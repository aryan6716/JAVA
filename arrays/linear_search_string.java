public class linear_search_string {
    public static int linear_search(String str, char find) {
        if (str.length() == 0)
            return -1;
        for (int i = 0; i < str.length(); i++) {
            if (find == str.charAt(i)) {
                System.out.println("found at index: " + i);
                return i;
            }
        }
        System.out.print("index not found:\n");
        return -1;
    }

    public static void main(String[] args) {
        String str = "aryan";
        char find = 'r';
        linear_search(str, find);
    }
}
