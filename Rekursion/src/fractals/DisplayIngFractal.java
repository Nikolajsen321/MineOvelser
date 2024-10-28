package fractals;

public class DisplayIngFractal {
    public static void main(String[] args) {
        /*
        Using recursion is ideal for displaying fractals because fractals are inherently
        recursive.

        En fractal er en geometrisk figur, med ikke ligesom cirkler og rektangler, kan fractals
        deles op i dele, som hver er en mindre størrelse kopi af det hele mange intersante eksempler
        af fractal

        This section introduces a simple fractal, the Sierpinski triangle, named after
        a famous Polish mathematician.
        A Sierpinski triangle is created as follows:
        1. Begin with an equilateral triangle, which is considered to be a Sierpinski fractal of order
        (or level) 0, as shown in Figure 18.9a.
        2. Connect the midpoints of the sides of the triangle of order 0 to create a Sierpinski triangle
           of order 1 (see Figure 18.9b).
        3. Leave the center triangle intact. Connect the midpoints of the sides of the three other
           triangles to create a Sierpinski triangle of order 2 (see Figure 18.9c).
        4. You can repeat the same process recursively to create a Sierpinski triangle of order 3,
            4, . . . , and so on (see Figure 18.9d).

            som sagt se figur 18.9

            problemet er i sagns natur rekursivt

            Laver man en rekursiv løsning?

            Base case skal ses hvor orderen er 0

            nemt at tegne en Sierpinski triangle for order af 0

            Hvordan gør man af en order af 1 ?
           kan tegne tre sierpinski trekanter af order 0

           hvordan gør man med order 2?
           kan tegne tre sierpinski trekanter af order 1

           problemet er at tegne en trekant af order n kan bliver reduceret til tegne tre
           trekanter af order n-1

           se side 759

         */
    }
}
