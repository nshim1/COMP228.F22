import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String genreInput= JOptionPane.showInputDialog("What kind of Genre you are looking for?" + "\n 1) Science \n 2) Children");
        //Create instance variable of the different kind of book respectively with the user input
        if (genreInput == "1") {
            Book book1 = new ScienceBook(JOptionPane.showInputDialog("Title:"),
                    JOptionPane.showInputDialog("ISBN number:"),
                    JOptionPane.showInputDialog("Publisher: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Price of the book: ")),
                    Integer.parseInt(JOptionPane.showInputDialog("Released year: ")));
            JOptionPane.showMessageDialog(null,book1.toString());
        }else if(genreInput == "2"){
            Book book2 = new ChildrenBook(JOptionPane.showInputDialog("Title:"),
                    JOptionPane.showInputDialog("ISBN number:"),
                    JOptionPane.showInputDialog("Publisher: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Price of the book: ")),
                    Integer.parseInt(JOptionPane.showInputDialog("Released year: ")));
            JOptionPane.showMessageDialog(null,book2.toString());
        }


    }
}
