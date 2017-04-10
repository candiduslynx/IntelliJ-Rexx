/* REXX */
/* Single-line comment */
/* Multi-line
 * comment
 */

/* %include statement */

label:
  parse upper arg input_, setting ;
  constant = 1const
  special = sigl
  strWithHex = "40"x"This is actually another string"
  strWithBin = "101010"b

  if length(input_) > 12 then
    say "too long: <" || input_ || '> is longer than 12 characters!'
  else do
    parse var input_ i1 i2 i3 .
    i1 = strip(i1)
    i2 = strip(i2)
    i3 = strip(i3)
    if i3 = '' then
      i3 = SIGL
    do while (i1 > i2)
      i1 = i1 + length(i3) + , /*<--continuation*/
                 15
      say i1
    end
  end
return 0
