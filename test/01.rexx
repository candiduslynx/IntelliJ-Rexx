/* REXX */
/* some sort of comment */
/* %include somemod */

mainpgm:
    parse upper arg input, setting ;
    if length(input) > 12 then
        say "too long: <" || input || '> is longer that 12 characters!'
    else do
        parse var input i1 i2 i3
        i1 = strip(i1)
        i2 = strip(i2)
        i3 = strip(i3)
        if i3 = '' then
            i3 = .SIGL
        while (i1 > i2) do
            i1 = i1 + length(i3)
            say i1
        end
    end
return 0