class BaseBall {
    public int calPoints(String[] operations) {
        int[] stack = new int[operations.length];
        int top = -1;

        for (String op : operations) {
            if (op.equals("C")) {
                top--;
            } 
            else if (op.equals("D")) {
                stack[top + 1] = 2 * stack[top];
                top++;
            } 
            else if (op.equals("+")) {
                stack[top + 1] = stack[top] + stack[top - 1];
                top++;
            } 
            else {
                stack[++top] = Integer.parseInt(op);
            }
        }

        int sum = 0;

        for (int i = 0; i <= top; i++) {
            sum += stack[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        BaseBall obj = new BaseBall();
        String[] operations = {"5", "2", "C", "D", "+"};
        int result = obj.calPoints(operations);
        System.out.println("Total points: " + result);
    }
}