import java.util.Arrays;
import java.util.ArrayList;

public class  FlowerGarden
{
	//create an arraylist instance variable
    private ArrayList<String> flowers;
	
	//write a constructor
    public FlowerGarden(){
        flowers = new ArrayList<String>();

    }
	
	//write add flower
	public void addFlower(String userInput){
        int counter=00;
       for (int i = 0; i<flowers.size();i++){
           if(flowers.get(i).equals(userInput)){

               flowers.add(counter+userInput) ;
           }
       }


        flowers.add(userInput);

    }
	//write get count
		public String getCount(String input) {
            int counter = 0;
            String result = "";
            for (int i = 0; i < flowers.size(); i++) {
                if (input.equals(flowers.get(i))) {
                    result = flowers.get(i);
                    counter++;
                } else {
                    counter = 1;
                    return counter + result;
                }
                if (counter >= 1) {
                    return "There are " + counter + " " + input + "s in the flower garden";
                }

            }
            return "There are no " + input + "s in the flower garden";

        }

    //write get flower name
	public String getFlower(int num){
        return flowers.get(num);
    }
	//write in range

	
	//write find flower
    public int findFlower(String input){
        input = input.substring(3);
        System.out.println(input);
        for (int i =0; i<flowers.size();i++){
            if(input.equals(flowers.get(i))){
                i++;

            }


        }

        return flowers.lastIndexOf(input);


    }

	//write max flower	


	//write a toString
    public String toString(){
        return Arrays.toString(flowers.toArray());
    }
}