package demo11;

public class TheSameName {
    private int x;
    private class Inner{
        private int x=9;
        public void doit(){
            x++;
            this.x++;//调用内部类的成员变量x
            TheSameName.this.x++;//调用外部类的成员变量x
        }
    }
}
