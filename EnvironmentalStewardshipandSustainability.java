import java.util.Scanner;
public class EnvironmentalStewardshipandSustainability {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// This Program helps the user to learn more about Environmental Stewardship and Sustainability
		
		// Welcome message
		System.out.println("Hello!! Welcome to your learning session about Environmental Stewardship and Sustainability");
		System.out.println("Please enter your name: ");
		//User input name
		String userInputName= input.next();
		System.out.println("Ok "+ userInputName + " let's begin!" );
		System.out.println();
		
		// Learning about negative effects of computer use on the environment and human health and how to reduce the impact
		System.out.println("Would you believe that computer have negative effects on the environment and human health?");
		System.out.println("Please type Yes or No...case does not matter: ");
		// user input yes on no
		String userInputNegativeEffects= input.next();
		//change to lowercase
		userInputNegativeEffects = userInputNegativeEffects.toLowerCase();
		// if user knows about negative effects on the environment and human health output appropriate info
		if (userInputNegativeEffects.equals("yes")) {
			System.out.println();
			System.out.println("You're correct!");
			System.out.println("Here are some negative effects of computer use on the environment");
			System.out.println(" and human health as well as some measures to help reduce the impact.");
			System.out.println();
			System.out.println();
			
			System.out.println("Electrical Strain: The average PC consumes 746 kilowatts of power each year ");
			System.out.println("(which is more powerful than a refrigerator that uses 500 kilowatts).");
			System.out.println("Computers cause power plants to strain because a lot of energy is needed to power the");
			System.out.println("computers of the world. The production of energy creates pollution and emissions. And to");
			System.out.println("give you an idea, in 2019 there were over 2 billion computers in the world. The"); 
			System.out.println("amount of electricity needed to power computers contributes to the millions of tons");
			System.out.println("of greenhouse gases that are emitted into the atmosphere each year"); 
			System.out.println();
			System.out.println("How to reduce the impact:");
			System.out.println("Use a laptop instead of a desktop, laptops often burn between 15 and 60 watts. Buy a");
			System.out.println("voltmeter. This helps you know how much electricity you are using and what you could");
			System.out.println("do to ease the use of electricity.");
			System.out.println();
			System.out.println();
			
			System.out.println("Energy Waste: Energy waste is created by computers. This causes needless pollution every year. U.S. businesses");
			System.out.println("waste approximately 1 billion dollars each year in electricity used to power computers and monitors left on after hours.");
			System.out.println("Putting your computer on stand-by or letting your monitor go into sleep mode also creates energy waste, as these ");
			System.out.println("modes still require power. Even leaving your computer plugged in while it is shut down will draw a small amount of power"); 
			System.out.println("from your electrical outlet. This energy waste translates into greenhouse excess gases that contribute to pollution and ");
			System.out.println("global climate change");
			System.out.println();
			System.out.println("How to reduce the impact:");
			System.out.println("E-waste could be reduced each year if businesses and households ");
			System.out.println("would shut down their computers and power off their monitors when they are not using them" );
			System.out.println();
			System.out.println();
			
			System.out.println("Landfill waste: 50 million tons of electronic waste are discarded each year. Most of these discarded computers are sent to");
			System.out.println("landfills overseas in Africa, China, India, Vietnam and the Philippines. There are entire regions in these countries that are");
			System.out.println("polluted due to computer waste. Computers contain heavy metals like lead and toxic chemicals that pollute the soil");
			System.out.println(" and contaminate groundwater when they are dumped into landfills. Runoff from these landfills can contaminate water used ");
			System.out.println("for drinking and bathing, exposing people to dangerous chemicals." );
			System.out.println();
			System.out.println("How to reduce the impact:");
			System.out.println("One possible alternative is to require producers of electronics to offer buy-back ");
			System.out.println("or return systems for old equipment. Export limits could be placed on manufacturers,");
			System.out.println("too, where the number of goods that can be exported should be directly proportional to");
			System.out.println("the amount of e-waste the company has recycled or re-used. Then there needs to be an");
			System.out.println("effective way to ensure that these returned devices get repurposed. Governments could");
			System.out.println("give some form of tax break or rebate for companies that effectively process old");
			System.out.println("equipment. And companies could reuse recovered parts from discarded goods in newer");
			System.out.println("systems. Partially recycled devices could be sold in markets where buying capacity is");
			System.out.println("limited. Or, they could be marketed as “reclaimed,” offering a social benefit even in");
			System.out.println("wealthy markets. Another option is recommitting to repairing smartphones and");
			System.out.println("computers. Done properly, electronics repair might help reduce unemployment.");
			System.out.println("Government involvement in such programs would be extremely important, as the creation");
			System.out.println("of such centers would need to contribute to broader socio-economic goals.");
			System.out.println();
			System.out.println();
			
			System.out.println("Emotional Instability: Sleep deprivation: Teens need about 9 hours sleep each day," );
			System.out.println("but often are on their computers late at night, says Sherry Turkle, director of the Initiative"); 
			System.out.println("on Technology and Self at the Massachusetts Institute of Technology (MIT) and professor of the");
			System.out.println("school’s Social Studies of Science and Technology department. That means they can’t focus at school"); 
			System.out.println("and cope well with social pressures. This could easily lead to not only teens but adults as well, ");
			System.out.println("to become emotionally unstable");
			System.out.println();
			System.out.println("How to reduce the impact:");
			System.out.println("Parents should insist that family members turn off their phones at");
			System.out.println("dinner and spend time together, minus the media distractions, experts advise.");
			System.out.println();
			System.out.println();
			
			System.out.println("Strained vision: About 40% of optometrists’ patients experienced eye strain due to");
			System.out.println("computer vision syndrome (conditions related to “near work”), while 45% complained of ");
			System.out.println("neck and back pain associated with computer or handheld device use, according to a");
			System.out.println(" 2008 survey by the American Optometric Association (AOA). Many computer users");
			System.out.println("assume awkward postures to position their eyes for better performance, according to the"); 
			System.out.println(	" association. Close computer work can cause light sensitivity, dry eye, blurred vision");
			System.out.println(", double vision, fatigue and headache");
			System.out.println();
			System.out.println("How to reduce the impact:");
			System.out.println("Limit time spent continuously in front of a computer. Look away from the");
			System.out.println("screen every 20 minutes for 20 seconds, the AOA recommends. For the ideal viewing");
			System.out.println("distance, set your monitor about 20-28 inches away from your body. Adjust the top of");
			System.out.println("your monitor at eye level, so you’re looking down at the screen by 10°-20° (4-5 inches).");
			System.out.println("That way you’ll avoid nodding your head up and down, causing neck and back strain,");
			System.out.println("Sheedy says. Laptops, especially, need to be raised to “that sweet spot” where your");
			System.out.println("eyes are looking down slightly. Lighting above your head should be dim. The areas");
			System.out.println("within your line of view – the wall in front of you, for example – should be as bright as");
			System.out.println("your computer screen. Avoid sitting in front of an un-shaded window or with one behind you.");
			System.out.println();
			System.out.println();
		}
		// if user does not know about negative effects on the environment and human health output appropriate info
		else {
			System.out.println();
			System.out.println("I wish you were right! Unfortunately there are negative effects");
			System.out.println("Here are some negative effects of computer use on the environment");
			System.out.println(" and human health as well as some measures to help reduce the impact.");
			System.out.println();
			System.out.println();
			
			System.out.println("Electrical Strain: The average PC consumes 746 kilowatts of power each year ");
			System.out.println("(which is more powerful than a refrigerator that uses 500 kilowatts).");
			System.out.println("Computers cause power plants to strain because a lot of energy is needed to power the");
			System.out.println("computers of the world. The production of energy creates pollution and emissions. And to");
			System.out.println("give you an idea, in 2019 there were over 2 billion computers in the world. The"); 
			System.out.println("amount of electricity needed to power computers contributes to the millions of tons");
			System.out.println("of greenhouse gases that are emitted into the atmosphere each year"); 
			System.out.println();
			System.out.println("How to reduce the impact:");
			System.out.println("Use a laptop instead of a desktop, laptops often burn between 15 and 60 watts. Buy a");
			System.out.println("voltmeter. This helps you know how much electricity you are using and what you could");
			System.out.println("do to ease the use of electricity.");
			System.out.println();
			System.out.println();
			
			System.out.println("Energy Waste: Energy waste is created by computers. This causes needless pollution every year. U.S. businesses");
			System.out.println("waste approximately 1 billion dollars each year in electricity used to power computers and monitors left on after hours.");
			System.out.println("Putting your computer on stand-by or letting your monitor go into sleep mode also creates energy waste, as these ");
			System.out.println("modes still require power. Even leaving your computer plugged in while it is shut down will draw a small amount of power"); 
			System.out.println("from your electrical outlet. This energy waste translates into greenhouse excess gases that contribute to pollution and ");
			System.out.println("global climate change");
			System.out.println();
			System.out.println("How to reduce the impact:");
			System.out.println("E-waste could be reduced each year if businesses and households ");
			System.out.println("would shut down their computers and power off their monitors when they are not using them" );
			System.out.println();
			System.out.println();
			
			System.out.println("Landfill waste: 50 million tons of electronic waste are discarded each year. Most of these discarded computers are sent to");
			System.out.println("landfills overseas in Africa, China, India, Vietnam and the Philippines. There are entire regions in these countries that are");
			System.out.println("polluted due to computer waste. Computers contain heavy metals like lead and toxic chemicals that pollute the soil");
			System.out.println(" and contaminate groundwater when they are dumped into landfills. Runoff from these landfills can contaminate water used ");
			System.out.println("for drinking and bathing, exposing people to dangerous chemicals." );
			System.out.println();
			System.out.println("How to reduce the impact:");
			System.out.println("One possible alternative is to require producers of electronics to offer buy-back ");
			System.out.println("or return systems for old equipment. Export limits could be placed on manufacturers,");
			System.out.println("too, where the number of goods that can be exported should be directly proportional to");
			System.out.println("the amount of e-waste the company has recycled or re-used. Then there needs to be an");
			System.out.println("effective way to ensure that these returned devices get repurposed. Governments could");
			System.out.println("give some form of tax break or rebate for companies that effectively process old");
			System.out.println("equipment. And companies could reuse recovered parts from discarded goods in newer");
			System.out.println("systems. Partially recycled devices could be sold in markets where buying capacity is");
			System.out.println("limited. Or, they could be marketed as “reclaimed,” offering a social benefit even in");
			System.out.println("wealthy markets. Another option is recommitting to repairing smartphones and");
			System.out.println("computers. Done properly, electronics repair might help reduce unemployment.");
			System.out.println("Government involvement in such programs would be extremely important, as the creation");
			System.out.println("of such centers would need to contribute to broader socio-economic goals.");
			System.out.println();
			System.out.println();
			
			System.out.println("Emotional Instability: Sleep deprivation: Teens need about 9 hours sleep each day," );
			System.out.println("but often are on their computers late at night, says Sherry Turkle, director of the Initiative"); 
			System.out.println("on Technology and Self at the Massachusetts Institute of Technology (MIT) and professor of the");
			System.out.println("school’s Social Studies of Science and Technology department. That means they can’t focus at school"); 
			System.out.println("and cope well with social pressures. This could easily lead to not only teens but adults as well, ");
			System.out.println("to become emotionally unstable");
			System.out.println();
			System.out.println("How to reduce the impact:");
			System.out.println("Parents should insist that family members turn off their phones at");
			System.out.println("dinner and spend time together, minus the media distractions, experts advise.");
			System.out.println();
			System.out.println();
			
			System.out.println("Strained vision: About 40% of optometrists’ patients experienced eye strain due to");
			System.out.println("computer vision syndrome (conditions related to “near work”), while 45% complained of ");
			System.out.println("neck and back pain associated with computer or handheld device use, according to a");
			System.out.println(" 2008 survey by the American Optometric Association (AOA). Many computer users");
			System.out.println("assume awkward postures to position their eyes for better performance, according to the"); 
			System.out.println(	" association. Close computer work can cause light sensitivity, dry eye, blurred vision");
			System.out.println(", double vision, fatigue and headache");
			System.out.println();
			System.out.println("How to reduce the impact:");
			System.out.println("Limit time spent continuously in front of a computer. Look away from the");
			System.out.println("screen every 20 minutes for 20 seconds, the AOA recommends. For the ideal viewing");
			System.out.println("distance, set your monitor about 20-28 inches away from your body. Adjust the top of");
			System.out.println("your monitor at eye level, so you’re looking down at the screen by 10°-20° (4-5 inches).");
			System.out.println("That way you’ll avoid nodding your head up and down, causing neck and back strain,");
			System.out.println("Sheedy says. Laptops, especially, need to be raised to “that sweet spot” where your");
			System.out.println("eyes are looking down slightly. Lighting above your head should be dim. The areas");
			System.out.println("within your line of view – the wall in front of you, for example – should be as bright as");
			System.out.println("your computer screen. Avoid sitting in front of an un-shaded window or with one behind you.");
			System.out.println();
			System.out.println();
			
			
		}
		// Learning about ways in which computers are or could be used to reduce resource use and to support environmental protection measures
		System.out.println(userInputName+ ", have you ever used a computer software to work from home?");
		System.out.println("Please type Yes or No...case does not matter: ");
		// user input yes on no
		String userInputTelecommute= input.next();
		//change to lowercase
		userInputTelecommute = userInputTelecommute.toLowerCase();
		// if user knows about ways in which computers are or could be used to reduce resource use and to support environmental protection measures output appropriate info
		if (userInputTelecommute.equals("yes")) {
			System.out.println("Great! You are contributing to help reduce the use of fossil fuels.");
			System.out.println("This is known as telecommuting. Here is some more info: ");
			System.out.println("Telecommuting eliminates the need to travel altogether, avoiding the use of fossil");
			System.out.println("fuels and the costs of fuel and travel. All you need is a computer, Internet connection, and a");
			System.out.println("smartphone");
			System.out.println();
			System.out.println("On a similar topic, computers could also be used to support environmental protection measures");
			System.out.println("For example, Carla Gomes, a computer science professor at Cornell University,");
			System.out.println("led her to embark on an effort ");
			System.out.println("to develop computational methods that can help cultivate a more sustainable world. Computer");
			System.out.println("scientists work directly with researchers to make a more sustainable world. This team went on");
			System.out.println("to create conservation corridors -- continuous areas of protected land that link zones of");
			System.out.println("biological significance. This has helped many extinct species get off of the extinct list. They also");
			System.out.println("created an app for Africans to report the state of their grass (no grass, some grass, a lot of");
			System.out.println("grass). This helped to create land for Africans to grow vegetation.");
			System.out.println();
			System.out.println();
		}
		// if user does not know about ways in which computers are or could be used to reduce resource use and to support environmental protection measures output appropriate info
		else {
			System.out.println("You should try it! It helps to reduce fossil fuels.");
			System.out.println("This is known as telecommuting. Here is some more info: ");
			System.out.println("Telecommuting eliminates the need to travel altogether, avoiding the use of fossil");
			System.out.println("fuels and the costs of fuel and travel. All you need is a computer, Internet connection, and a");
			System.out.println("smartphone");
			System.out.println();
			System.out.println("On a similar topic, computers could also be used to support environmental protection measures");
			System.out.println("For example, Carla Gomes, a computer science professor at Cornell University,");
			System.out.println("led her to embark on an effort ");
			System.out.println("to develop computational methods that can help cultivate a more sustainable world. Computer");
			System.out.println("scientists work directly with researchers to make a more sustainable world. This team went on");
			System.out.println("to create conservation corridors -- continuous areas of protected land that link zones of");
			System.out.println("biological significance. This has helped many extinct species get off of the extinct list. They also");
			System.out.println("created an app for Africans to report the state of their grass (no grass, some grass, a lot of");
			System.out.println("grass). This helped to create land for Africans to grow vegetation.");
			System.out.println();
			System.out.println();
		}
		
