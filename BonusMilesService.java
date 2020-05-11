public class BonusMilesService {
    public int calculate(int cost) {
        cost = 5445;
        int mile_bonus = 20;
        int mileage_per_ticket = cost / mile_bonus;
        return mileage_per_ticket;
    }

}
