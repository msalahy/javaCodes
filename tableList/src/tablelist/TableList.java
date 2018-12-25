
package tablelist;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableList {
    static JFrame frame = new JFrame ("JTable sample");
    static JTable table;
    
    public static void main(String[] args) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String [] columnTitle = {"ID", "First Name", "Last Name", "Salary"}; 
        String [][] rowData=
        {
            {"101", "John", "Smith", "980000"}, 
            {"102", "Mohammad", "Lalay", "770000"},
            {"103", "Ahmad", "Sara", "550000"}, 
            {"104", "Mustafa", "Wali", "80000"},  
        };
        table = new JTable (rowData, columnTitle);
        
        table.setRowSelectionAllowed(true);
        ListSelectionModel rs = table.getSelectionModel();
        rs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        rs.addListSelectionListener(new Mohammad());
        
        frame.add(new JScrollPane(table));
        frame.setSize(500, 200);
        frame.setLocation(300, 300);
        frame.setVisible(true);
        }
    public static class Mohammad implements ListSelectionListener
    {
        @Override
        public void valueChanged(ListSelectionEvent lse){
        String SelectedID = null;
        String SelectedFname = null;
        String SelectedLName = null;
        String SelectedSalary=null;
        
        int [] SelectedRow = table.getSelectedRows();
        for (int i=0; i<SelectedRow.length; i++)
        {
        SelectedID = (String) table.getValueAt(SelectedRow[i],0);
        SelectedFname = (String) table.getValueAt(SelectedRow[i],1);
        SelectedLName = (String) table.getValueAt(SelectedRow[i],2);
        SelectedSalary = (String) table.getValueAt(SelectedRow[i],3);
        }
        StringBuilder sb = new StringBuilder();
         sb.append("Employee INFO "+"\n");
           sb.append("================ "+"\n\n");
           sb.append(SelectedID+"\n");
           sb.append(SelectedFname+"\n");
           sb.append(SelectedLName+"\n");
           sb.append(SelectedSalary+"\n");
           
           JOptionPane.showMessageDialog(frame, sb.toString(), "Recond Selected", JOptionPane.INFORMATION_MESSAGE);
                   
        }
    }
    }
    
    
