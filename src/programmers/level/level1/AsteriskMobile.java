package programmers.level.level1;


import java.util.List;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.11.27
 * Programmers algorithm
 * 핸드폰 번호 가리기
 * 전화번호가 문자열 phone_number로 주어졌을 때,
 * 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 *     입력           출력
 * 01033334444   *******4444
 */
public class AsteriskMobile {

    private static final String REPLACE_MOBILE_NUMBER = "01028613278";
    public static void main(String[] args) {

        String answer = solution(REPLACE_MOBILE_NUMBER);
        System.out.println(answer);
    }

    public static String solution(String mobileNumber) {

        StringBuffer replaceMobile = new StringBuffer();


        for( int i = 0 ; i < mobileNumber.length(); i++ ){

            if(i >= mobileNumber.length() - 4 || '-' == mobileNumber.charAt(i)) {
                replaceMobile.append(mobileNumber.charAt(i));
            } else {
                replaceMobile.append("*");
            }
        }
        return replaceMobile.toString();
    }
}
