package problem.solving;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MinimumTerminal {
    public static void main(String[] args) {
        MinimumTerminal minimumTerminal = new MinimumTerminal();
        int terminalRequired = minimumTerminal.calculate(minimumTerminal.getSchedule());
        System.out.println("No of terminal required is : "+ terminalRequired);
    }

    private List<Timing> getSchedule(){
        List<Timing> schedule = new ArrayList<>();

        schedule.add(new Timing(LocalTime.parse("10:00"),LocalTime.parse("10:15")));
        schedule.add(new Timing(LocalTime.parse("10:10"),LocalTime.parse("10:15")));
        schedule.add(new Timing(LocalTime.parse("10:15"),LocalTime.parse("10:20")));
        schedule.add(new Timing(LocalTime.parse("10:25"),LocalTime.parse("10:35")));
        schedule.add(new Timing(LocalTime.parse("10:25"),LocalTime.parse("10:30")));
        schedule.add(new Timing(LocalTime.parse("10:30"),LocalTime.parse("10:40")));
        schedule.add(new Timing(LocalTime.parse("10:30"),LocalTime.parse("10:40")));
        schedule.add(new Timing(LocalTime.parse("10:30"),LocalTime.parse("10:40")));
        schedule.add(new Timing(LocalTime.parse("10:30"),LocalTime.parse("10:45")));
        schedule.add(new Timing(LocalTime.parse("10:35"),LocalTime.parse("10:45")));
        schedule.add(new Timing(LocalTime.parse("10:40"),LocalTime.parse("10:50")));

        return schedule;
    }

    public int calculate(List<Timing> schedule){
        int max = 0;
        int terminal = 0;
        List<LocalTime> departures = new LinkedList<>();
        for(int i = 0; i < schedule.size(); i++){
            Timing  timing = schedule.get(i);
            if(!departures.isEmpty()) {
                int freeCount = freeTerminal(departures, timing.getArrival());
                terminal = terminal - freeCount;
            }
            departures.add(timing.getDeparture());
            terminal++;
            if(terminal > max){
                max = terminal;
            }
        }
        return max;
    }

    private int freeTerminal(List<LocalTime> departures, LocalTime arrival){
        int startCount = departures.size();

        for(int i = 0; i < departures.size(); i++){
            LocalTime depTime = departures.get(i);
            if(depTime.equals(arrival) || depTime.isBefore(arrival)){
                departures.remove(depTime);
            }
        }
        return startCount - departures.size();
    }
    class Timing{

        private final LocalTime arrival;
        private final LocalTime departure;

        public Timing(LocalTime arrival, LocalTime departure) {
            this.arrival = arrival;
            this.departure = departure;
        }

        public LocalTime getArrival() {
            return arrival;
        }

        public LocalTime getDeparture() {
            return departure;
        }
    }
}
