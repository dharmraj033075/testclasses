package dharm;

public class soccer {
	player[] play=new player[2];
	ball1 vall=new ball1(78,45,56);
	play[1]=new player(2,45,8);
	play[0]=new player(2,4,5);
	play[2]=new player(4,5,6);
	for(int i=0;i<=2;i++){
		if(play[i].near(vall)){
			play[i].kick(vall);
		}
	}

}
