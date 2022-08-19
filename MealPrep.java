package Practice;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MealPrep extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(getPane(),1450,900);
		primaryStage.setTitle("Meals");
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}
	public BorderPane getPane() {
		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(20));
		VBox vbox = new VBox(20);
		
		CheckBox breakfast = new CheckBox("breakfast");
		CheckBox snack1 = new CheckBox("snack1");
		CheckBox lunch = new CheckBox("lunch");
		CheckBox snack2 = new CheckBox("snack2");
		CheckBox dinner = new CheckBox("dinner");
		CheckBox snack3 = new CheckBox("snack3");
		vbox.getChildren().addAll(breakfast,snack1,lunch,snack2,dinner,snack3);
		pane.setLeft(vbox);
		
		VBox stack = new VBox(20);
		VBox stack2 = new VBox(20);
		stack.setPadding(new Insets(50));
		Text text = new Text("Select what you want for your meal");
		pane.setCenter(stack);
		
		HBox hori = new HBox(450);
		hori.setPadding(new Insets(0,0,50,0));
		Text time = new Text("Time of Day");
		Text meal = new Text("Meal");
		Text recipe = new Text("Recipe");
		hori.getChildren().addAll(time,meal,recipe);
		pane.setTop(hori);
		
		
		Button breakfastButton1 = new Button("Eggs and Cheese");
		Text bfr1 = new Text("Cheese, Eggs, Salt and Pepper, Pam or Olive Oil");
		Button breakfastButton2 = new Button("Cold Oats ");
		Text bfr2 = new Text("Milk and cereal, add fruit if available");
		Button breakfastButton3 = new Button("Hot Oats");
		Text bfr3 = new Text("Oatmeal with Milk in a cup");
		
		Button snackButton1 = new Button("Dried Snacks");
		Text sr1 = new Text("seaweed, or dried peas");
		Button snackButton2 = new Button("Salted Crackers");
		Text sr2 = new Text("Crackers of any sort");
		Button snackButton3 = new Button("Protein Bar or trail mix");
		Text sr3 = new Text("any protein snacks");
		
		Button lunchButton1 = new Button("Turkey Sandwich");
		Text lr1 = new Text("Turkey slices, cheese, lettuce, tomatoe, onion, mustard, mayo");
		Button lunchButton2 = new Button("Caeser Salad");
		Text lr2 = new Text("Salad Bag Costco");
		Button lunchButton3 = new Button("Ham and cheese sandwich melt");
		Text lr3 = new Text("Ham, cheese, bread, mustard, mayo, lettuce toasted");
		
		Button snack2Button1 = new Button("Mixed Nuts");
		Text s2r1 = new Text("Trail mix");
		Button snack2Button2 = new Button("Yogurt");
		Text s2r2 = new Text("yoplait or greek yogurts");
		Button snack2Button3 = new Button("Green dried snacks");
		Text s2r3 = new Text("sea weed");
		
		Button dinnerButton1 = new Button("(Chicken/Steak/Sausage, rice and veggies");
		Text dr1 = new Text("any meat with rice and veggies");
		Button dinnerButton2 = new Button("Salmon with white rice and veggies");
		Text dr2 = new Text("salmon, rice, brocoli, asaparagus");
		Button dinnerButton3 = new Button("Spaghetti with Tomato Sauce");
		Text dr3 = new Text("Pasta, tomato sauce, garlic, bread");
		
		Button snack3Button1 = new Button("Cereal");
		Text s3r1 = new Text("1% Fat Milk");
		Button snack3Button2 = new Button("Mixed Nuts");
		Text s3r2 = new Text("From Costco");
		Button snack3Button3 = new Button("Oatmeal");
		Text s3r3 = new Text("From Costco");
		
		// RIGHT PADDING IS SECOND PARAMETER
		pane.setPadding(new Insets(10,290,0,50));
		
		breakfast.setOnAction(e ->{
			if (breakfast.isSelected()) {
				stack.getChildren().addAll(breakfastButton1,breakfastButton2,breakfastButton3);
				// Padding for meal buttons last paramater
				stack.setPadding(new Insets(0,0,0,400));
			}
			else {
				stack.getChildren().removeAll(breakfastButton1,breakfastButton2,breakfastButton3);
				pane.setRight(new Text(""));
			}
		});
		breakfastButton1.setOnAction(e ->{
			if (breakfast.isSelected()) {
				pane.setRight(bfr1);
			}
			
		});
		breakfastButton2.setOnAction(e ->{
			if (breakfast.isSelected()) {
				pane.setRight(bfr2);
			}
			
		});
		breakfastButton3.setOnAction(e ->{
			if (breakfast.isSelected()) {
				pane.setRight(bfr3);
			}
			
		});
		snack1.setOnAction(e ->{
			if (snack1.isSelected()) {
				stack.getChildren().addAll(snackButton1,snackButton2,snackButton3);
			}
			else {
				stack.getChildren().removeAll(snackButton1,snackButton2,snackButton3);
				pane.setRight(new Text(""));
			}
		});
		snackButton1.setOnAction(e ->{
			if (snack1.isSelected()) {
				pane.setRight(sr1);
			}
			
		});
		snackButton2.setOnAction(e ->{
			if (snack1.isSelected()) {
				pane.setRight(sr2);
			}
			
		});
		snackButton3.setOnAction(e ->{
			if (snack1.isSelected()) {
				pane.setRight(sr3);
			}
			
		});
		lunch.setOnAction(e ->{
			if (lunch.isSelected()) {
				stack.getChildren().addAll(lunchButton1,lunchButton2,lunchButton3);
			}
			else {
				stack.getChildren().removeAll(lunchButton1,lunchButton2,lunchButton3);
				pane.setRight(new Text(""));
			}
		});
		lunchButton1.setOnAction(e ->{
			if (lunch.isSelected()) {
				pane.setRight(lr1);
			}
			
		});
		lunchButton2.setOnAction(e ->{
			if (lunch.isSelected()) {
				pane.setRight(lr2);
			}
			
		});
		lunchButton3.setOnAction(e ->{
			if (lunch.isSelected()) {
				pane.setRight(lr3);
			}
			
		});
		snack2.setOnAction(e ->{
			if (snack2.isSelected()) {
				stack.getChildren().addAll(snack2Button1,snack2Button2,snack2Button3);
			}
			else {
				stack.getChildren().removeAll(snack2Button1,snack2Button2,snack2Button3);
				pane.setRight(new Text(""));
			}
		});
		snack2Button1.setOnAction(e ->{
			if (snack2.isSelected()) {
				pane.setRight(s2r1);
			}
			
		});
		snack2Button2.setOnAction(e ->{
			if (snack2.isSelected()) {
				pane.setRight(s2r2);
			}
			
		});
		snack2Button3.setOnAction(e ->{
			if (snack2.isSelected()) {
				pane.setRight(s2r3);
			}
			
		});
		dinner.setOnAction(e ->{
			if (dinner.isSelected()) {
				stack.getChildren().addAll(dinnerButton1,dinnerButton2,dinnerButton3);
			}
			else {
				stack.getChildren().removeAll(dinnerButton1,dinnerButton2,dinnerButton3);
				pane.setRight(new Text(""));
			}
		});
		dinnerButton1.setOnAction(e ->{
			if (dinner.isSelected()) {
				pane.setRight(dr1);
			}
			
		});
		dinnerButton2.setOnAction(e ->{
			if (dinner.isSelected()) {
				pane.setRight(dr2);
			}
			
		});
		dinnerButton3.setOnAction(e ->{
			if (dinner.isSelected()) {
				pane.setRight(dr3);
			}
			
		});
		snack3.setOnAction(e ->{
			if (snack3.isSelected()) {
				stack.getChildren().addAll(snack3Button1,snack3Button2,snack3Button3);
			}
			else {
				stack.getChildren().removeAll(snack3Button1,snack3Button2,snack3Button3);
				pane.setRight(new Text(""));
			}
		});
		snack3Button1.setOnAction(e ->{
			if (snack3.isSelected()) {
				pane.setRight(s3r1);
			}
			
		});
		snack3Button2.setOnAction(e ->{
			if (snack3.isSelected()) {
				pane.setRight(s3r2);
			}
			
		});
		snack3Button3.setOnAction(e ->{
			if (snack3.isSelected()) {
				pane.setRight(s3r3);
			}
			
		});
		
		
		return pane ;
	}
}
