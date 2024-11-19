package ROBOTSSRUSAKSAFRIZAL;

public class RobotDemo {
    public static void main(String[] args) {
        // 1. Heterogeneous Collection
        Robot[] robots = {
            new CustomerSupportRobot(),
            new LogisticsRobot(),
            new DataAnalysisRobot()
        };

        for (Robot robot : robots) {
            robot.executeTask(); // Polymorphic method
        }

        // 2. Object Casting
        CustomerSupportRobot csRobot = (CustomerSupportRobot) robots[0];
        csRobot.assistCustomer();

        // 3. Polymorphic Argument
        performRobotTask(new LogisticsRobot());

        // 4. InstanceOf
        for (Robot robot : robots) {
            if (robot instanceof DataAnalysisRobot) {
                ((DataAnalysisRobot) robot).analyzeData();
            }
        }
    }

    // Method accepting polymorphic arguments
    public static void performRobotTask(Robot robot) {
        System.out.println("Performing task for " + robot.getClass().getSimpleName());
        if (robot instanceof LogisticsRobot) {
            ((LogisticsRobot) robot).manageInventory();
        }
    }
}