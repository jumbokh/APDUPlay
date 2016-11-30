/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.settings;

/**
 *
 * @author Andrej
 */
public class ABDUSettings {
    private String outputDirectory;
    private String rankDir;
    private boolean separatePackets;
    private boolean simpleNodes;
    private int outputTypeMask;
    private int headerLength;
    
    public void setOutputDirectory(String outputDir) {
        outputDirectory = outputDir;
    }
    
    public String getOutputDirectory() {
        return outputDirectory;
    }
    
    public void setSeparatePackets(boolean val) {
        separatePackets = val;
    }
    
    public boolean separatePackets() {
        return separatePackets;
    }
    
    public void setSimpleNodes(boolean val) {
        simpleNodes = val;
    }
    
    public boolean simpleNodes() {
        return simpleNodes;
    }
    
    public void setOutputTypeMask(int mask) {
        outputTypeMask = mask;
    }
    
    public int getOutputTypeMask() {
        return outputTypeMask;
    }
    
    public void setHeaderLength(int length) {
        headerLength = length;
    }
    
    public int getHeaderLength() {
        return headerLength;
    }
    
    public void setRankDir(String val) {
        rankDir = val;
    }
    
    public String getRankDir() {
        return rankDir;
    }
}
