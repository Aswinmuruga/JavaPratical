package collection;
import java.util.*;
public class Set {

	public static void main(String[] args) {
	
		                      //Hash set
                   HashSet hash =new HashSet();
                       hash.add("a");
                       hash.add("b");
                       hash.add("c");
                       hash.add("g");
                Iterator tamil=hash.iterator();
               System.out.println("the Hashset :"+tamil);
                 while (tamil.hasNext()) {
	           System.out.println(tamil.next());
                          }
	



                           //TreeSet
             TreeSet<String> rock=new TreeSet<String>();
                      rock.add("jody");
                      rock.add("body");
                      rock.add("tody");
                      rock.add("laody");
                   Iterator ram=rock.iterator();
                    while(ram.hasNext()) {
	                System.out.println(ram.next().toString());
                       }
                    //SortedSet
              SortedSet<String> tamli=new TreeSet<String>();//arrange in oder a-z
                    tamli.add("a");
                    tamli.add("b");
                    tamli.add("t");
                    tamli.add("l");
	}}
