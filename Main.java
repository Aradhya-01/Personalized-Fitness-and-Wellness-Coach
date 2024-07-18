import java.util.ArrayList;
import java.util.Scanner;

// Ingredient Class
class Ingredient {
    private String name;
    private double quantity; // Quantity in grams

    public Ingredient(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getQuantity() { return quantity; }
    public void setQuantity(double quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

// User Class
class User {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String fitnessGoal;
    private ArrayList<Activity> activities;
    private Nutrition nutrition;
    private ArrayList<MentalWellnessTip> mentalWellnessTips;

    public User(String name, int age, double weight, double height, String fitnessGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.fitnessGoal = fitnessGoal;
        this.activities = new ArrayList<>();
        this.nutrition = new Nutrition();
        this.mentalWellnessTips = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public String getFitnessGoal() { return fitnessGoal; }
    public void setFitnessGoal(String fitnessGoal) { this.fitnessGoal = fitnessGoal; }

    public ArrayList<Activity> getActivities() { return activities; }
    public void addActivity(Activity activity) { this.activities.add(activity); }

    public Nutrition getNutrition() { return nutrition; }
    public void setNutrition(Nutrition nutrition) { this.nutrition = nutrition; }

    public ArrayList<MentalWellnessTip> getMentalWellnessTips() { return mentalWellnessTips; }
    public void addMentalWellnessTip(MentalWellnessTip tip) { this.mentalWellnessTips.add(tip); }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", fitnessGoal='" + fitnessGoal + '\'' +
                ", activities=" + activities +
                ", nutrition=" + nutrition +
                ", mentalWellnessTips=" + mentalWellnessTips +
                '}';
    }
}

// Activity Class
class Activity {
    private String type;
    private int duration; // in minutes
    private int caloriesBurned;

    public Activity(String type, int duration, int caloriesBurned) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    // Getters and Setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public int getCaloriesBurned() { return caloriesBurned; }
    public void setCaloriesBurned(int caloriesBurned) { this.caloriesBurned = caloriesBurned; }

    @Override
    public String toString() {
        return "Activity{" +
                "type='" + type + '\'' +
                ", duration=" + duration +
                ", caloriesBurned=" + caloriesBurned +
                '}';
    }
}

// WorkoutPlan Class
class WorkoutPlan {
    private String name;
    private ArrayList<Activity> activities;

    public WorkoutPlan(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public ArrayList<Activity> getActivities() { return activities; }
    public void addActivity(Activity activity) { this.activities.add(activity); }

    @Override
    public String toString() {
        return "WorkoutPlan{" +
                "name='" + name + '\'' +
                ", activities=" + activities +
                '}';
    }
}

// Nutrition Class
class Nutrition {
    private int calories;
    private int protein; // in grams
    private int carbs; // in grams
    private int fats; // in grams

    public Nutrition() {
        this.calories = 0;
        this.protein = 0;
        this.carbs = 0;
        this.fats = 0;
    }

    // Getters and Setters
    public int getCalories() { return calories; }
    public void setCalories(int calories) { this.calories = calories; }

    public int getProtein() { return protein; }
    public void setProtein(int protein) { this.protein = protein; }

    public int getCarbs() { return carbs; }
    public void setCarbs(int carbs) { this.carbs = carbs; }

    public int getFats() { return fats; }
    public void setFats(int fats) { this.fats = fats; }

    @Override
    public String toString() {
        return "Nutrition{" +
                "calories=" + calories +
                ", protein=" + protein +
                ", carbs=" + carbs +
                ", fats=" + fats +
                '}';
    }
}

// MentalWellnessTip Class
class MentalWellnessTip {
    private String tip;

    public MentalWellnessTip(String tip) {
        this.tip = tip;
    }

    // Getters and Setters
    public String getTip() { return tip; }
    public void setTip(String tip) { this.tip = tip; }

    @Override
    public String toString() {
        return "MentalWellnessTip{" +
                "tip='" + tip + '\'' +
                '}';
    }
}

// FitnessCoachSystem Class
class FitnessCoachSystem {
    private ArrayList<User> users;
    private ArrayList<WorkoutPlan> workoutPlans;
    private ArrayList<MentalWellnessTip> mentalWellnessTips;

    public FitnessCoachSystem() {
        this.users = new ArrayList<>();
        this.workoutPlans = new ArrayList<>();
        this.mentalWellnessTips = new ArrayList<>();
        initializeWorkoutPlans();
        initializeMentalWellnessTips();
    }

    // Initialize Workout Plans
    private void initializeWorkoutPlans() {
        WorkoutPlan weightLossPlan = new WorkoutPlan("Weight Loss");
        weightLossPlan.addActivity(new Activity("Running", 30, 300));
        weightLossPlan.addActivity(new Activity("HIIT", 30, 450));

        WorkoutPlan muscleGainPlan = new WorkoutPlan("Muscle Gain");
        muscleGainPlan.addActivity(new Activity("Weight Lifting", 45, 600));
        muscleGainPlan.addActivity(new Activity("Bodyweight Exercises", 30, 450));

        WorkoutPlan maintenancePlan = new WorkoutPlan("Maintenance");
        maintenancePlan.addActivity(new Activity("Cycling", 45, 400));
        maintenancePlan.addActivity(new Activity("Swimming", 45, 450));

        workoutPlans.add(weightLossPlan);
        workoutPlans.add(muscleGainPlan);
        workoutPlans.add(maintenancePlan);
    }

    // Initialize Mental Wellness Tips
    private void initializeMentalWellnessTips() {
        mentalWellnessTips.add(new MentalWellnessTip("Practice mindfulness and meditation."));
        mentalWellnessTips.add(new MentalWellnessTip("Ensure you get adequate sleep each night."));
        mentalWellnessTips.add(new MentalWellnessTip("Stay hydrated and eat a balanced diet."));
        mentalWellnessTips.add(new MentalWellnessTip("Take regular breaks and manage your stress."));
    }

    // Add User to the System
    public void addUser(User user) {
        users.add(user);
    }

    // Generate Workout Plan for User
    public void generateWorkoutPlan(User user) {
        System.out.println("\n===== Workout Plan =====");
        if (user.getWeight() < 50) {
            System.out.println("Weight below 50kg: Focus on gaining muscle and strength.");
            WorkoutPlan muscleGainPlan = new WorkoutPlan("Muscle Gain for Low Weight");
            muscleGainPlan.addActivity(new Activity("Strength Training", 45, 500));
            muscleGainPlan.addActivity(new Activity("Calisthenics", 30, 300));
            user.addActivity(muscleGainPlan.getActivities().get(0)); // Simplified: adding first activity
            System.out.println("Generated Muscle Gain Workout Plan for " + user.getName() + ": \n" + muscleGainPlan);
        } else if (user.getWeight() >= 50 && user.getWeight() <= 80) {
            if (user.getFitnessGoal().equalsIgnoreCase("Weight Loss")) {
                System.out.println("Generating Weight Loss Workout Plan...");
                for (WorkoutPlan plan : workoutPlans) {
                    if (plan.getName().equalsIgnoreCase("Weight Loss")) {
                        user.addActivity(plan.getActivities().get(0)); // Simplified: adding first activity
                        System.out.println("Generated Workout Plan for " + user.getName() + ": \n" + plan);
                        return;
                    }
                }
            } else if (user.getFitnessGoal().equalsIgnoreCase("Muscle Gain")) {
                System.out.println("Generating Muscle Gain Workout Plan...");
                for (WorkoutPlan plan : workoutPlans) {
                    if (plan.getName().equalsIgnoreCase("Muscle Gain")) {
                        user.addActivity(plan.getActivities().get(0)); // Simplified: adding first activity
                        System.out.println("Generated Workout Plan for " + user.getName() + ": \n" + plan);
                        return;
                    }
                }
            } else {
                System.out.println("Generating Maintenance Workout Plan...");
                for (WorkoutPlan plan : workoutPlans) {
                    if (plan.getName().equalsIgnoreCase("Maintenance")) {
                        user.addActivity(plan.getActivities().get(0)); // Simplified: adding first activity
                        System.out.println("Generated Workout Plan for " + user.getName() + ": \n" + plan);
                        return;
                    }
                }
            }
        } else {
            System.out.println("Weight above 80kg: Focus on balanced fitness and maintenance.");
            WorkoutPlan maintenancePlan = new WorkoutPlan("Balanced Maintenance");
            maintenancePlan.addActivity(new Activity("Moderate Cycling", 45, 350));
            maintenancePlan.addActivity(new Activity("Moderate Swimming", 45, 450));
            user.addActivity(maintenancePlan.getActivities().get(0)); // Simplified: adding first activity
            System.out.println("Generated Balanced Maintenance Workout Plan for " + user.getName() + ": \n" + maintenancePlan);
        }
    }

    // Provide Nutrition Advice for User
    public void provideNutritionAdvice(User user) {
        System.out.println("\n===== Nutrition Advice =====");
        Nutrition nutrition = new Nutrition();
        if (user.getWeight() < 50) {
            nutrition.setCalories(2200); // Moderate calorie intake
            nutrition.setProtein((int) (1.5 * user.getWeight()));
            nutrition.setCarbs(250);
            nutrition.setFats(70);
            System.out.println("Provided Nutrition Advice for Low Weight (" + user.getWeight() + "kg): \n" + nutrition);
        } else if (user.getWeight() >= 50 && user.getWeight() <= 80) {
            if (user.getFitnessGoal().equalsIgnoreCase("Weight Loss")) {
                nutrition.setCalories(1800); // Lower calorie intake
                nutrition.setProtein((int) (1.5 * user.getWeight()));
                nutrition.setCarbs(150);
                nutrition.setFats(60);
                System.out.println("Provided Weight Loss Nutrition Advice for " + user.getName() + ": \n" + nutrition);
            } else if (user.getFitnessGoal().equalsIgnoreCase("Muscle Gain")) {
                nutrition.setCalories(2800); // Higher calorie intake
                nutrition.setProtein((int) (2 * user.getWeight()));
                nutrition.setCarbs(400);
                nutrition.setFats(80);
                System.out.println("Provided Muscle Gain Nutrition Advice for " + user.getName() + ": \n" + nutrition);
            } else {
                nutrition.setCalories(2400); // Balanced calorie intake
                nutrition.setProtein((int) (1.5 * user.getWeight()));
                nutrition.setCarbs(250);
                nutrition.setFats(70);
                System.out.println("Provided Maintenance Nutrition Advice for " + user.getName() + ": \n" + nutrition);
            }
        } else {
            nutrition.setCalories(2600); // Higher calorie intake
            nutrition.setProtein((int) (1.5 * user.getWeight()));
            nutrition.setCarbs(300);
            nutrition.setFats(80);
            System.out.println("Provided Nutrition Advice for High Weight (" + user.getWeight() + "kg): \n" + nutrition);
        }

        // Advanced Nutritional Tips
        provideAdvancedNutritionalTips(user);
    }

    // Provide Advanced Nutritional Tips
    private void provideAdvancedNutritionalTips(User user) {
        System.out.println("\n===== Advanced Nutritional Tips =====");
        if (user.getWeight() < 50) {
            System.out.println("For gaining weight: Include more protein-rich foods like chicken, tofu, and legumes.");
            System.out.println("Add healthy fats such as avocados, nuts, and seeds to your diet.");
        } else if (user.getWeight() >= 50 && user.getWeight() <= 80) {
            if (user.getFitnessGoal().equalsIgnoreCase("Weight Loss")) {
                System.out.println("For weight loss: Focus on high-fiber foods like vegetables, fruits, and whole grains.");
                System.out.println("Limit sugary drinks and snacks, and increase water intake.");
            } else if (user.getFitnessGoal().equalsIgnoreCase("Muscle Gain")) {
                System.out.println("For muscle gain: Incorporate lean meats, eggs, and dairy products.");
                System.out.println("Consider protein supplements if needed, but prioritize whole foods.");
            } else {
                System.out.println("For maintenance: Maintain a balanced diet with moderate portions of protein, carbs, and fats.");
                System.out.println("Ensure regular intake of fruits and vegetables for overall health.");
            }
        } else {
            System.out.println("For high weight: Focus on low-calorie, nutrient-dense foods to manage weight.");
            System.out.println("Regularly consume fiber-rich foods and stay hydrated.");
        }
    }

    // Provide Mental Wellness Tips for User
    public void provideMentalWellnessTips(User user) {
        System.out.println("\n===== Mental Wellness Tips =====");
        for (MentalWellnessTip tip : mentalWellnessTips) {
            user.addMentalWellnessTip(tip);
        }
        if (user.getFitnessGoal().equalsIgnoreCase("Weight Loss")) {
            System.out.println("Mental Wellness Tips for Weight Loss: ");
        } else if (user.getFitnessGoal().equalsIgnoreCase("Muscle Gain")) {
            System.out.println("Mental Wellness Tips for Muscle Gain: ");
        } else {
            System.out.println("Mental Wellness Tips for Maintenance: ");
        }
        for (MentalWellnessTip tip : user.getMentalWellnessTips()) {
            System.out.println("- " + tip.getTip());
        }
    }

    // Suggest Additional Activities
    public void suggestAdditionalActivities(User user) {
        System.out.println("\n===== Suggested Additional Activities =====");
        if (user.getWeight() < 50) {
            System.out.println("Consider adding more strength training and resistance exercises.");
        } else if (user.getWeight() >= 50 && user.getWeight() <= 80) {
            if (user.getFitnessGoal().equalsIgnoreCase("Weight Loss")) {
                System.out.println("Add activities like brisk walking or low-impact cardio to your routine.");
            } else if (user.getFitnessGoal().equalsIgnoreCase("Muscle Gain")) {
                System.out.println("Incorporate compound movements like squats and deadlifts for optimal muscle growth.");
            } else {
                System.out.println("Engage in a mix of cardio and strength training for balanced fitness.");
            }
        } else {
            System.out.println("Opt for low-impact activities to avoid joint stress, such as swimming or cycling.");
        }
    }

    // Customize Workout Plan
    public void customizeWorkoutPlan(User user) {
        System.out.println("\n===== Customize Your Workout Plan =====");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to add a new activity to your workout plan? (yes/no)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter activity type:");
            String type = scanner.nextLine();

            System.out.println("Enter duration (in minutes):");
            int duration = scanner.nextInt();

            System.out.println("Enter calories burned:");
            int caloriesBurned = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            Activity newActivity = new Activity(type, duration, caloriesBurned);
            user.addActivity(newActivity);

            System.out.println("Added new activity: " + newActivity);
        }

        System.out.println("Would you like to remove an existing activity? (yes/no)");
        response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter the index of the activity to remove (0 to " + (user.getActivities().size() - 1) + "):");
            int index = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            if (index >= 0 && index < user.getActivities().size()) {
                Activity removedActivity = user.getActivities().remove(index);
                System.out.println("Removed activity: " + removedActivity);
            } else {
                System.out.println("Invalid index.");
            }
        }

        System.out.println("Customized Workout Plan for " + user.getName() + ": ");
        for (Activity activity : user.getActivities()) {
            System.out.println("- " + activity);
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FitnessCoachSystem system = new FitnessCoachSystem();

        // Input User Details
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter your weight (in kg):");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height (in cm):");
        double height = scanner.nextDouble();
        scanner.nextLine(); // consume newline character

        System.out.println("Enter your fitness goal (Weight Loss/Muscle Gain/Maintenance):");
        String fitnessGoal = scanner.nextLine();

        // Create User
        User user = new User(name, age, weight, height, fitnessGoal);
        system.addUser(user);

        // Generate Workout Plan
        system.generateWorkoutPlan(user);

        // Provide Nutrition Advice
        system.provideNutritionAdvice(user);

        // Provide Mental Wellness Tips
        system.provideMentalWellnessTips(user);

        // Suggest Additional Activities
        system.suggestAdditionalActivities(user);

        // Customize Workout Plan
        system.customizeWorkoutPlan(user);

        scanner.close();
    }
}
