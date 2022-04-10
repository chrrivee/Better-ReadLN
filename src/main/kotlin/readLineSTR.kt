
fun _readLineStr(text:String, specialFn:String?, saverOrignalInput:Boolean):Any
{
    val varName:String = ""
    val returnArray = arrayOf(1, "")

    if(specialFn == null) {
        println(text)
        if (saverOrignalInput) {
            returnArray[0] = varName
            return returnArray[0]
        } else {
            return "readLineSTR.kt > can't pass down null. at least one value should be != null(specialFn = null, SaveOrignal = false) one vale should be updated. "
        }
    }
    if(specialFn.equals("getLength", ignoreCase = true))
    {
        println(text)
        val varName = readln()
        if (saverOrignalInput)
        {
            returnArray[0] = varName.length
            returnArray[1] = varName
            return returnArray.joinToString<Any>()
        }
        else
        {
            return varName.length
        }
    }
    if(specialFn.equals("plusStr", ignoreCase = true))
    {
        println(text)
        val varName = readln()
        println("What *STRING* to add to the previous input?: ")
        val strToAdd:String = readln()
        val finalStr:String = varName.plus(strToAdd)

        if(saverOrignalInput)
        {
            returnArray[0] = finalStr
            returnArray[1] = varName
            return returnArray.joinToString<Any>()
        }
        else
        {
            return finalStr
        }
    }
    /*
    Convert to Function | Converts Input to x data type.
     */
    if(specialFn.equals("convertTo")){
        println(text)
        val varName = readln()
        println("what data Type to convert input to?: ")
        val dataToChangeTo = readln()
        var finalVarName = 0
        /*
            Int | Saves Variable in the Int Datatype
        */
        if(dataToChangeTo.equals("int", ignoreCase = true)) {
            try
            {
                finalVarName = varName.toInt()

                if(saverOrignalInput)
                {
                    returnArray[0] = finalVarName
                    returnArray[1] = varName
                    return returnArray.joinToString<Any>()
                }
                else
                {
                    return varName
                }
            }
            catch (e: NumberFormatException)
            {
                if(varName.contains("."))
                {
                    println("Cant Convert Decimal Values to int try float or doubles depending on you're use case")
                }
                else
                {
                    println("Can't Convert Characters(a,b,c,d etc) to integers.")
                }
            }
        }
        if(dataToChangeTo.equals("char",ignoreCase = true))
        {
            var varNameLen = varName.length
            if(varNameLen > 1){
                println("Cant Change given value to char as the length is > 1")
            }
            else {
                if(varNameLen < 1){
                    println("Cant Change given value to char as the length is < 1")
                }
                if(varNameLen == 1) {
                    val finalVarName: Char = varName.first()
                    if (saverOrignalInput)
                    {
                        returnArray[0] = finalVarName
                        returnArray[1] = varName
                        return returnArray.joinToString<Any>()
                    }
                    else
                    {
                        return finalVarName
                    }
                }
            }
        }
        if(dataToChangeTo.equals("double",ignoreCase = true))
        {
            varName.toDouble()
        }
    }

    return varName
}

//Will get to readLineInt Soon currently working on Str
/*
fun _readLineInt(text:String, specialFn:String): String
{
    val varName: String = ""
    if (specialFn.equals("String", ignoreCase = true))
    {
        println(text)
        val varName = readln()
        return varName
    }
    return varName
}

*/
fun main() {

}