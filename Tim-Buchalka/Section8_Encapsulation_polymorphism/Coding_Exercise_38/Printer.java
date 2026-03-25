package Section8_Encapsulation_polymorphism.Coding_Exercise_38;

public class Printer {
     private int tonerLevel;
     private int pagesPrinted;
     private boolean duplex;

     public Printer(int tonerLevel, boolean duplex) {
          if (tonerLevel > -1 && tonerLevel <= 100)
               this.tonerLevel = tonerLevel;
          else
               this.tonerLevel = -1;
          this.pagesPrinted = 0;
          this.duplex = duplex;
     }

     public int addToner(int tonerAmount) {
          if (tonerAmount > -1 && tonerAmount <= 100)
               if (tonerAmount + this.tonerLevel > 100)
                    return -1;
          this.tonerLevel += tonerAmount;
          return this.tonerLevel;

     }

     public int printPages(int pages) {
          int pagesToPrint = pages;
          if (this.duplex == true) {
               pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
               System.out.println("Printing in duplex mode");
          }
          pagesPrinted += pagesToPrint;
          return pagesToPrint;
     }

     public int getPagesPrinted() {
          return pagesPrinted;
     }
}
