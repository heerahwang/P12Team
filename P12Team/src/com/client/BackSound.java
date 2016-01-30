/*package com.sist;

import java.io.*;  
import java.awt.*;  
import javax.sound.midi.*;
  

class BackSound  
{  
    private Sequencer sequencer = null;   
    private Sequence sequence = null;  
      
    BackSound()   
    {  
        try   
        {  
            sequence  = MidiSystem.getSequence(new File("sound/1.mid"));  
            sequencer = MidiSystem.getSequencer();   
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);   
            sequencer.open();
            sequencer.setSequence(sequence);  
            sequencer.start();  
        }   
        catch (Exception e)   
        {  
            System.out.println(e);  
        }  
    }  
}  */