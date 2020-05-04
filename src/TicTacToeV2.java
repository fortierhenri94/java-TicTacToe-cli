

import java.util.*;

public class TicTacToeV2 
{
	static Scanner sc = new Scanner(System.in);
	
	static char[][] Matrice = new char[3][3];
	
	static String Player1;
	
	static String Player2;
	
	static String Player_Input_X;
	
	static String Player_Input_O;
	
	public static void main(String[] args) 
	{
		Game_Lobby_New_Game();
		
		Affichage_TicTacToe();
		
		Game_Loop();
		
		    System.out.println();
		    System.out.println("Appuyer sur Enter pour fermer le TicTacToe");
		    Scanner sc = new Scanner(System.in);
		    String Enter = sc.nextLine();
		
	
	}
	
    static void Affichage_TicTacToe()
	{
		System.out.println();
		System.out.println("#|A-B-C|#");
		System.out.println("-|-----|-");
		System.out.println("1|" + Matrice[0][0] + "|" + Matrice[0][1] + "|" + Matrice[0][2] + "|1");
		System.out.println("-|-----|");
		System.out.println("2|" + Matrice[1][0] + "|" + Matrice[1][1] + "|" + Matrice[1][2] + "|2");
		System.out.println("-|-----|-");
		System.out.println("3|" + Matrice[2][0] + "|" + Matrice[2][1] + "|" + Matrice[2][2] + "|3");
		System.out.println("-|-----|-");
		System.out.println("#|A-B-C|#");
	}

    static void Game_Lobby_New_Game()
    {
    	
        System.out.println("Quel est le nom du joueur qui débutera et qui jouera pour les O ?");
    	Player1 = sc.nextLine();

        System.out.println();
        System.out.println("Quel est le nom du joueur qui jouera en deuxième et qui jouera pour les X ?");
        Player2 = sc.nextLine();
    }
    
    static void Player_Turn_X()
    {
        System.out.println(Player2);
        Case_Playable_Or_Not_X();
    }
    
    static void Player_Turn_O()
    {
    	System.out.println(Player1);
    	Case_Playable_Or_Not_O();
    }

    static void Case_Playable_Or_Not_X()
    {
 
    	Player_Input_X = sc.nextLine();

        if (Player_Input_X.equals("A1"))
        {
            if (Matrice[0][0] == 'X' || Matrice[0][0] == 'O')
            {

                System.out.println("Case deja jouer...");
                Player_Turn_X();
            }
            else
            {
                Matrice[0][0] = 'X';
            }
        }

        else if (Player_Input_X.equals("A2"))
        {
            if (Matrice[1][0] == 'X' || Matrice[1][0] == 'O')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_X();
            }
            else
            {
                Matrice[1][0] = 'X';
            }
        }

