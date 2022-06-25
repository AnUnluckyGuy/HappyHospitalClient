package Graphic;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Entity {
    private String name;
    private int state;
    private int x;
    private int y;
    private int size;
    private BufferedImage image;

    public Entity(String imageInfo) {
        String[] tmp = imageInfo.split(" ");
        name = tmp[0];
        state = Integer.parseInt(tmp[1]);
        x = Integer.parseInt(tmp[2]);
        y = Integer.parseInt(tmp[3]);
        size = Integer.parseInt(tmp[4]);
        if (name.equals("player")) {
            image = Image.PLAYER.getImage(state);
        } else if (name.equals("opponent")) {
            image = Image.OPPONENT.getImage(state);
        } else if (nname.equals("NPC")) {
            image = Image.NPC.getImage(state);
        }
    }

    public void draw(Graphics2D g2) {
        g2.drawImage(image, x, y, size, size, null);
    }
}
