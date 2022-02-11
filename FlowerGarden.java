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
        if(findFlower(userInput) == -1){
            flowers.add("01 " + userInput);
        } else{
            int flowerLocation = findFlower(userInput);

            int flowerCount = getCount(userInput);
            int newCount = flowerCount++;
            String newString = "";
            if(newCount<10){
                 newString = "0"+newCount + " " + userInput;

            }
            else{
                 newString = newCount + " " + userInput;
            }

            flowers.remove(flowerLocation);

            flowers.add(newString);
        }

    }
	//write get count

    public boolean inRange(int value){
        if(value >= 0 && value < flowers.size()){
            return true;
        }
        return false;
    }

    public int getCount(String input) {
        int flowerLocation = findFlower(input);
        if(inRange(flowerLocation)){
            return Integer.parseInt(flowers.get(flowerLocation).substring(0,2));
        }
        return 0;
    }

    //write get flower name
	public String getFlowerName(int num){
        if(inRange(num)){
            return flowers.get(num).substring(3);

        }else{
            return "out of range";
        }
    }
	//write in range

	
	//write find flower
    public int findFlower(String input){
        for(int i = 0; i < flowers.size(); i++) {
            if(getFlowerName(i).equals(input)){
                return i;
            }
        }
        return -1;
    }

	//write max flower
    public String maxFlower(){
        String maxFlower = getFlowerName(0);
        int maxCount = getCount(maxFlower);

        for(int i = 0; i < flowers.size(); i++){
            String currentFlower = getFlowerName(i);
            int currentVal = getCount(currentFlower);
            if (currentVal > maxCount){
                maxCount = currentVal;
                maxFlower = currentFlower;
            }

        }
        return maxFlower;
    }


	//write a toString
    public String toString(){
        return Arrays.toString(flowers.toArray());
    }
}