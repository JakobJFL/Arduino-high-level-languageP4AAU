
void loop() {}
void setup() {}
void uid2(float param4) {
  param4 = 5;
}
void uid7(float *param1, float *param2, float param3) {
  *param1 = 0;
  param3 = 0;
  uid7(param1, param2, 5);
  uid2(5);
}
void uid4(float param1, float param2) {}
