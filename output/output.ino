int ledPinR = 3;int ledPinG = 5;int ledPinB = 6;int joystickYPin = A0;int joystickXPin = A1;int lightSensor = A2;
void loop() {}
float errorMargin=2;void setup() {pinMode(3,OUTPUT);pinMode(5,OUTPUT);pinMode(6,OUTPUT);pinMode(A0,INPUT);pinMode(A1,INPUT);pinMode(A2,INPUT);uid21();}
float uid11(byte *rawData, byte pwmData) {return pwmData-127;}
byte uid13(byte *rawData) {if (*rawData>127+errorMargin) {return *rawData;}if (*rawData<127-errorMargin) {return *rawData;}return 127;}
float uid9(byte rawData) {return uid11(&rawData, uid13(&rawData));}
float uid18() {return uid9(map(analogRead(joystickYPin), 0, 1023, 0, 255));}
float uid19() {return uid9(map(analogRead(joystickXPin), 0, 1023, 0, 255));}
byte uid20() {return map(analogRead(lightSensor), 0, 1023, 0, 255);}
bool uid45WhileWait(int delayTime) {unsigned long startTime = millis();while (millis() < startTime+delayTime) {if (!uid45()) {return true;}}return false;}void uid26(byte *currentRBir, byte *currentBBir) {float valY=uid18();float valX=uid19();if (valY!=0) {*currentRBir=uid36(currentRBir, currentBBir, valY, *currentRBir);analogWrite(ledPinR,*currentRBir);delay(5);}if (valX!=0) {*currentBBir=uid36(currentRBir, currentBBir, valX, *currentBBir);analogWrite(ledPinB,*currentBBir);delay(5);}if (uid45()) {uid35(currentRBir, currentBBir);uid45WhileWait(2000);}else {digitalWrite(ledPinG,LOW);}}
void uid35(byte *currentRBir, byte *currentBBir) {digitalWrite(ledPinG,!digitalRead(ledPinG));}
float uid36(byte *currentRBir, byte *currentBBir, float val, float bir) {if (val>0) {if (bir<254) {return bir+1;}}else {if (bir>0) {return bir-1;}}return bir;}
void uid21() {byte currentRBir=0;byte currentBBir=0;while (true) {uid26(&currentRBir, &currentBBir);}}
bool uid45() {return uid20()>200;}
