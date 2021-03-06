<h1>Clock Tower Bell Counter<h1>

<p>
<h3>User Story</h3>
<p>As a clock enthusiast, I want to know how many times a clock tower will ring its bell between two
given times so that I can plan to sing along.</p>
</p>

<p>
<h3>Background</h3>
<p>A clock tower will ring its bell every hour, on the hour, a number of times equal to the number
indicated by the hours hand.</p>
<p><b>Example</b></p>
<p>At 3pm, the clock tower will ring the bell three times. At midnight, it will ring the bell 12 times.</p>
</p>

<p>
<h3>Technical Specification</h3>
<p>Write a class with a method called "countBells" that will accept a start time and end time. Both
times will be in twenty-four hour notation, such as 12:00 for noon and 15:30 for half-past three in
the afternoon.</p>
<p>Your function should return a integer representing the number of times the clock tower will ring its
bell between the two provided times.</p>
<p><b>Notes</b></p>
<p>1. If either time is on the hour (ex. 14:00) then you should count the bell rings that would occur at
that hour.
<br>
2. If both times are equal, treat it as if twenty-four hours will pass and not that the two times are
the same time on the same day.</p>
</p>

<p>
<h3>Test Cases</h3>
<p>
1. <b>INPUT</b> $startTime = '2:00'; $endTime = '3:00'; <b>OUTPUT</b> 5 <br>
2. <b>INPUT</b> $startTime = '14:00'; $endTime = '15:00'; <b>OUTPUT</b> 5 <br>
3. <b>INPUT</b> $startTime = '14:23'; $endTime = '15:42'; <b>OUTPUT</b> 3 <br>
4. <b>INPUT</b> $startTime = '23:00'; $endTime = '1:00'; <b>OUTPUT</b> 24 <br>
</p>
</p>
