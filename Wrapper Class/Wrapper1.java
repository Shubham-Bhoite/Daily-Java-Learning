class Wrapper1 {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(100);
        int b = a; // autounboxing
        int c = a.intValue(); 
        System.out.println(c);
    }
}
