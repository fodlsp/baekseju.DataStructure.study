import java.util.Scanner;

public class Play {


    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.push 2.pop 3.전체노드보기 4.종료");
            int n = sc.nextInt();
            if (n == 4) {
                break;
            }
            switch (n) {

                case 1:

                    System.out.println("넣을 값을 입력해주세요.");
                    int data = sc.nextInt();
                    queue.add(data);
                    break;
                case 2:
                    System.out.println(queue.remove());
                    break;
                case 3:

                    break;
            }
        }
    }
}
