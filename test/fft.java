
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.TransformType;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leo
 */
public class fft {

    public static void main(String[] args) {
        double[] transform = transform();
        for (int i = 0; i < transform.length; i++) {
            System.out.println(transform[i]);
        }
    }

    private static double[] transform() {
        double[] input = new double[8];
        input[0] = 0.0;
        input[1] = 162.6345596729059;
        input[2] = 230.0;
        input[3] = 162.63455967290594;
        input[4] = 2.8166876380389125E-14;
        input[5] = -162.6345596729059;
        input[6] = -230.0;
        input[7] = -162.63455967290597;

        double[] tempConversion = new double[input.length];

        FastFourierTransformer transformer = new FastFourierTransformer(DftNormalization.STANDARD);
        try {
            Complex[] complx = transformer.transform(input, TransformType.FORWARD);
            Complex[] complx2 = transformer.transform(complx, TransformType.INVERSE);

            for (int i = 0; i < complx.length; i++) {
                System.out.println(complx[i]);
                double rr = (complx[i].getReal());
                double ri = (complx[i].getImaginary());

                tempConversion[i] = Math.sqrt((rr * rr) + (ri * ri));
            }
            System.out.println("");
            for (int i = 0; i < complx2.length; i++) {
                System.out.println(complx2[i]);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        return tempConversion;
    }
}
