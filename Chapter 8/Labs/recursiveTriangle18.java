import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

/*
   //x is accross and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle

*/  private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.black);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a rocket using polygons and polylines.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
       page.setColor(Color.black);
       page.fillRect(0,0,APPLET_WIDTH,APPLET_HEIGHT);
        page.setColor (Color.yellow);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       //Find the distance between 2 points ex. - x,y & x1,y1
           double distance = Math.sqrt((Math.pow(xPos[0]-xPos[1],2)+Math.pow(yPos[0]-yPos[1],2)));


        //if the segment/distance is 30 or so, good length to stop
       if(distance>30)
       {
           
           //find midpoints of segments
            int midptx1 = (xPos[0]+xPos[1])/2;
            int midptx2 = (xPos[1]+xPos[2])/2;
            int midptx3 = (xPos[2]+xPos[3])/2;
            
           //midpoints of y
           int midpty1 = (yPos[0]+yPos[1])/2;
           int midpty2 = (yPos[1]+yPos[2])/2;
           int midpty3 = (yPos[2]+yPos[3])/2;
           
           //make a new array to store xmidpts and y midpts
           int[] xmidar = {midptx1,midptx2,midptx3,midptx1};
           int[] ymidar = {midpty1,midpty2,midpty3,midpty1};
           
           page.drawPolyline (xmidar, ymidar, xPos.length);
           //arrays to go in triangle recursive call
           int[] drawx1 = {midptx1, midptx2, xPos[1],midptx1};
           int[] drawx2 = {midptx2, midptx3, xPos[2],midptx2};
           int[] drawx3 = {midptx3, midptx1,xPos[3],midptx3};
           // y arrays
           int[] drawy1 = {midpty1, midpty2, yPos[1],midpty1};
           int[] drawy2 = {midpty2, midpty3, yPos[2],midpty2};
           int[] drawy3 = {midpty3, midpty1,yPos[3],midpty3};
           
           //recursively draw 3 triangles
           Triangle(drawx1,drawy1,page);
           Triangle(drawx2, drawy2,page);
           Triangle(drawx3,drawy3,page);
           
        }



   }//end of Triangle
}
