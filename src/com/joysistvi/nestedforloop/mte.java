package com.joysistvi.nestedforloop;

public class mte {

    /*
    private char var;

    public static void main(String[] args) {

        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        mte obj1 = new mte();
        mte obj2 = obj1;
        obj1.var = 'o';
        obj2.var = 'i';

        System.out.println(var1 + ", " + var2);
        System.out.println(obj1.var + ", " + obj2.var);
    }
     */

    public static void main(String[] args) {

        /*
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a<b) ? (a<c)? a : (b<c) ? b : c : x;
        System.out.println(d);
         */

        /*
        int x = 10;
        int y = ++x;
        int z = 0;
        if (y >= 10 || y <= ++x) {
            z = x;
        } else {
            z = x++;
        }

         */

        /*
        short x = 1;

        switch (x) {
            case 1:
                System.out.println("One");
        }
         */

        /*
        String[][] arr = {{"A","B","C"}, {"D","E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j].equals("B")) {
                    continue;
                }
            }
            continue;
        }
         */

        /*
        String[] strs = {"A", "B"};
        int idx = 0;
        for (String s: strs) {
            strs[idx].concat("and" + idx);
            idx++;
        }


        int i
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }



        int idx = 0;
        switch (idx) {
            case 0: case 1:
                System.out.println("what");
                break;
            case 2:
                System.out.println("lol");
                break;
        }

         */

        /*
        int avar = 9;
        if (avar++ < 10) {
            System.out.println(avar + "a");
        } else {
            System.out.println(avar + "b");
        }

         */

        Double price = 200D;
        System.out.println(price);
    }
}
