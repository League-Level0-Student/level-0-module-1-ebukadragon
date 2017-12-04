import javax.swing.JOptionPane;

public class fdgfhg {
public static void main(String[] args) {
String recipe=JOptionPane.showInputDialog("chicken soup,chicken cordon Bleu,chicken cassarole");
if(recipe.equals("chicken soup")){
   JOptionPane.showMessageDialog(null, "1. got to google for recipe of chicken casserole");
}
else if(recipe.equals("chicken cassarole")){
	JOptionPane.showMessageDialog(null, "1. Heat oven to 350°F."
			+ "Place chicken in bottom of ungreased 13 x 9-inch baking dish. Spoon soup evenly over chicken and top with shredded cheese."
			+ "In medium bowl stir together melted butter and breadcrumbs. Sprinkle over baking dish. Bake 35 to 40 minutes or until bubbly.FROM google");
}
else if(recipe.equals("chicken cordon Bleu")){
	JOptionPane.showMessageDialog(null, "1. Preheat oven to 350 degrees F (175 degrees C). Coat a 7x11 inch baking dish with nonstick cooking spray."
			+ "Pound chicken breasts to 1/4 inch thickness."
			+ "Sprinkle each piece of chicken on both sides with salt and pepper. ..."
			+ "Bake for 30 to 35 minutes, or until chicken is no longer pink. FROM google");
}
else {
	JOptionPane.showMessageDialog(null,"recipe is not on the list good bye and stop joking");
}
}
}
