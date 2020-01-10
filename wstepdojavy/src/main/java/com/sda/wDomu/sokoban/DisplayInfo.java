package com.sda.wDomu.sokoban;


 class DisplayInfo {


     static void wyswietl(int level, int move, int goals ) {
        System.out.println("Level: "+level);
        System.out.println("Move: "+move+"");
        System.out.println("Goals: "+goals+"\n");
        System.out.println("Enter Q to quit");
        System.out.println("Enter backspace key to return");
        System.out.println("Enter W, A, S, D  to to move up, left, down and right, respectively");

    }
}


