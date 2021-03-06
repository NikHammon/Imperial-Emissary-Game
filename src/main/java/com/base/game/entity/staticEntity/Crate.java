package com.base.game.entity.staticEntity;

import java.awt.Graphics;

import com.base.game.Animation;
import com.base.game.Assets;
import com.base.game.Handler;
import com.base.game.tiles.Tile;

public class Crate extends Breakables
{
	public Crate(Handler handler, float x, float y, int layer, int level) {
		super(handler, x, y, layer, Tile.TILE_WIDTH, Tile.TILE_HEIGHT, level);
		bounds.x = 18;
		bounds.y = 30;
		bounds.width = 30;
		bounds.height = 22;
	
		currentAnimation = new Animation(100, Assets.crate, 1);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(currentAnimation.getCurrentFrame(), (int) (x - handler.getCamera().getxOffset()),(int) (y - handler.getCamera().getyOffset()), width, height, null);	
	}
}
