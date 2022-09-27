package Lesson_7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Java17InstanceOf {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));

        List<ListNode> list = new LinkedList();

        while (true) {
            list.add(head);
            if(head.next == null) {
                break;
            }
            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;


        for (int i = list.size() - 1; i >= 0; i--) {

            tail.next = new ListNode(list.get(i).val, new ListNode());
            tail = tail.next;



            System.out.print(list.get(i).val);

        }


        System.out.println(dummy);
    }

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++ ) {
            if (nums[i] + nums[i + 1] == target) {
                return new int[]{i, i + 1};
            }
        }

        throw new RuntimeException("нет совпадений");
    }


    // после instanceof можно сразу объявлять переменную и использовать ее,
    // называется такая фича Pattern matching for instanceof
    public void processValue(Object obj) {
        if (obj instanceof String s) {
            System.out.println("String " + s.trim());
        } else if (obj instanceof LocalDate date) {
            System.out.println("Date: " + DateTimeFormatter.ISO_DATE.format(date));
        } else {
            System.out.println("Something else");
        }
    }

    // старая запись, нужно дополнительно объявлять переменную
    public void processValueOld(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println("String " + s.trim());
        } else if (obj instanceof LocalDate) {
            LocalDate date = (LocalDate) obj;
            System.out.println("Date: " + DateTimeFormatter.ISO_DATE.format(date));
        } else {
            System.out.println("Something else");
        }
    }

    // интересные эффекты
    public void processValueEff(Object obj) {
        // объявляем переменную и сразу используем
        if (obj instanceof String s && !s.isEmpty()) {
            System.out.println("String: " + s.trim());
        }

        // область действия можно использовать и после блока if
        if (!(obj instanceof String s) || !s.isEmpty()) {
            return;
        }

        System.out.println("String: " + s.trim());
    }

}
