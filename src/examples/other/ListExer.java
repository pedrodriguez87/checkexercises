package examples.other;

import java.util.* ;

class ListExer
{

    public static void main ( String[] args) {


        List<String> names = new ArrayList<>();

        names.add("Car");
        names.add("Pedro");
        names.add("Dan");
        names.add("Juan");

        String name = names.get(0);

        int i = 0;

        while (name.length() < 4) {
            name = names.get(i);
            System.out.println(name);
            i++;


        }


    }




    }







