package com.company;

public class Tree {
    public Tree(String str, int i) {
    }

    public static void main(String[] args) {
Tree inst=new Tree("Значение", 10);
        Tree inst2=new Tree( "Значение2",  10);
        Tree inst3=new Tree("Значение", 10);
        System.out.println(inst.equals(inst2));
        System.out.println(inst.equals(inst3));
    }




}
