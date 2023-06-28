package br.com.guikappaun;

public class Tarefa {
    public static void main(String args[]) {
        Primitivo();
        Wrapper();
    }
    private static void Primitivo() {
        int i = 10;
        System.out.println(i);
    }
    private static void Wrapper() {
        Integer i1 = 10;
        System.out.println(i1);
    }
}
