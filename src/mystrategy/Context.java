/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;
import sort.methods.ISortStrategy; 
import sort.strategy.Stopwatch;

/**
 *
 * @author karol
 */
public class Context {
    private ISortStrategy strategy;
 
    public Context(ISortStrategy strategy) {
        this.strategy = strategy;
    }
 
    public double Sort(double[] arr) {
        
        Stopwatch a = new Stopwatch();
        strategy.Sort(arr);
        return a.elapsedTime();
    }
    
}
