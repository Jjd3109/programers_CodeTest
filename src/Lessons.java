import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Lessons {


    /*
     * 자연수 n이 매개변수로 주어집니다.
     * n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
     * 답이 항상 존재함은 증명될 수 있습니다.
     */
    public int lessons87389(int n){
        int answer = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }

        return answer;

    }


    /*
     * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
     */

    public double lessons12944(int[] arr){
        double answer = 0;

        for(int value : arr){
            answer += value;
        }
        //1번 문제풀이
        System.out.println(answer / arr.length);

        //2번 문제풀이
        return Arrays.stream(arr).average().orElse(0);
    }


    /*
     * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
     * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
     */
    public int lessons12931(int n){
        String str = String.valueOf(n);

        int answer = 0;
        for(int i = 0; i < str.length(); i++){
            answer += (int)str.charAt(i) - '0';
        }

        return answer;

    }

    /*
     * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
     */
    public int lessons12925(String s){
        int answer = 0;
        answer = Integer.parseInt(s);

        return answer;
    }

    /*
     * 함수 solution은 정수 x와 자연수 n을 입력 받아,
     * x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
     * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
     *
     *
     * x	n	answer
         2	5	[2,4,6,8,10]
        4	3	[4,8,12]
        -4	2	[-4, -8]
     */
    public long[] lessons12924(int x, int n){
        long[] answer = new long[n];

        for(int i = 0; i < n; i++){
            answer[i] = (long)x * (i + 1);
        }

        return answer;
    }


    /*
     * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
     */

    public String lessons12939(String s){
        String answer = "";
        String[] strArr = s.split(" ");


        int[] intArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
        int min = Arrays.stream(intArr).min().getAsInt();
        int max = Arrays.stream(intArr).max().getAsInt();

        return min + " " + max;
    }

    /*
     * JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
     * 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
     * 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
     */

    public String lessons12951(String s){
        String answer = "";

        //0. 모든 문자를 소문자화 시키기.
        //1." " 있는 부분의 위치 찾기
        //2." " 있는 부분 다음의 문자를 대문자로 바꾸기
        String[] strArr = s.split("");

        for(int i = 0; i < strArr.length; i++){
            strArr[i] = strArr[i].toLowerCase();
        }


        strArr[0] = strArr[0].toUpperCase();
        for(int i = 1; i< strArr.length -1; i++){
            if(strArr[i].equals(" ")){
                strArr[i+1] = strArr[i+1].toUpperCase();
            }
        }

        //3. 배열 형태를 문자열로 만들기
        for(String n : strArr){
            answer += n;
        }
        System.out.println("결과값 : " + answer);

        return answer;

    }

//    길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다.
//    배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 이러한 과정을 배열의 길이만큼 반복하며, 두 수를 곱한 값을 누적하여 더합니다. 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다. (단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없습니다.)
//
//    예를 들어 A = [1, 4, 2] , B = [5, 4, 4] 라면
//
//    A에서 첫번째 숫자인 1, B에서 첫번째 숫자인 5를 뽑아 곱하여 더합니다. (누적된 값 : 0 + 5(1x5) = 5)
//    A에서 두번째 숫자인 4, B에서 세번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 5 + 16(4x4) = 21)
//    A에서 세번째 숫자인 2, B에서 두번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 21 + 8(2x4) = 29)
//    즉, 이 경우가 최소가 되므로 29를 return 합니다.
//
//    배열 A, B가 주어질 때 최종적으로 누적된 최솟값을 return 하는 solution 함수를 완성해 주세요.

    public int lessons12941(int[] a, int[] b) {
        int answer = 0;
        //길이가 같은 배열 A,B 두개... 각 배열은 자연수로 최소 공배수
        //A는 최소순으로 B는 최대순으로

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[a.length - 1 - i];

        }
        return answer;
    }


    public boolean lessons12909(String s){
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    // 스택이 비어있거나 짝이 맞지 않는 경우
                    return false;
                }
            }


        }

        return answer;
    }

//    배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
//
//    arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//            arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//    배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

    public int[] lessons12906(int[] arr){

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }


        return answer;
    }

//    0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.
//
//    x의 모든 0을 제거합니다.
//    x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
//    예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.
//
//     0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.

    public int[] lessons70129(String s){
        int[] answer = new int[2];

        int countConversion = 0;
        int countZero = 0;

        while (!s.equals("1")) {
            countConversion++;
            int zeroCount = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeroCount++;
                }
            }
            countZero += zeroCount;

            s = Integer.toBinaryString(s.length() - zeroCount);
        }

        answer[0] = countConversion;
        answer[1] = countZero;


        return answer;
    }

//
//    Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.
//
//        1 + 2 + 3 + 4 + 5 = 15
//        4 + 5 + 6 = 15
//        7 + 8 = 15
//        15 = 15
//    자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.
    public int lessons12924(int n){
        int answer = 0;

        int start = 1;

        while(start <= n){
            int sum = 0;
            for(int i = start; sum < n; i++){
                sum += i; //
                if(sum == n){
                    answer ++;
                    break;
                }
                else if(sum > n){
                    break;
                }
            }
            start ++;
        }


        return answer;

    }


//    다음 큰 숫자
//
//    자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
//
//    조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
//    조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
//    조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
//    예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.
//
//    자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.
//
//    제한 사항
//    n은 1,000,000 이하의 자연수 입니다.

    public int lessons12911(int n){

        //조건 1. n을 2진수로 변환 했을 때의 1의 갯수
        int oneCount = Integer.bitCount(n);

        //조건 2. n의 다음 큰숫자는 1 , 2를 만족
        for (int i = n + 1; ; i++) {
            if (Integer.bitCount(i) == oneCount) {

                return i;
            }
        }

    }

//    피보나치 수
//    피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
//
//    예를들어
//
//    F(2) = F(0) + F(1) = 0 + 1 = 1
//    F(3) = F(1) + F(2) = 1 + 1 = 2
//    F(4) = F(2) + F(3) = 1 + 2 = 3
//    F(5) = F(3) + F(4) = 2 + 3 = 5
//    와 같이 이어집니다.
//
//2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.

    public int lessons12945(int n){

        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i <= n; i++) {
            result[i] = (result[i-2] + result[i-1]) % 1234567;
        }

        return result[n];
    }


}
