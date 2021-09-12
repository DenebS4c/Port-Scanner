package Scanner;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class PortScanner extends Thread {
	public static Scanner scan = new Scanner(System.in);
	
	static void Banner() {
		System.out.println(Colores.ANSI_CYAN+"             ,----------------,              ,---------,\r\n"
				+ "        ,-----------------------,          ,\"        ,\"|\r\n"
				+ "      ,\"                      ,\"|        ,\"        ,\"  |\r\n"
				+ "     +-----------------------+  |      ,\"        ,\"    |\r\n"
				+ "     |  .-----------------.  |  |     +---------+      |\r\n"
				+ "     |  |                 |  |  |     | -==----'|      |\r\n"
				+ "     |  |  I LOVE DOS!    |  |  |     |         |      |\r\n"
				+ "     |  |  Bad command or |  |  |/----|`---=    |      |\r\n"
				+ "     |  |  C:\\>_          |  |  |   ,/|==== ooo |      ;\r\n"
				+ "     |  |                 |  |  |  // |(((( [33]|    ,\"\r\n"
				+ "     |  `-----------------'  |,\" .;'| |((((     |  ,\"\r\n"
				+ "     +-----------------------+  ;;  | |         |,\"\r\n"
				+ "        /_)______________(_/  //'   | +---------+\r\n"
				+ "   ___________________________/___  `,\r\n"
				+ "  /  oooooooooooooooo  .o.  oooo /,   \\,\"-----------\r\n"
				+ " / ==ooooooooooooooo==.o.  ooo= //   ,`\\--{)B     ,\"\r\n"
				+ "/_==__==========__==_ooo__ooo=_/'   /___________,\"\r\n"
				+ "`-----------------------------'\n");
	}
	
	static void Clear() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
	
	public final class Colores {
	    

		  public static final String ANSI_RESET = "\u001B[0m";
		  public static final String ANSI_BLACK = "\u001B[30m";
		  public static final String ANSI_RED = "\u001B[31m";
		  public static final String ANSI_GREEN = "\u001B[32m";
		  public static final String ANSI_YELLOW = "\u001B[33m";
		  public static final String ANSI_BLUE = "\u001B[34m";
		  public static final String ANSI_PURPLE = "\u001B[35m";
		  public static final String ANSI_CYAN = "\u001B[36m";
		  public static final String ANSI_WHITE = "\u001B[37m";

	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Clear();
		RunxD();
		
	}
	public static void RunxD() {
		Banner();
		System.out.print(Colores.ANSI_WHITE+"[ "+Colores.ANSI_CYAN+"IP "+Colores.ANSI_WHITE+"] "+Colores.ANSI_CYAN+"» "+Colores.ANSI_RESET);
		String IP = scan.nextLine();
		
		System.out.print(Colores.ANSI_WHITE+"[ "+Colores.ANSI_CYAN+"PORT "+Colores.ANSI_WHITE+"] "+Colores.ANSI_CYAN+"» "+Colores.ANSI_RESET);
		String PORT = scan.nextLine();
		
		System.out.print(Colores.ANSI_WHITE+"[ "+Colores.ANSI_CYAN+"TIME OUT "+Colores.ANSI_WHITE+"] "+Colores.ANSI_CYAN+"» "+Colores.ANSI_RESET);
		int timeout = scan.nextInt();
		
		String[] ports = PORT.split("-");
		String Split1 = ports[0];
		String Split2 = ports[1];
		int port1 = Integer.parseInt(Split1);
		int port2 = Integer.parseInt(Split2);
		
		System.out.println("");
		
		for(int port = port1; port1 <= port2; port++) {

		     try {
		          Socket socket = new Socket();
		          socket.connect(new InetSocketAddress(IP, port), timeout);
		          socket.close();
		          System.out.println(Colores.ANSI_WHITE+"[ "+Colores.ANSI_CYAN+"Port Open "+Colores.ANSI_WHITE+"] "+Colores.ANSI_CYAN+"» "+Colores.ANSI_RESET+port);
		          
		          
		     } catch (Exception ex) {}
		     
		}
		
		System.out.println(Colores.ANSI_WHITE+"[ "+Colores.ANSI_CYAN+"Finish "+Colores.ANSI_WHITE+"] "+Colores.ANSI_CYAN+"» "+Colores.ANSI_RESET+"Escaneo Terminado !");
	}
		
		

}
