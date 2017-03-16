/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package githubrebasetest;

/**
 * 
 * @author KhueTLA
 */
public class Merging {
    private String branch;
    private String master;

    public Merging() {
    }

    public Merging(String branch, String master) {
        this.branch = branch;
        this.master = master;
    }
    
    public boolean gitMerge() {
        System.out.println("git merge");
        if (this.branch != null) {
            return true;
        }
        return false;
    }
}
