package com.base.game.entity.eventEntity.NPC;

import java.awt.Rectangle;

import com.base.game.Animation;
import com.base.game.Assets;
import com.base.game.Handler;

public class NPC16 extends NPC
{
	public NPC16(Handler handler, float x, float y, int layer) 
	{
		super(handler, x, y, layer, 72, 72);
		setBounds(new Rectangle(15, 30, 30, 25));
		
		scriptNum = 1;
		
		stationary = Assets.NPC16Stationary;
		
		lft = new Animation(150, Assets.NPC16Lft, 0);
		rgt = new Animation(150, Assets.NPC16Rgt, 0);
		up = new Animation(150, Assets.NPC16Up, 0);
		dwn = new Animation(150, Assets.NPC16Dwn, 0);
		
		currentAnimation = dwn;
	}
}