		// Learning about how government agencies and community partners that provide resources and guidance for environmental stewardship 
		System.out.println(userInputName+", are you aware of the CSR in Canada?");
		System.out.println("Please type Yes or No...case does not matter: ");
		// user input yes on no
		String userInputCSR= input.next();
		//change to lowercase
		userInputCSR = userInputCSR.toLowerCase();
		// if user is aware of CSR output appropriate info
		if (userInputCSR.equals("yes")) {
			System.out.println("That's good to hear! Just to refresh your memory,");
			System.out.println("it is a government initiative to gather companies that can limit the negative");
			System.out.println("environmental impacts of their operations and, in some cases, can even create positive ones.");
			System.out.println("Here are some companies in B.C. that do so:");
			System.out.println("	- Batteries and cell phones: Call2Recycle (RBRCC), Recycle My Cell (CWTA)");
			System.out.println("	- Electronics (e-waste): Computers, televisions, audio-visual, medical equipment, office equipment: ");
			System.out.println("	  Electronic Products Stewardship Association (EPRA)");
			System.out.println("	- Information, Technology and Telecommunications (ITT): Bell Canada, Shaw Communications Inc, TELUS Communications");
			System.out.println("	  company");
			System.out.println("	- Lamp and Lighting Equipment: LightRecycle - Product Care Association");
			System.out.println("	- Lead-Acid Batteries: Canadian Battery Association, Interstate Battery System of Canada Inc");
			System.out.println();
			System.out.println();
		}
		// if user is not aware of CSR output appropriate info
		else {
			System.out.println("Hopefully, you will learn more about the program!");
			System.out.println("It is a government initiative to gather companies that can limit the negative");
			System.out.println("environmental impacts of their operations and, in some cases, can even create positive ones.");
			System.out.println("Here are some companies in B.C. that do so:");
			System.out.println("	- Batteries and cell phones: Call2Recycle (RBRCC), Recycle My Cell (CWTA)");
			System.out.println("	- Electronics (e-waste): Computers, televisions, audio-visual, medical equipment, office equipment: ");
			System.out.println("	  Electronic Products Stewardship Association (EPRA)");
			System.out.println("	- Information, Technology and Telecommunications (ITT): Bell Canada, Shaw Communications Inc, TELUS Communications");
			System.out.println("	  company");
			System.out.println("	- Lamp and Lighting Equipment: LightRecycle - Product Care Association");
			System.out.println("	- Lead-Acid Batteries: Canadian Battery Association, Interstate Battery System of Canada Inc");
			System.out.println();
			System.out.println();
			
		}
		// Goodbye message
		System.out.println("Well "+userInputName+ " , I hope this course has helped you konw more about copmuters" );
		System.out.println("and their negative and positive impacts on the environment.");
		System.out.println("Be sure to use this information to educate others about Environmental Stewardship and Sustainability!");
		System.out.println("Enjot the rest of your day!");

	}

}
