public class Main {
    public static void main(String[] args) {
        String[] strings={"waffle iron","waffle iron","waffle iron","waffle iron","waffle iron",
                "waffle iron","waffle iron","waffle iron","waffle iron","waffle iron","waffle iron","cat kitty cat cat","cat kitty cat cat","Cakes are delightful","Cakes are delightful",
                "Ca kes are delightful","Cakes are delightful","Cakes are delightful","Cakes are delightful","Cakes are delightful",
                "Ca kes are delightful","Cakes are delightful","Cakes are delightful","Cakes are delightful","Cakes are delightful",
                "Ca kes are delightful",};
       StringCounter counter=new StringCounter(strings);
       counter.countStrings();
    }
}