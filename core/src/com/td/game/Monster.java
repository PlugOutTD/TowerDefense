package com.td.game;

abstract class Monster{
	
	protected float life;
	protected float maxLife;
	private int strenght;
	private int wave;
	private int speed;
	
	public Monster(){
		
		wave = 1;
		
	}
	
	//M�thode de mouvement d'un monster
	public void Move(){
		
		//Mouvements case par case
		
	}
	
	//M�thode d'attaque d'un monster
	public void Attack(){
		
		//Attaque quand le monstre se trouve sur la case qui borde le mur
		
		
	}
	
	//Reception des d�g�ts par un monster, retourne sa vie
	public void takeDamage(){
		//D�g�ts re�us par les tourelles  
		
		life--;
		
		if (life < 0){
			life = 0;
		}
		
	}
	
	public void waveLevel(){
		
		wave++;
		maxLife = (float) (maxLife + 10*(1/wave));
		life = (float) (life + 10*(1/wave));
		
	}
	
	public float getHeatlh(){
		
		return life;
		
		
		
	}

}
