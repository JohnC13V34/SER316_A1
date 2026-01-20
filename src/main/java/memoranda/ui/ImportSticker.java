package memoranda.ui;

import javax.swing.JOptionPane;

import memoranda.util.Local;

public class ImportSticker {

String name;        
        
        public ImportSticker(String x) {
                name = x;
        }

        public boolean import_file(){
                /*
                 We are working on this =)
                  
                  
                  */
                //Language changed-- Charles Watari
                JOptionPane.showMessageDialog(null,Local.getString("We are not yet able to import your document."));
                return true;
        }
        
        
}