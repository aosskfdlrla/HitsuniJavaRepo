package com.hitsuni.section01.conditional;

public class Application {
    public static void main(String[] args) {
        num_if nif = new num_if();
        // nif.testSimpleIfStatement();
        // nif.testNestIfStatement();

        num_ifElse numIfElse = new num_ifElse();
        // numIfElse.testSimpleIfElseStatement();
        // numIfElse.testNestedIfElseStatement();

        num_IfElseIf numIfElseIf = new num_IfElseIf();
        //numIfElseIf.testSimpleIfElseIfStatement();
        //numIfElseIf.testNestIfElseIfStatement();
        //numIfElseIf.importNestIfElseIfStatement();
        SwitchNum swn = new SwitchNum();
        swn.testSimpleSwitchStatement();
    }
}
