import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorersWithDatagokr_self {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
         * 지진해일 관련 긴급대피장소에 대한 시도명, 시군구명, 대피지구명, 위/경도 값을 제공하는 지진해일 긴급대피 장소 서비스
         * https://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List
         * ?serviceKey=UEohFgDSeIH%2B3Id96m3wr%
         * 2FZlkE4dgaJMCfYi2OLGzxIShY6I6vcU6zicFQIRKU%2F5LE7kB0XrMwx1x6RgXL0RAA%3D%3D
         * &pageNo=1
         * &numOfRows=10
         * &type=xml
         */

        StringBuilder urlBuilder = new StringBuilder(
                "https://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List"); /* URL */
        // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
        // Service Key
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8") + "=").append(
                "UEohFgDSeIH%2B3Id96m3wr%2FZlkE4dgaJMCfYi2OLGzxIShY6I6vcU6zicFQIRKU%2F5LE7kB0XrMwx1x6RgXL0RAA%3D%3D");
        // 페이지 번호
        urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "="
                + URLEncoder.encode("1", "UTF-8"));
        // 한 페이지 결과 수
        urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8"));
        // XML 또는 JSON
        urlBuilder.append("&" + URLEncoder.encode("type", "UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8"));

        URL url;
        HttpURLConnection conn = null;
        try {
            url = new URL(urlBuilder.toString());
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            // conn.setRequestProperty(null, null);
            System.out.println("Response code : " + conn.getResponseCode());

            BufferedReader reader = null;
            if (conn.getResponseCode() >= 200 && conn.getResponseCode() < 300) { // 정상(보통 코드가 200 ~ 300사이)
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else { // 비정상
                reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }

            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }
            reader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            conn.disconnect();
        }
    }
}
