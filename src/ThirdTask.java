import java.util.*;

public class ThirdTask {
    String string;
    Stack<String> stack = new Stack<>(); // LIFO - last in first out
    Queue<String> queue = new LinkedList<>(); //FIFO - first in first out
    Deque<String> deque = new LinkedList<>();

    public void task() {

        Scanner in = new Scanner(System.in);
        do {
            string = in.next();
            if (!string.equals("print") && !string.equals("revert")) {
                stack.push(string);
            } else if (string.equals("print")) {
                for (int i = stack.size() - 1; i>=0; i--) {
                    System.out.println(stack.elementAt(i));
                }
            } else if (string.equals("revert")) {
                stack.pop();
            }
        } while (!string.equals("Q"));

        System.out.println(stack);
    }

}

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.

 */
