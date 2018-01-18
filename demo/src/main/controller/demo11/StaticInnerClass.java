package demo11;

public class StaticInnerClass {
    int x=100;
    static class Inner{
        private String x;
        void doitInner(){
            System.out.println("外部类"+x);
        }
    }
}
