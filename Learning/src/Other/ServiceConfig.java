package Other;
import java.util.Map;

public class ServiceConfig {

    private String tickTupleFrequencys;
    private Map<String, String> users;
    private Map<String, String> dailyStatistics;

    public ServiceConfig() {
    }

    public String getTickTupleFrequencys() {
        return tickTupleFrequencys;
    }

    public void setTickTupleFrequencys(String tickTupleFrequencys) {
        this.tickTupleFrequencys = tickTupleFrequencys;
    }

    public Map<String, String> getUsers() {
        return users;
    }

    public void setUsers(Map<String, String> users) {
        this.users = users;
    }

    public Map<String, String> getDailyStatistics() {
		return dailyStatistics;
    }

    public void setDailyStatistics(Map<String, String> dailyStatistics) {
        this.dailyStatistics = dailyStatistics;
    }
}