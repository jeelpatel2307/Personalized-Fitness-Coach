import java.util.Scanner;

// Enum to represent different fitness goals
enum FitnessGoal {
    WEIGHT_LOSS,
    MUSCLE_GAIN,
    GENERAL_FITNESS
}

// Class to represent a user profile
class UserProfile {
    private String name;
    private int age;
    private double weight;
    private double height;
    private FitnessGoal fitnessGoal;

    public UserProfile(String name, int age, double weight, double height, FitnessGoal fitnessGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.fitnessGoal = fitnessGoal;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public FitnessGoal getFitnessGoal() {
        return fitnessGoal;
    }
}

// Class to represent the Personalized Fitness Coach
public class PersonalizedFitnessCoach {
    private UserProfile userProfile;

    public PersonalizedFitnessCoach(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    // Method to provide personalized exercise recommendation based on fitness goal
    public String provideExerciseRecommendation() {
        // For demonstration purposes, let's assume simple exercise recommendations based on fitness goals
        switch (userProfile.getFitnessGoal()) {
            case WEIGHT_LOSS:
                return "Try high-intensity interval training (HIIT) exercises for effective weight loss.";
            case MUSCLE_GAIN:
                return "Focus on strength training exercises with heavy weights to build muscle mass.";
            case GENERAL_FITNESS:
                return "Incorporate a mix of cardio and strength training exercises to improve overall fitness.";
            default:
                return "No specific exercise recommendation available.";
        }
    }

    // Method to provide personalized nutrition recommendation based on fitness goal
    public String provideNutritionRecommendation() {
        // For demonstration purposes, let's assume simple nutrition recommendations based on fitness goals
        switch (userProfile.getFitnessGoal()) {
            case WEIGHT_LOSS:
                return "Focus on a balanced diet with a slight calorie deficit to support weight loss.";
            case MUSCLE_GAIN:
                return "Increase protein intake and consume enough calories to support muscle growth.";
            case GENERAL_FITNESS:
                return "Ensure a balanced diet with adequate protein, carbs, and fats for overall fitness.";
            default:
                return "No specific nutrition recommendation available.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter profile information
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your weight (in kilograms):");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height (in meters):");
        double height = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter your fitness goal (WEIGHT_LOSS, MUSCLE_GAIN, or GENERAL_FITNESS):");
        FitnessGoal fitnessGoal = FitnessGoal.valueOf(scanner.nextLine());

        // Create a user profile
        UserProfile userProfile = new UserProfile(name, age, weight, height, fitnessGoal);

        // Create a Personalized Fitness Coach instance
        PersonalizedFitnessCoach fitnessCoach = new PersonalizedFitnessCoach(userProfile);

        // Provide personalized recommendations
        System.out.println("Exercise Recommendation: " + fitnessCoach.provideExerciseRecommendation());
        System.out.println("Nutrition Recommendation: " + fitnessCoach.provideNutritionRecommendation());

        scanner.close();
    }
}
