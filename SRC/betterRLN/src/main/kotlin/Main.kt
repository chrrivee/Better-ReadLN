fun _readLineStr(text:String, specialFn:String, saverOrignalInput:Boolean):Any
{
    val varName:String = ""
    val returnArray = arrayOf(1, "")

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
fun main()
{
    val saveVar = _readLineStr("LoremIpsum","",false)
}
