package FullTest3;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Scanner;
import javax.script.ScriptException;

public class Calculator {
    public static void main(String[] args) throws ScriptException {
       Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        System.out.print(engine.eval(str));

    }
}
