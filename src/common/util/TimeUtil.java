package common.util;


import java.text.SimpleDateFormat;

/**
 * User: mengka
 * Date: 14-5-26
 * Time: ����10:47
 */
public class TimeUtil {

    /**
     * ��String���͵�����ת��Date����
     *
     * @param dt
     *            date object
     * @param sFmt
     *            the date format
     *
     * @return the formatted string
     */
    public static String toDate(java.util.Date dt, String sFmt) {
        if (null == dt || StringUtils.isBlank(sFmt)) {
            return null;
        }
        SimpleDateFormat sdfFrom = null;
        String sRet = null;
        try {
            sdfFrom = new SimpleDateFormat(sFmt);
            sRet = sdfFrom.format(dt).toString();
        } catch (Exception ex) {
            return null;
        } finally {
            sdfFrom = null;
        }
        return sRet;
    }

    /**
     *  ��"yyyy-MM-dd hh:mm:ss"��ʽ��stringת�������
     *  <hr>
     *  ���ڸ�ʽ��
     *  <ul>
     *     <li>"yyyy-MM-dd HH:mm:ss"</li>
     *     <li>"yyyy-MM-dd"</li>
     *  </ul>
     *
     * @param sDate
     * @param sFmt �����ַ���,"yyyy-MM-dd HH:mm:ss"
     * @return
     */
    public static java.util.Date toDate(String sDate, String sFmt) {
        if (StringUtils.isBlank(sDate) || StringUtils.isBlank(sFmt)) {
            return null;
        }

        SimpleDateFormat sdfFrom = null;
        java.util.Date dt = null;
        try {
            sdfFrom = new SimpleDateFormat(sFmt);
            dt = sdfFrom.parse(sDate);
        } catch (Exception ex) {
            return null;
        } finally {
            sdfFrom = null;
        }

        return dt;
    }
}
