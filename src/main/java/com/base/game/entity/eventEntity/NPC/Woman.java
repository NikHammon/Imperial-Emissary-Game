package com.base.game.entity.eventEntity.NPC;

import java.awt.Rectangle;

import com.base.game.Animation;
import com.base.game.Assets;
import com.base.game.Handler;

public class Woman extends NPC
{
	public Woman(Handler handler, float x, float y, int layer) 
	{
		super(handler, x, y, layer, 72, 72);
		setBounds(new Rectangle(20, 40, 35, 30));
		
		scriptNum = 1;
		
		stationary = Assets.NPC6Stationary;
		
		lft = new Animation(150, Assets.NPC6Lft, 0);
		rgt = new Animation(150, Assets.NPC6Rgt, 0);
		up = new Animation(150, Assets.NPC6Up, 0);
		dwn = new Animation(150, Assets.NPC6Dwn, 0);
		
		currentAnimation = dwn;
	}
}
