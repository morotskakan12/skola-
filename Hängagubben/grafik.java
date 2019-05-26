import java.util.ArrayList;

public class grafik{
	metoder metod = new metoder();
	/**
	 * för att få till mellan rum i kontrolpanelen och holla det rent 
	 */
	public static void emty() {
			for (int i =0; i<30;i++) {
				System.out.print("\n");
			}	
		}
	/**
	 * gubben istälet för att vara en gubbe.
	 * 
	 * @param hp hur många fel som anvendaren har 
	 */
	public static void guben18 (int hp){
		if(hp ==9) {
			System.out.println(",--------------------------------------------------------------------------.");
			System.out.println("|:::::::::::::::::::::::.:.:.:.:.:.:.:.: : :.: : : : : : : : .. .. :. ..   |");	
			System.out.println("|:::::::dHHHbo._ ::::::::.:.:.:.:.:.: : :.: : :.: : :.: : : :..:..: .. :.  |");
			}
		if(hp ==8) {
			System.out.println(",--------------------------------------------------------------------------.");
			System.out.println("|:::::::::::::::::::::::.:.:.:.:.:.:.:.: : :.: : : : : : : : .. .. :. ..   |");	
			System.out.println("|:::::::dHHHbo._ ::::::::.:.:.:.:.:.: : :.: : :.: : :.: : : :..:..: .. :.  |");
			System.out.println("|::::::dHF\"\"HHHHb.::::::.:.:.:.:.:.:.:.:.:.:.: : :.: : : : : . :. .. . ..|");
			System.out.println("|:::::dHH  _ \"HHHHb.:::::.:.:.:.:.:.: :.:.: :.:.: : : : : : :.::.: ..: .. |");	
			System.out.println("|:::::HHH_'o  \"HHHHHb.::.:.:.:.:.:.:.:.: :.:.:.: : :.: : :.: .... .... .: |");

		}
		if(hp ==7) {
			System.out.println(",--------------------------------------------------------------------------.");
			System.out.println("|:::::::::::::::::::::::.:.:.:.:.:.:.:.: : :.: : : : : : : : .. .. :. ..   |");	
			System.out.println("|:::::::dHHHbo._ ::::::::.:.:.:.:.:.: : :.: : :.: : :.: : : :..:..: .. :.  |");
			System.out.println("|::::::dHF\"\"HHHHb.::::::.:.:.:.:.:.:.:.:.:.:.: : :.: : : : : . :. .. . ..|");
			System.out.println("|:::::dHH  _ \"HHHHb.:::::.:.:.:.:.:.: :.:.: :.:.: : : : : : :.::.: ..: .. |");	
			System.out.println("|:::::HHH_'o  \"HHHHHb.::.:.:.:.:.:.:.:.: :.:.:.: : :.: : :.: .... .... .: |");
			System.out.println("|:::::HHFo     \"HHHHHHbo..:.:.:.:.:.:.: :.: : :.: : : : :.: :. :.::.: ..  |");
			System.out.println("|:::::HHH\\`,   HHHHHHHHHHho..:.:.:.:.:.: :.:.:.: : :.:.: : : :: ..  ..  ..|");	
			System.out.println("|:::::HFHH`._,'HHH'   `HHHHHHb_ :.:.:.: : ____:.: : : : : : :. .::.. : ..  |");
		}
		if(hp ==6) {
		System.out.println(",-------------------------------------------------------------------------------.");
		System.out.println("|:::::::::::::::::::::::.:.:.:.:.:.:.:.: : :.: : : : : : : : .. .. :. ..        |");	
		System.out.println("|:::::::dHHHbo._ ::::::::.:.:.:.:.:.: : :.: : :.: : :.: : : :..:..: .. :.       |");
		System.out.println("|::::::dHF\"\"HHHHb.::::::.:.:.:.:.:.:.:.:.:.:.: : :.: : : : : . :. .. . ..     |");
		System.out.println("|:::::dHH  _ \"HHHHb.:::::.:.:.:.:.:.: :.:.: :.:.: : : : : : :.::.: ..: ..      |");	
		System.out.println("|:::::HHH_'o  \"HHHHHb.::.:.:.:.:.:.:.:.: :.:.:.: : :.: : :.: .... .... .:      |");
		System.out.println("|:::::HHFo     \"HHHHHHbo..:.:.:.:.:.:.: :.: : :.: : : : :.: :. :.::.: ..       |");
		System.out.println("|:::::HHH\\`,   HHHHHHHHHHho..:.:.:.:.:.: :.:.:.: : :.:.: : : :: ..  ..  ..     |");	
		System.out.println("|:::::HFHH`._,'HHH'   `HHHHHHb_ :.:.:.: : ____:.: : : : : : :. .::.. : ..       |");
		System.out.println("|:::::P:\"HHHHH\\HP       \"HHF:. `._ :.,-'\"\"    \"-.  :.: : : : .:  .. ..: ..|");
		System.out.println("|::::::::\"HHFHHF         F\"  :::..\"\"\"     \"-.    `. : : : : :..:.: .. ..  |");
		System.out.println("|::::::::::F::PF                ,            \\     \\__ : : : _,-----._..--'   |"); 
		}
		if(hp ==5) {
			System.out.println(",-------------------------------------------------------------------------------.");
			System.out.println("|:::::::::::::::::::::::.:.:.:.:.:.:.:.: : :.: : : : : : : : .. .. :. ..        |");	
			System.out.println("|:::::::dHHHbo._ ::::::::.:.:.:.:.:.: : :.: : :.: : :.: : : :..:..: .. :.       |");
			System.out.println("|::::::dHF\"\"HHHHb.::::::.:.:.:.:.:.:.:.:.:.:.: : :.: : : : : . :. .. . ..     |");
			System.out.println("|:::::dHH  _ \"HHHHb.:::::.:.:.:.:.:.: :.:.: :.:.: : : : : : :.::.: ..: ..      |");	
			System.out.println("|:::::HHH_'o  \"HHHHHb.::.:.:.:.:.:.:.:.: :.:.:.: : :.: : :.: .... .... .:      |");
			System.out.println("|:::::HHFo     \"HHHHHHbo..:.:.:.:.:.:.: :.: : :.: : : : :.: :. :.::.: ..       |");
			System.out.println("|:::::HHH\\`,   HHHHHHHHHHho..:.:.:.:.:.: :.:.:.: : :.:.: : : :: ..  ..  ..     |");	
			System.out.println("|:::::HFHH`._,'HHH'   `HHHHHHb_ :.:.:.: : ____:.: : : : : : :. .::.. : ..       |");
			System.out.println("|:::::P:\"HHHHH\\HP       \"HHF:. `._ :.,-'\"\"    \"-.  :.: : : : .:  .. ..: ..|");
			System.out.println("|::::::::\"HHFHHF         F\"  :::..\"\"\"     \"-.    `. : : : : :..:.: .. ..  |");
			System.out.println("|::::::::::F::PF                ,            \\     \\__ : : : _,-----._..--'   |"); 
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");

		}
		if(hp ==4) {
			System.out.println(",-------------------------------------------------------------------------------.");
			System.out.println("|:::::::::::::::::::::::.:.:.:.:.:.:.:.: : :.: : : : : : : : .. .. :. ..        |");	
			System.out.println("|:::::::dHHHbo._ ::::::::.:.:.:.:.:.: : :.: : :.: : :.: : : :..:..: .. :.       |");
			System.out.println("|::::::dHF\"\"HHHHb.::::::.:.:.:.:.:.:.:.:.:.:.: : :.: : : : : . :. .. . ..     |");
			System.out.println("|:::::dHH  _ \"HHHHb.:::::.:.:.:.:.:.: :.:.: :.:.: : : : : : :.::.: ..: ..      |");	
			System.out.println("|:::::HHH_'o  \"HHHHHb.::.:.:.:.:.:.:.:.: :.:.:.: : :.: : :.: .... .... .:      |");
			System.out.println("|:::::HHFo     \"HHHHHHbo..:.:.:.:.:.:.: :.: : :.: : : : :.: :. :.::.: ..       |");
			System.out.println("|:::::HHH\\`,   HHHHHHHHHHho..:.:.:.:.:.: :.:.:.: : :.:.: : : :: ..  ..  ..     |");	
			System.out.println("|:::::HFHH`._,'HHH'   `HHHHHHb_ :.:.:.: : ____:.: : : : : : :. .::.. : ..       |");
			System.out.println("|:::::P:\"HHHHH\\HP       \"HHF:. `._ :.,-'\"\"    \"-.  :.: : : : .:  .. ..: ..|");
			System.out.println("|::::::::\"HHFHHF         F\"  :::..\"\"\"     \"-.    `. : : : : :..:.: .. ..  |");
			System.out.println("|::::::::::F::PF                ,            \\     \\__ : : : _,-----._..--'   |"); 
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");

		}
		if(hp ==3) {
			System.out.println(",-------------------------------------------------------------------------------.");
			System.out.println("|:::::::::::::::::::::::.:.:.:.:.:.:.:.: : :.: : : : : : : : .. .. :. ..        |");	
			System.out.println("|:::::::dHHHbo._ ::::::::.:.:.:.:.:.: : :.: : :.: : :.: : : :..:..: .. :.       |");
			System.out.println("|::::::dHF\"\"HHHHb.::::::.:.:.:.:.:.:.:.:.:.:.: : :.: : : : : . :. .. . ..     |");
			System.out.println("|:::::dHH  _ \"HHHHb.:::::.:.:.:.:.:.: :.:.: :.:.: : : : : : :.::.: ..: ..      |");	
			System.out.println("|:::::HHH_'o  \"HHHHHb.::.:.:.:.:.:.:.:.: :.:.:.: : :.: : :.: .... .... .:      |");
			System.out.println("|:::::HHFo     \"HHHHHHbo..:.:.:.:.:.:.: :.: : :.: : : : :.: :. :.::.: ..       |");
			System.out.println("|:::::HHH\\`,   HHHHHHHHHHho..:.:.:.:.:.: :.:.:.: : :.:.: : : :: ..  ..  ..     |");	
			System.out.println("|:::::HFHH`._,'HHH'   `HHHHHHb_ :.:.:.: : ____:.: : : : : : :. .::.. : ..       |");
			System.out.println("|:::::P:\"HHHHH\\HP       \"HHF:. `._ :.,-'\"\"    \"-.  :.: : : : .:  .. ..: ..|");
			System.out.println("|::::::::\"HHFHHF         F\"  :::..\"\"\"     \"-.    `. : : : : :..:.: .. ..  |");
			System.out.println("|::::::::::F::PF                ,            \\     \\__ : : : _,-----._..--'   |"); 
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("|:::::::,-'    |    F_j  F  _,-\"\". J        /       `.  :           ._`::::   |");
			System.out.println("|:::::,'       F   J____J-\"\". . . .J       j   ...... `-_ __,.----\"`--._  \" |");
			System.out.println("|::::/ .       F   | . . . . . . ..|       F:::::::_.--' `.             \"-.    |");

		}
		if(hp ==2) {
			System.out.println(",-------------------------------------------------------------------------------.");
			System.out.println("|:::::::::::::::::::::::.:.:.:.:.:.:.:.: : :.: : : : : : : : .. .. :. ..        |");	
			System.out.println("|:::::::dHHHbo._ ::::::::.:.:.:.:.:.: : :.: : :.: : :.: : : :..:..: .. :.       |");
			System.out.println("|::::::dHF\"\"HHHHb.::::::.:.:.:.:.:.:.:.:.:.:.: : :.: : : : : . :. .. . ..     |");
			System.out.println("|:::::dHH  _ \"HHHHb.:::::.:.:.:.:.:.: :.:.: :.:.: : : : : : :.::.: ..: ..      |");	
			System.out.println("|:::::HHH_'o  \"HHHHHb.::.:.:.:.:.:.:.:.: :.:.:.: : :.: : :.: .... .... .:      |");
			System.out.println("|:::::HHFo     \"HHHHHHbo..:.:.:.:.:.:.: :.: : :.: : : : :.: :. :.::.: ..       |");
			System.out.println("|:::::HHH\\`,   HHHHHHHHHHho..:.:.:.:.:.: :.:.:.: : :.:.: : : :: ..  ..  ..     |");	
			System.out.println("|:::::HFHH`._,'HHH'   `HHHHHHb_ :.:.:.: : ____:.: : : : : : :. .::.. : ..       |");
			System.out.println("|:::::P:\"HHHHH\\HP       \"HHF:. `._ :.,-'\"\"    \"-.  :.: : : : .:  .. ..: ..|");
			System.out.println("|::::::::\"HHFHHF         F\"  :::..\"\"\"     \"-.    `. : : : : :..:.: .. ..  |");
			System.out.println("|::::::::::F::PF                ,            \\     \\__ : : : _,-----._..--'   |"); 
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("|:::::::,-'    |    F_j  F  _,-\"\". J        /       `.  :           ._`::::   |");
			System.out.println("|:::::,'       F   J____J-\"\". . . .J       j   ...... `-_ __,.----\"`--._  \" |");
			System.out.println("|::::/ .       F   | . . . . . . ..|       F:::::::_.--' `.             \"-.    |");
			System.out.println("|:::/  '       |   F. . . . . .::::|    _.------'\"\"       :        ...:::::   |");
			System.out.println("|::/,'         J  J  . . . . _;;:::|   '             \\    \"`...::::::::::::   |");
			System.out.println("|:/ F           F F . . . .     \"-_|    _______...-`--\"-.    \";::::::::::::  |");
}		
		if(hp ==1) {
			System.out.println(",-------------------------------------------------------------------------------.");
			System.out.println("|:::::::::::::::::::::::.:.:.:.:.:.:.:.: : :.: : : : : : : : .. .. :. ..        |");	
			System.out.println("|:::::::dHHHbo._ ::::::::.:.:.:.:.:.: : :.: : :.: : :.: : : :..:..: .. :.       |");
			System.out.println("|::::::dHF\"\"HHHHb.::::::.:.:.:.:.:.:.:.:.:.:.: : :.: : : : : . :. .. . ..     |");
			System.out.println("|:::::dHH  _ \"HHHHb.:::::.:.:.:.:.:.: :.:.: :.:.: : : : : : :.::.: ..: ..      |");	
			System.out.println("|:::::HHH_'o  \"HHHHHb.::.:.:.:.:.:.:.:.: :.:.:.: : :.: : :.: .... .... .:      |");
			System.out.println("|:::::HHFo     \"HHHHHHbo..:.:.:.:.:.:.: :.: : :.: : : : :.: :. :.::.: ..       |");
			System.out.println("|:::::HHH\\`,   HHHHHHHHHHho..:.:.:.:.:.: :.:.:.: : :.:.: : : :: ..  ..  ..     |");	
			System.out.println("|:::::HFHH`._,'HHH'   `HHHHHHb_ :.:.:.: : ____:.: : : : : : :. .::.. : ..       |");
			System.out.println("|:::::P:\"HHHHH\\HP       \"HHF:. `._ :.,-'\"\"    \"-.  :.: : : : .:  .. ..: ..|");
			System.out.println("|::::::::\"HHFHHF         F\"  :::..\"\"\"     \"-.    `. : : : : :..:.: .. ..  |");
			System.out.println("|::::::::::F::PF                ,            \\     \\__ : : : _,-----._..--'   |"); 
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("|:::::::,-'    |    F_j  F  _,-\"\". J        /       `.  :           ._`::::   |");
			System.out.println("|:::::,'       F   J____J-\"\". . . .J       j   ...... `-_ __,.----\"`--._  \" |");
			System.out.println("|::::/ .       F   | . . . . . . ..|       F:::::::_.--' `.             \"-.    |");
			System.out.println("|:::/  '       |   F. . . . . .::::|    _.------'\"\"       :        ...:::::   |");
			System.out.println("|::/,'         J  J  . . . . _;;:::|   '             \\    \"`...::::::::::::   |");
			System.out.println("|:/ F           F F . . . .     \"-_|    _______...-`--\"-.    \";::::::::::::  |");
			System.out.println("|/  j     __.-\"\"- J .    .........--'\"\"\"\"\"`-._      ...::\"`-.  ;.:::::: |");
			System.out.println("|  |    (.___...-'                           ..Krogg:::::::::\"-.j::::::::::::  |");
			System.out.println("`-------------------------------------------------------------------------------'");

		}
		
	}
	/**
	 * gubben istälet för att vara en gubbe.
	 * 
	 * @param hp hur många fel som anvendaren har 
	 */
	public static void gubenVanlig (int hp) {
	   
			if (hp==9) {
				System.out.println(" 	                                        //\"\\\\   \"\"\"\"`---.___.-\"\"  /===-");
				System.out.println("             ______-==l                         l l     \\\\     	            _-\"`");
				System.out.println("       __--\"\"\"  ,-/-==\\\\                        l l     ` \\     	         ,'");
			}
			if (hp==8) {
				System.out.println(" 	                                        //\"\\\\   \"\"\"\"`---.___.-\"\"  /===-");
				System.out.println("             ______-==l                         l l     \\\\     	            _-\"`");
				System.out.println("       __--\"\"\"  ,-/-==\\\\                        l l     ` \\     	         ,'");
				System.out.println("    _-\"             /'     l  \\\\            __    / /        \\   	     /");
				System.out.println("  .'                 /       l   \\\\         /\"   \"\\/' /         \\      ,,, /'");
				System.out.println(" /  ____      /         l    \\`\\.__/- \\_/'  /              \\/'''");
			}
			if(hp==7) {
				System.out.println(" 	                                        //\"\\\\   \"\"\"\"`---.___.-\"\"  /===-");
				System.out.println("             ______-==l                         l l     \\\\     	            _-\"`");
				System.out.println("       __--\"\"\"  ,-/-==\\\\                        l l     ` \\     	         ,'");
				System.out.println("    _-\"             /'     l  \\\\            __    / /        \\   	     /");
				System.out.println("  .'                 /       l   \\\\         /\"   \"\\/' /         \\      ,,, /'");
				System.out.println(" /  ____      /         l    \\`\\.__/- \\_/'  /              \\/'''");
				System.out.println("/-'\"    \"\"\"\"\"---__     l     \"-/\"            /'        _--\"`");
			    System.out.println("                          \\_l      /        __--_) __--\"");
			    System.out.println("                          '\"\"--_/      -\"_<-->_\\'-\" \\");
			}
			if(hp==6) {
				System.out.println(" 	                                        //\"\\\\   \"\"\"\"`---.___.-\"\"  /===-");
				System.out.println("             ______-==l                         l l     \\\\     	            _-\"`");
				System.out.println("       __--\"\"\"  ,-/-==\\\\                        l l     ` \\     	         ,'");
				System.out.println("    _-\"             /'     l  \\\\            __    / /        \\   	     /");
				System.out.println("  .'                 /       l   \\\\         /\"   \"\\/' /         \\      ,,, /'");
				System.out.println(" /  ____      /         l    \\`\\.__/- \\_/'  /              \\/'''");
				System.out.println("/-'\"    \"\"\"\"\"---__     l     \"-/\"            /'        _--\"`");
			    System.out.println("                          \\_l      /        __--_) __--\"");
			    System.out.println("                          '\"\"--_/      -\"_<-->_\\'-\" \\");
			    System.out.println("                   {\\_--_/}    / \\__<-->__\\     \\");
			    System.out.println("                  /'   (_/  _-\"    l   l__<-->__l    l");
			}
			if(hp==5) {
				System.out.println(" 	                                        //\"\\\\   \"\"\"\"`---.___.-\"\"  /===-");
				System.out.println("             ______-==l                         l l     \\\\     	            _-\"`");
				System.out.println("       __--\"\"\"  ,-/-==\\\\                        l l     ` \\     	         ,'");
				System.out.println("    _-\"             /'     l  \\\\            __    / /        \\   	     /");
				System.out.println("  .'                 /       l   \\\\         /\"   \"\\/' /         \\      ,,, /'");
				System.out.println(" /  ____      /         l    \\`\\.__/- \\_/'  /              \\/'''");
				System.out.println("/-'\"    \"\"\"\"\"---__     l     \"-/\"            /'        _--\"`");
			    System.out.println("                          \\_l      /        __--_) __--\"");
			    System.out.println("                          '\"\"--_/      -\"_<-->_\\'-\" \\");
			    System.out.println("                   {\\_--_/}    / \\__<-->__\\     \\");
			    System.out.println("                  /'   (_/  _-\"    l   l__<-->__l    l");
			    System.out.println("                  l   _/) )-\"         l   l__<-->__l     l");
			    System.out.println("                  / /\" ,_/         / /__<--->__/    l");
			}
			if(hp==4) {
				System.out.println(" 	                                        //\"\\\\   \"\"\"\"`---.___.-\"\"  /===-");
				System.out.println("             ______-==l                         l l     \\\\     	            _-\"`");
				System.out.println("       __--\"\"\"  ,-/-==\\\\                        l l     ` \\     	         ,'");
				System.out.println("    _-\"             /'     l  \\\\            __    / /        \\   	     /");
				System.out.println("  .'                 /       l   \\\\         /\"   \"\\/' /         \\      ,,, /'");
				System.out.println(" /  ____      /         l    \\`\\.__/- \\_/'  /              \\/'''");
				System.out.println("/-'\"    \"\"\"\"\"---__     l     \"-/\"            /'        _--\"`");
			    System.out.println("                          \\_l      /        __--_) __--\"");
			    System.out.println("                          '\"\"--_/      -\"_<-->_\\'-\" \\");
			    System.out.println("                   {\\_--_/}    / \\__<-->__\\     \\");
			    System.out.println("                  /'   (_/  _-\"    l   l__<-->__l    l");
			    System.out.println("                  l   _/) )-\"         l   l__<-->__l     l");
			    System.out.println("                  / /\" ,_/         / /__<--->__/    l");
			    System.out.println("                 o-o _//        /-\"_<--->__-\"     /");
			    System.out.println("                (^(\"          /\"_<--->__-      _-\"");
			    System.out.println("                ,/l           /__<-->__/     _-\"");
			}
			if(hp==3) {
				System.out.println(" 	                                        //\"\\\\   \"\"\"\"`---.___.-\"\"  /===-");
				System.out.println("             ______-==l                         l l     \\\\     	            _-\"`");
				System.out.println("       __--\"\"\"  ,-/-==\\\\                        l l     ` \\     	         ,'");
				System.out.println("    _-\"             /'     l  \\\\            __    / /        \\   	     /");
				System.out.println("  .'                 /       l   \\\\         /\"   \"\\/' /         \\      ,,, /'");
				System.out.println(" /  ____      /         l    \\`\\.__/- \\_/'  /              \\/'''");
				System.out.println("/-'\"    \"\"\"\"\"---__     l     \"-/\"            /'        _--\"`");
			    System.out.println("                          \\_l      /        __--_) __--\"");
			    System.out.println("                          '\"\"--_/      -\"_<-->_\\'-\" \\");
			    System.out.println("                   {\\_--_/}    / \\__<-->__\\     \\");
			    System.out.println("                  /'   (_/  _-\"    l   l__<-->__l    l");
			    System.out.println("                  l   _/) )-\"         l   l__<-->__l     l");
			    System.out.println("                  / /\" ,_/         / /__<--->__/    l");
			    System.out.println("                 o-o _//        /-\"_<--->__-\"     /");
			    System.out.println("                (^(\"          /\"_<--->__-      _-\"");
			    System.out.println("                ,/l           /__<-->__/     _-\"");
			    System.out.println("             ,//('(          l__<-->__l     /                        ----_");
			    System.out.println("            ( ( '))          l__<-->__l    l                       /' _---_\"\\");
			    System.out.println("         `-)) )) (           l__<-->__l    l                     /'  /     \"\\`\\");
			}
			if(hp==2) {
				System.out.println(" 	                                        //\"\\\\   \"\"\"\"`---.___.-\"\"  /===-");
				System.out.println("             ______-==l                         l l     \\\\     	            _-\"`");
				System.out.println("       __--\"\"\"  ,-/-==\\\\                        l l     ` \\     	         ,'");
				System.out.println("    _-\"             /'     l  \\\\            __    / /        \\   	     /");
				System.out.println("  .'                 /       l   \\\\         /\"   \"\\/' /         \\      ,,, /'");
				System.out.println(" /  ____      /         l    \\`\\.__/- \\_/'  /              \\/'''");
				System.out.println("/-'\"    \"\"\"\"\"---__     l     \"-/\"            /'        _--\"`");
			    System.out.println("                          \\_l      /        __--_) __--\"");
			    System.out.println("                          '\"\"--_/      -\"_<-->_\\'-\" \\");
			    System.out.println("                   {\\_--_/}    / \\__<-->__\\     \\");
			    System.out.println("                  /'   (_/  _-\"    l   l__<-->__l    l");
			    System.out.println("                  l   _/) )-\"         l   l__<-->__l     l");
			    System.out.println("                  / /\" ,_/         / /__<--->__/    l");
			    System.out.println("                 o-o _//        /-\"_<--->__-\"     /");
			    System.out.println("                (^(\"          /\"_<--->__-      _-\"");
			    System.out.println("                ,/l           /__<-->__/     _-\"");
			    System.out.println("             ,//('(          l__<-->__l     /                        ----_");
			    System.out.println("            ( ( '))          l__<-->__l    l                       /' _---_\"\\");
			    System.out.println("         `-)) )) (           l__<-->__l    l                     /'  /     \"\\`\\");
			    System.out.println("        ,/,'//( (             \\__<-->__\\    \\                  /'  //        ll");
			    System.out.println("      ,( ( ((, ))              \"-__<-->_\"-_  \"--____---\"'  _/'/");
			    System.out.println("    `\"/  )` ) ,/l                 \"-_\"<-->_/-__       __-\" _/");
			}
			if(hp==1) {
				System.out.println(" 	                                        //\"\\\\   \"\"\"\"`---.___.-\"\"  /===-");
				System.out.println("             ______-==l                         l l     \\\\     	            _-\"`");
				System.out.println("       __--\"\"\"  ,-/-==\\\\                        l l     ` \\     	         ,'");
				System.out.println("    _-\"             /'     l  \\\\            __    / /        \\   	     /");
				System.out.println("  .'                 /       l   \\\\         /\"   \"\\/' /         \\      ,,, /'");
				System.out.println(" /  ____      /         l    \\`\\.__/- \\_/'  /              \\/'''");
				System.out.println("/-'\"    \"\"\"\"\"---__     l     \"-/\"            /'        _--\"`");
			    System.out.println("                          \\_l      /        __--_) __--\"");
			    System.out.println("                          '\"\"--_/      -\"_<-->_\\'-\" \\");
			    System.out.println("                   {\\_--_/}    / \\__<-->__\\     \\");
			    System.out.println("                  /'   (_/  _-\"    l   l__<-->__l    l");
			    System.out.println("                  l   _/) )-\"         l   l__<-->__l     l");
			    System.out.println("                  / /\" ,_/         / /__<--->__/    l");
			    System.out.println("                 o-o _//        /-\"_<--->__-\"     /");
			    System.out.println("                (^(\"          /\"_<--->__-      _-\"");
			    System.out.println("                ,/l           /__<-->__/     _-\"");
			    System.out.println("             ,//('(          l__<-->__l     /                        ----_");
			    System.out.println("            ( ( '))          l__<-->__l    l                       /' _---_\"\\");
			    System.out.println("         `-)) )) (           l__<-->__l    l                     /'  /     \"\\`\\");
			    System.out.println("        ,/,'//( (             \\__<-->__\\    \\                  /'  //        ll");
			    System.out.println("      ,( ( ((, ))              \"-__<-->_\"-_  \"--____---\"'  _/'/");
			    System.out.println("    `\"/  )` ) ,/l                 \"-_\"<-->_/-__       __-\" _/");
			    System.out.println("  ._-\"//( )/ )) `                    \"\"-'_/_/ /\"\"\"\"\"\"\"__--\"");
			    System.out.println("   ;'( ')/ ,)(                                 \"\"\"\"\"\"\"\"\"\"");
			    System.out.println("  ' ') '( (/");
			      
			}
	}
	/**
	 * visa grafisk upp att du har vunit.
	 */
	public static void vinst18() {
		System.out.println(",-------------------------------------------------------------------------------.");
		System.out.println("|:::::::::::::::::::::::.:.:.:.:.:.:.:.: : :.: : : : : : : : .. .. :. ..        |");	
		System.out.println("|:::::::dHHHbo._ ::::::::.:.:.:.:.:.: : :.: : :.: : :.: : : :..:..: .. :.       |");
		System.out.println("|::::::dHF\"\"HHHHb.::::::.:.:.:.:.:.:.:.:.:.:.: : :.: : : : : . :. .. . ..     |");
		System.out.println("|:::::dHH  _ \"HHHHb.:::::.:.:.:.:.:.: :.:.: :.:.: : : : : : :.::.: ..: ..      |");	
		System.out.println("|:::::HHH_'o  \"HHHHHb.::.:.:.:.:.:.:.:.: :.:.:.: : :.: : :.: .... .... .:      |");
		System.out.println("|:::::HHFo     \"HHHHHHbo..:.:.:.:.:.:.: :.: : :.: : : : :.: :. :.::.: ..       |");
		System.out.println("|:::::HHH\\`,   HHHHHHHHHHho..:.:.:.:.:.: :.:.:.: : :.:.: : : :: ..  ..  ..     |");	
		System.out.println("|:::::HFHH`._,'HHH'   `HHHHHHb_ :.:.:.: : ____:.: : : : : : :. .::.. : ..       |");
		System.out.println("|:::::P:\"HHHHH\\HP       \"HHF:. `._ :.,-'\"\"    \"-.  :.: : : : .:  .. ..: ..|");
		System.out.println("|::::::::\"HHFHHF         F\"  :::..\"\"\"     \"-.    `. : : : : :..:.: .. ..  |");
		System.out.println("|::::::::::F::PF                ,            \\     \\__ : : : _,-----._..--'   |"); 
		System.out.println("|::::::::::::::F    j\\         /              ;     `.\"----''                 |");
		System.out.println("|::::::::::::::|    j  `.      `               A       \\                       |");
		System.out.println("|::::::::::::::|    |    ;_       .            8        \\                      |");
		System.out.println("|::::::::::::::J    F\\_,'| \"`-----.\\         j `.       \\                     |");
		System.out.println("|:::::::::::::: F  j  F  |          F        /   \\       \\  ____     ,...     |");
		System.out.println("|::::::::::,-'\"J   J  |  |       _-\"F      j     `.     '\"    \"\"--/::::    |");
		System.out.println("|:::::::,-'    |    F_j  F  _,-\"\". J      /       `.  :           ._`::::     |");
		System.out.println("|:::::,'       F   J____J-\"\". . . .J    j   ...... `-_ __,.----\"`--._        |");
		System.out.println("|::::/ .       F   | . . . . . . ..|       F:::::::_.--' `.               \"-.  |");
		System.out.println("|:::/  '       |   F. . . . . .::::|    _.------'\"\"       :        ...::::::::|");
		System.out.println("|::/,'         J  J  . . . . _;;:::|   '             \\    \"`...:::::::::::::::|");
		System.out.println("|:/ F           F F . . . .     \"-_|    _______...-`--\"-.    \";::::::::::::::|");
		System.out.println("|/  j     __.-\"\"- J .    .........--'\"\"\"\"\"`-._      ...::\"`-.  ;.:::::::|");
		System.out.println("|  |    (.___...-'                           ..Krogg:::::::::\"-.j::::::::::::::|");
		System.out.println("`-------------------------------------------------------------------------------'");
	}
	/**
	 * visa grafisk upp att du har vunit.
	 */
	public static void vinst() {
        System.out.println("************************************");
        System.out.println("****** GRATTIS! DU LYCKADES ********");
        System.out.println("************************************");
        System.out.println("************************************");
	}

}