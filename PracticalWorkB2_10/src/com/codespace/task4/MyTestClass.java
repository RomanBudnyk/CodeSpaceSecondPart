package com.codespace.task4;

public class MyTestClass {
    private String myTopClassString = "my top class string";

    public String getMyTopClassString() {
        return myTopClassString;
    }
    public void setMyTopClassString(String myTopClassString) {
        this.myTopClassString = myTopClassString;
    }
    public void printMyStaticNestedString() {
        System.out.println(new MyStaticNested().getMyStaticString());
    }

    void test(final String string) {
        String stringInMethod = "String in Local Class";

        class MyLocal {
            private String myLocalString = "my local string";
            void simplePrint() {
                System.out.println(string);

                myTopClassString = "String from Local Class";

                MyInner myInner = new MyInner();
                myInner.myPrivateString = "String from Local";

                stringInMethod.length();
            }
            void printTopFromLocal() {
                MyTestClass myTestClass = new MyTestClass();
                System.out.println(myTestClass.getMyTopClassString() + myTopClassString);
            }
            public String getMyLocalString() {
                return myLocalString;
            }
            public void setMyLocalString(String myLocalString) {
                this.myLocalString = myLocalString;
            }
        }
        MyLocal myLocal = new MyLocal();
        myLocal.simplePrint();
    }

    static class MyStaticNested {
        private String myStaticString = "my static string";

        public void printTopFromStatic() {
            MyTestClass myTestClass = new MyTestClass();
            System.out.println(myTestClass.getMyTopClassString());

            MyInner myInner = new MyTestClass().new MyInner();
            myInner.myPrivateString = "SSS";
        }

        public String getMyStaticString() {
            return myStaticString;
        }
        public void setMyStaticString(String myStaticString) {
            this.myStaticString = myStaticString;
        }




    }

    class MyInner {
        private String myPrivateString = "my private string";

        public void printMyTopFromInner() {
            MyTestClass myTestClass = new MyTestClass();
            System.out.println(myTestClass.getMyTopClassString());

            myTopClassString = "String from Inner Class";

            MyStaticNested myStaticNested = new MyStaticNested();
            myStaticNested.myStaticString = "Static string from Inner Class";
        }

        public String getMyPrivateString() {
            return myPrivateString;
        }
        public void setMyPrivateString(String myPrivateString) {
            this.myPrivateString = myPrivateString;
        }
    }
}
