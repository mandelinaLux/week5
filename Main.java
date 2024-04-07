
import java.lang.Math;
import java.util.HashSet;
import java.util.Scanner;

class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main pStudio = new Main();
        
        pStudio.j001();
        pStudio.j002();
        pStudio.j004();
        pStudio.j011();
        pStudio.j013();
        pStudio.j015();
        pStudio.j021();
        pStudio.j023();
        pStudio.j027();
        pStudio.j029();
    }

    void j001() {
        System.out.print("키(cm) :");
        int height = scanner.nextInt();

        System.out.print("몸무게(kg): ");
        int weight = scanner.nextInt();

        double heightDouble = (double) height * 0.01;
        double weightDouble = (double) weight;

        double bmi = weightDouble / heightDouble * heightDouble;
        System.out.println(bmi);
    }

    void j002() {
        System.out.print("섭씨온도 입력: ");
        double c_degree = scanner.nextDouble();

        double f_degree = (c_degree * 1.8) + 32;
        System.out.println(f_degree);
    }

    void j004() {
        System.out.print("입력: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("입력: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, y2 - y1));
        System.out.println(distance);
    }

    void j011() {
        System.out.print("키(cm) :");
        int height = scanner.nextInt();

        System.out.print("몸무게(kg): ");
        int weight = scanner.nextInt();

        double heightDouble = (double) height * 0.01;
        double weightDouble = (double) weight;

        double bmi = weightDouble / (heightDouble * heightDouble);

        String result;
        if (bmi >= 25) {
            result = "Yes";
        } else {
            result = "No";
        }
        System.out.println(result);
    }

    void j013() {
        System.out.print("국어, 영어, 수학 순으로 입력:");
        int kor = scanner.nextInt();
        int eng = scanner.nextInt();
        int math = scanner.nextInt();

        int total = kor + eng + math;
        double average = total / 3.0;
        System.out.println(total);
        System.out.println(average);

        System.out.println("Korean - " + (kor >= 70 ? "Pass" : "Fail"));
        System.out.println("English - " + (eng >= 70 ? "Pass" : "Fail"));
        System.out.println("Math - " + (math >= 70 ? "Pass" : "Fail"));
    }

    void j015() {
        System.out.print("입력: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max_num = Math.max(Math.max(num1, num2), num3);
        int min_num = Math.min(Math.min(num1, num2), num3);

        System.out.println(max_num);
        System.out.println(min_num);
    }

    void j021() {
        int count = 0;

        System.out.print("총 인원: ");
        int people = scanner.nextInt();

        for (int i = 0; i < people; i++) {
            System.out.print((i + 1) + "키(cm) :");
            int height = scanner.nextInt();

            System.out.print((i + 1) + "몸무게(kg): ");
            int weight = scanner.nextInt();

            double heightDouble = (double) height * 0.01;
            double weightDouble = (double) weight;
            double bmi = weightDouble / (heightDouble * heightDouble);

            if (bmi >= 25) {
                count++;
            }
        }
        System.out.println(count);
    }

    void j023() {
        System.out.print("입력: ");
        int count = scanner.nextInt();

        int totalsum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "입력: ");
            int number = scanner.nextInt();

            totalsum += number;
        }

        double average = (double) totalsum / count; // 평균

        System.out.println(totalsum);
        System.out.println(average);
    }

    void j027() {
        System.out.print("총 인원: ");
        int people = scanner.nextInt();

        int[] heights = new int[people];
        int[] weights = new int[people];

        for (int i = 0; i < people; i++) {
            System.out.print((i + 1) + "키(cm) :");
            heights[i] = scanner.nextInt();

            System.out.print((i + 1) + "몸무게(kg): ");
            weights[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < people; i++) {
            double heightDouble = (double) heights[i] * 0.01;
            double weightDouble = (double) weights[i];
            double bmi = weightDouble / (heightDouble * heightDouble);

            if (bmi >= 25) {
                System.out.println("Overweight person - " + (i +1));1 
                count++;
            }
        }
        System.out.println(count);
    }

    void j029() {
        HashSet<Integer> set = new HashSet<>();

        Integer num;
        for (int i = 0; i < 10; i++) {
           
            do {
                System.out.print((i + 1) + "입력: ");
                num = scanner.nextInt();
            } while (set.contains(num));
        
        set.add(num);
        System.out.println(num);
        }
    }
}