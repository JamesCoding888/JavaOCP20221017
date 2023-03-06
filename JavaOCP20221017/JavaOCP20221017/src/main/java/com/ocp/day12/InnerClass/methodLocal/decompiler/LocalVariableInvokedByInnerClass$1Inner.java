package com.ocp.day12.InnerClass.methodLocal.decompiler;

class LocalVariableInvokedByInnerClass$1Inner {
   String name;
   // $FF: synthetic field
   final LocalVariableInvokedByInnerClass this$0;
   // $FF: synthetic field
   private final String val$number;

   LocalVariableInvokedByInnerClass$1Inner(LocalVariableInvokedByInnerClass var1, String var2) {
      this.this$0 = var1;
      this.val$number = var2;
      this.name = "Java SE";
   }

   public String toString() {
      return this.this$0.id + ", " + this.name + ", " + this.val$number;
   }
}
