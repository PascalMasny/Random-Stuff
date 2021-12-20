PROGRAM GTT(Input, Output);
	VAR a,b: Intiger;
BEGIN:
	ReadLn(a,b);
	WHILE (a > 0) AND (b > 0) DO
		IF a > b THEN
			a := a-b;
		ELSE
			b := b-a;
	IF b=0 THEN 
		WriteLn(a)
	ELSE
		WriteLn(b)
END
