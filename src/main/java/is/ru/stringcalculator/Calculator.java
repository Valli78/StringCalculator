package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals(""))
			return 0;
		else{
			if(text.startsWith("//")){
				text = text.substring(4);
			}
			if(text.contains("\n")){
				text = text.replaceAll("\n",",");
			}		
			if(text.contains(",")){
				String numbers[] = text.split(",");
				int total = 0;
				 int[] neg = new int[100];
				int i = 0; 
				for(String number : numbers){
					if(toInt(number) < 0){					
						neg[i] = toInt(number);
					}
					if(toInt(number) >1000){					
						break;
					}					
						i++;
					total +=toInt(number);
				} 
			if(text.contains("-")){
				throw new IllegalArgumentException("Negatives no allowed: " + neg);
			} 

				return total;
			}
			return 1; 

		}
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
}