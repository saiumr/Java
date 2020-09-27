import java.util.StringJoiner;

public class FPractice {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }
    static String buildSelectSql(String table, String[] fields) {
        StringJoiner s = new StringJoiner(", ", "SELECT ", " FROM " + table);
        int len = fields.length;
        for (int i = 0; i < len-1; ++i) {
            s.add(fields[i]);
        }
        s.add(fields[len-1]);
        return s.toString();
    }

}