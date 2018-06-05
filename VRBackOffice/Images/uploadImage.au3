if $CmdLine[2] = "Chrome" Then
   ControlFocus("Open","","Edit1")
   Sleep(3000)
   ControlSetText("Open","","Edit1" ,$CmdLine[1] )
   Sleep(3000)
   ControlClick("Open","","Button1" )
   Sleep(3000)
Else
   ControlFocus("File Upload","","Edit1")
   Sleep(3000)
   ControlSetText("File Upload","","Edit1" ,$CmdLine[1] )
   Sleep(3000)
   ControlClick("File Upload","","Button1" )
   Sleep(3000)
EndIf