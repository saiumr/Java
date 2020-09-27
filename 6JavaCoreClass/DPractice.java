public class DPractice {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }
    static String buildInsertSql(String table, String[] fields) {
        StringBuilder sb = new StringBuilder(1024);
        int n = fields.length - 1;
        for (int i = 0; i < n; ++i) {
            sb.append(fields[i]).append(", ");
        }
        sb.append(fields[n]);
        String sd = sb.toString();
        StringBuilder s = new StringBuilder(1024);
        s.append("INSERT INTO ").append(table).append(" (").append(sd).append(") ").append("VALUES (?, ?, ?)");

        return s.toString();
    }

}