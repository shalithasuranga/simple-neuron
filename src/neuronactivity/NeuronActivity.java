/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuronactivity;

/**
 *
 * @author Shalitha Suranga
 */
public class NeuronActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Neuron n = new Neuron(20);
        n.add(10, 2);
        n.add(5, 2);
        n.add(5, 2);
        n.add(5, 2);
        System.out.println("Output is " + n.getOutput());
    }
    
}
