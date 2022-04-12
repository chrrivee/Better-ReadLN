@file:Suppress("NAME_SHADOWING")

fun _readLineStr(text:String, specialFn:String?, saverOrignalInput:Boolean): Any?
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
    /*
        --------------------------------------------------------------
        GET-LENGTH ENDS && PLUS STR STARTS!
        --------------------------------------------------------------
    */
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
        --------------------------------------------------------------
        PLUS-STR ENDS && CONVERT-TO STARTS!
        --------------------------------------------------------------
    */
    if(specialFn.equals("convertTo")){
        println(text)
        val varName = readln()
        println("what data Type to convert input to?: ")
        val dataToChangeTo = readln()
        var finalVarName = 0
        /*
            ConvertTO >int< | changes said input to >int< datatype
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
        /*
        ConvertTO >char< | changes said input to >char< datatype
        */
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
        /*
        ConvertTO >double< | changes said input to >double< datatype
        */
        if(dataToChangeTo.equals("double",ignoreCase = true))
        {
            try
            {
                if(varName.contains(".")){
                    returnArray[0] = varName.toDouble()
                    if(saverOrignalInput) {
                        returnArray[1] = varName
                        return returnArray.joinToString<Any?>()
                    }
                    return varName.toDouble()
                }
                else
                {
                    println("try using 'int' instead its faster and more efficient!")
                    returnArray[0] = varName.toDouble()
                    if(saverOrignalInput) {
                        returnArray[1] = varName
                        return returnArray.joinToString<Any?>()
                    }
                    return varName.toDouble()
                }
            }
            catch (e: NumberFormatException)
            {
                if(varName.contains(" ")){
                    println("ERROR> decimal value contains a space")
                }
                else
                {
                    println("NumFormatExp > Said Value contains a non number char.")
                }
            }
        }
    }
    /*
        --------------------------------------------------------------
        CONVERT TO ENDS && ADD IN ARRAY STARTS!
        --------------------------------------------------------------
    */
    if(specialFn.equals("addToArray", ignoreCase = true))
    {
        println(" Do you want to make an array with elements given by you?")
        val makeNew = readln()
        if(makeNew.equals("true", ignoreCase = true))
        {
            println("Choose the type of data type to create array with")
            val arrayDT = readln()
            println("give amount of values in array")
            val elementsInArray = readln()

            /*
            Creating an array with the DT of int
            */

            if(arrayDT.equals("int",ignoreCase = true))
            {
                try
                {
                    val finalArrayElms = elementsInArray.toInt()
                    val baseArray: IntArray = IntArray(finalArrayElms)
                    /*
                    make a for loop for input and blah blah
                    */
                }
                catch (e: NumberFormatException)
                {
                    if(elementsInArray.contains(" ")){
                        println("NumFormExp > the value contains a space and may also contain an alphabet.")
                    }
                    else{
                        println("NumFormExp > the value contains invalid characters(valid char != Alphabets, symbols)")
                    }
                }

            }
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
