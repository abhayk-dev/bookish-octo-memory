class kaaju {
    public static void main(String[] args) {
        char[] h = {'a', 'b', 'c', 'd', 'e', 'd', 'c', 'b', 'a'};

        for (int i = 0, j = 8; i < 4; i++, j--) {
            if (h[i] == h[j]) {
                System.out.println("plaindrome");
            } else {
                System.out.println("not plaindrome");
                break;
            }
        }
    }
}
