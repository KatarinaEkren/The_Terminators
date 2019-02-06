package inf112.skeleton.app.TileTypes;

/**
 *
 * @Author Ingrid
 *
 */
enum Rotation{
    CW, CCW
}

public class Rotator extends Tile {
    Rotation rotation;

    public Rotator(Rotation rotation) {
        this.image = "rotate";
        this.rotation = rotation;

    }

    @Override
    public String getImage() {
        if (rotation == Rotation.CW){
            return image + "_cw";
        } else if (rotation == Rotation.CCW){
            return image + "_ccw";
        } else return "";
    }
}