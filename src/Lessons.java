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

}
