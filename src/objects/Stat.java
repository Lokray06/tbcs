//package objects;
//
//import lists.Nature;
//
//public class Stat {
//    private int value;
//
//    public Stat() {
//        this.value = 0;
//    }
//
//    // Method to calculate the stat based on base stats, IV, EV, level, index, and nature
//    public void calculateStat(int[] baseStats, int[] IV, int[] EV, byte level, int index, Nature nature) {
//        // Example calculation (you should adjust based on your game mechanics)
//        // Formula: Stat = ((Base Stat + IV) * 2 + (EV / 4)) * Level / 100 + 5 (simplified)
//        value = ((baseStats[index] + IV[index]) * 2 + (EV[index] / 4)) * level / 100 + 5;
//
//        // Adjust based on nature
//        // For example, if nature affects the stat positively
//        if (nature.isBoosting(index)) {
//            value *= 1.1; // Increase by 10%
//        } else if (nature.isReducing(index)) {
//            value *= 0.9; // Decrease by 10%
//        }
//    }
//
//    public int getValue() {
//        return value;
//    }
//}
