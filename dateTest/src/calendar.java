import java.util.Calendar;

public class calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("当天时间" + calendar.getTime());

        // 获得年份
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        // 获得月份
        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.println(month);
        // 获得日期
        int date = calendar.get(Calendar.DATE);
        System.out.println(date);
        // 获得小时
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);
        // 获得分钟
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println(minute);
        // 获得秒
        int second = calendar.get(Calendar.SECOND);
        System.out.println(second);
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);

    }
}
