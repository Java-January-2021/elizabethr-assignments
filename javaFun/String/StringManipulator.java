public class StringManipulator{

        public String trimAndConcat(String value, String value1 )
    {
        value=value.trim();
        value1=value1.trim();
        String newvalue=(value+value1).trim();
        return newvalue;
    }

    public Integer getIndexOrNull(String value, char M)
    {
        Integer value1=value.indexOf(M);
        if (value1<0)
        {
            return null;
        }
        return value1;
    }

    public Integer getIndexOrNull(String value, String value1)
    {
        Integer value2=value.indexOf(value1.toCharArray()[0]);
        if (value2<0)
        {
            return null;
        }
        return value2;
    
    }

    public String Concat(String value,int index1, int index2, String value1 )
    {
        String newvalue=value.substring(index1, index2);
        System.out.println("newvalue" + newvalue);
        return newvalue.concat(value1);
    }

}