        else if (Player_Input_X.equals("A3"))
        {
            if (Matrice[2][0] == 'X' || Matrice[2][0] == 'O')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_X();
            }
            else
            {
                Matrice[2][0] = 'X';
            }
        }

        else if (Player_Input_X.equals("B1"))
        {
            if (Matrice[0][1] == 'X' || Matrice[0][1] == 'O')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_X();
            }
            else
            {
                Matrice[0][1] = 'X';
            }
        }

        else if (Player_Input_X.equals("B2"))
        {
            if (Matrice[1][1] == 'X' || Matrice[1][1] == 'O')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_X();
            }
            else
            {
                Matrice[1][1] = 'X';
            }
        }

        else if (Player_Input_X.equals("B3"))
        {
            if (Matrice[2][1] == 'X' || Matrice[2][1] == 'O')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_X();
            }
            else
            {
                Matrice[2][1] = 'X';
            }
        }

        else if (Player_Input_X.equals("C1"))
        {
            if (Matrice[0][2] == 'X' || Matrice [0][2] == 'O')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_X();
            }
            else
            {
                Matrice[0][2] = 'X';
            }
        }

        else if (Player_Input_X.equals("C2"))
        {
            if (Matrice[1][2] == 'X' || Matrice[1][2] == 'O')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_X();
            }
            else
            {
                Matrice[1][2] = 'X';
            }
        }

        else if (Player_Input_X.equals("C3"))
        {
            if (Matrice[2][2] == 'X' || Matrice [2][2] == 'O')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_X();
            }
            else
            {
                Matrice[2][2] = 'X';
            }
        }

        else
        {
        	System.out.println("Case impossible a jouer...");
            Player_Turn_X();
        }
    }

    static void Case_Playable_Or_Not_O()
    {
    	Player_Input_O = sc.nextLine();
    	
    	if (Player_Input_O.equals("A1"))
        {
            if (Matrice[0][0] == 'O' || Matrice[0][0] == 'X')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_O();
            }
            else
            {
                Matrice[0][0] = 'O';
            }
        }

        else if (Player_Input_O.equals("A2"))
        {
            if (Matrice[1][0] == 'O' || Matrice[1][0] == 'X')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_O();
            }
            else
            {
                Matrice[1][0] = 'O';
            }
        }

        else if (Player_Input_O.equals("A3"))
        {
            if (Matrice[2][0] == 'O' || Matrice[2][0] == 'X')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_O();
            }
            else
            {
                Matrice[2][0] = 'O';
            }
        }

        else if (Player_Input_O.equals("B1"))
        {
            if (Matrice[0][1] == 'O' || Matrice[0][1] == 'X')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_O();
            }
            else
            {
                Matrice[0][1] = 'O';
            }
        }

        else if (Player_Input_O.equals("B2"))
        {
            if (Matrice[1][1] == 'O' || Matrice[1][1] == 'X')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_O();
            }
            else
            {
                Matrice[1][1] = 'O';
            }
        }

        else if (Player_Input_O.equals("B3"))
        {
            if (Matrice[2][1] == 'O' || Matrice[2][1] == 'X')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_O();
            }
            else
            {
                Matrice[2][1] = 'O';
            }
        }

        else if (Player_Input_O.equals("C1"))
        {
            if (Matrice[0][2] == 'O' || Matrice[0][2] == 'X')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_O();
            }
            else
            {
                Matrice[0][2] = 'O';
            }
        }

        else if (Player_Input_O.equals("C2"))
        {
            if (Matrice[1][2] == 'O' || Matrice[1][2] == 'X')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_O();
            }
            else
            {
                Matrice[1][2] = 'O';
            }
        }

        else if (Player_Input_O.equals("C3"))
        {
            if (Matrice[2][2] == 'O' || Matrice[2][2] == 'X')
            {
            	System.out.println("Case deja jouer...");
                Player_Turn_O();
            }
            else
            {
                Matrice[2][2] = 'O';
            }
        }

        else
        {
        	System.out.println("Case impossible a jouer...");
            Player_Turn_O();
        }
    }
    
    static void Game_Loop()
    {
    	 while (true)
         {
             Player_Turn_O();
             
             if ((Matrice[0][0] == 'O' && Matrice[1][1] == 'O' && Matrice[2][2] == 'O') || (Matrice[0][2] == 'O' && Matrice[1][1] == 'O' && Matrice[2][0] == 'O') || (Matrice[0][1] == 'O' && Matrice[1][1] == 'O' && Matrice[2][1] == 'O') || (Matrice[0][0] == 'O' && Matrice[1][0] == 'O' && Matrice[2][0] == 'O') || (Matrice[0][2] == 'O' && Matrice[1][2] == 'O' && Matrice[2][2] == 'O') || (Matrice[0][0] == 'O' && Matrice[0][1] == 'O' && Matrice[0][2] == 'O') || (Matrice[1][0] == 'O' && Matrice[1][1] == 'O' && Matrice[1][2] == 'O') || (Matrice[2][0] == 'O' && Matrice[2][1] == 'O' && Matrice[2][2] == 'O'))
             {
                 Affichage_TicTacToe();
                 System.out.println("Bravo ! " + Player1 + " a gagné !");
                 break;
             }
             else if ( (Matrice[0][0] == 'X' || Matrice[0][0] == 'O') && (Matrice[1][0] == 'O' || Matrice[1][0] == 'X') && (Matrice[2][0] == 'O' || Matrice[2][0] == 'X') && (Matrice[1][0] == 'O' || Matrice[1][0] == 'X') && (Matrice[1][1] == 'O' || Matrice[1][1] == 'X') && (Matrice[1][2] == 'O' || Matrice[1][2] == 'X') && (Matrice[2][0] == 'O' || Matrice[2][0] == 'X') && (Matrice[2][1] == 'O' || Matrice[2][1] == 'X') && (Matrice[2][2] == 'O' || Matrice[2][2] == 'X') )
             {
                 Affichage_TicTacToe();
                 System.out.println("La partie se termine... Égalité...");
                 break;
             }
             else
             {
                 Affichage_TicTacToe();
                 
             }
             Player_Turn_X();

             if ((Matrice[0][0] == 'X' && Matrice[1][1] == 'X' && Matrice[2][2] == 'X') || (Matrice[0][2] == 'X' && Matrice[1][1] == 'X' && Matrice[2][0] == 'X') || (Matrice[0][1] == 'X' && Matrice[1][1] == 'X' && Matrice[2][1] == 'X') || (Matrice[0][0] == 'X' && Matrice[1][0] == 'X' && Matrice[2][0] == 'X') || (Matrice[0][2] == 'X' && Matrice[1][2] == 'X' && Matrice[2][2] == 'X') || (Matrice[0][0] == 'X' && Matrice[0][1] == 'X' && Matrice[0][2] == 'X') || (Matrice[1][0] == 'X' && Matrice[1][1] == 'X' && Matrice[1][2] == 'X') || (Matrice[2][0] == 'X' && Matrice[2][1] == 'X' && Matrice[2][2] == 'X'))
             {
                 Affichage_TicTacToe();
                 System.out.println("Bravo ! " + Player2 + " a gagné !");
                 break;
             }
             else if (Matrice[0][0] == ' ' && Matrice[1][0] == ' ' && Matrice[2][0] == ' ' && Matrice[1][0] == ' ' && Matrice[1][1] == ' ' && Matrice[1][2] == ' ' && Matrice[2][0] == ' ' && Matrice[2][1] == ' ' && Matrice[2][2] == ' ')
             {
                 Affichage_TicTacToe();
                 System.out.println("La partie se termine... Égalité...");
                 break;
             }
             else
             {
                 Affichage_TicTacToe();

             }
         }
    }
}
