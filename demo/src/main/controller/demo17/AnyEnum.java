package demo17;

interface d {
    public String getDescription();

    public int getI();
}

public enum AnyEnum implements d {
    Constants_A {//可以在枚举类型成员内部设置方法

        public String getDescription() {
            return ("我是枚举成员 A");

        }

        public int getI() {
            return 2;
        }

    },
    Constants_B {
        public String getDescription() {
            return ("我是枚举成员 B");
        }

        public int getI() {
            return 3;
        }
    },
    Constants_C {
        public String getDescription() {
            return ("我是枚举成员 C");
        }

        public int getI() {
            return 4;
        }
    };
//    private  static int i=5;//定义全局的数值
    public static void main(String[] args) {
        for(int i=0;i<AnyEnum.values().length;i++){
            System.out.println(AnyEnum.values()[i]+"调用getDescription()方法为："+AnyEnum.values()[i].getDescription());
            System.out.println(AnyEnum.values()[i]+"调用getI()方法为："+AnyEnum.values()[i].getI());
        }
    }
}
