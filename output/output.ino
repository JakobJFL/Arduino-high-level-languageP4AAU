int led = 5;int sensor = A0;int tempSensor = A1;
void loop() {}
byte uid5() {return uid6();}
void uid7() {byte counter=0;uid9(&counter);}
bool uid16() {byte outputValue=map(analogRead(sensor), 0, 1023, 0, 255);if (outputValue>128) {return false;}return true;}
void setup() {pinMode(5,OUTPUT);pinMode(A0,INPUT);pinMode(A1,INPUT);uid7(&counter, &outputValue);}
byte uid6() {return map(analogRead(tempSensor), 0, 1023, 0, 255);}
bool uid16WhileWait(int delayTime) {unsigned long startTime = millis();while (millis() < startTime+delayTime) {if (!uid16()) {return true;}}return false;}void uid15(byte *counter) {counter=counter+1;uid9(&countercounter);}
void uid14(byte *counter) {digitalWrite(led,!digitalRead(led));uid9(&countercounter);}
void uid9(byte *counter) {if (uid5(&countercounter)>40) {uid16WhileWait(1000);uid14(&countercounter);}if (uid5(&countercounter)>60) {uid16WhileWait(10);uid15(&countercounter);}}
