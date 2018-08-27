package io;

import bean.Edge;
import bean.Graph;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author PouriaM
 * With Nahal Bargi's help.
 */
public class ReadFile {
    private BufferedReader br;
    public ReadFile(String path){
        try { 
            File file = new File(path);
            this.br = new BufferedReader(new FileReader(file));
        }catch(Exception  e){
            System.err.println(e);
        }
    }
    public Graph makeGraph(){
        try{
            String line;
            String[] weights = new String[0];
            int i = 0;
            ArrayList<Edge> edges = new ArrayList<>();
            while ((line = this.br.readLine()) != null) {
                i++;
                weights = line.split("\\s+");
                for(int j=0; j< weights.length; j++){
                    // we have weighths.length nodes.
                    double weight = -(Math.log(Double.parseDouble(weights[j]))/Math.log(2));
                    Edge eg = new Edge(i, j+1, weight);
                    edges.add(eg);
                }
            }
            return new Graph(edges, weights.length);
        }catch(Exception e){
            System.err.println(e);
            return null;
        }
    }
}
