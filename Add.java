public class Add {
    int a;
    int b;

    void getValues(String[] args) {
        /*�߂� int�^�u�v���~�e�B�u�^�v�AInteger�^�́u�N���X�^�v.
        Integer�^�Ȃǂ́u�N���X�^�v�́u���\�b�h�v=�֗��Ȋ֐��������Ă��遫
        �h10���Ƃ���String�^�ϐ���int�^�ɕύX�������ꍇ�ɂ́AInteger�^��parseInt���\�b�h���g���āA
        int �ϐ��� = Integer.parseInt(������);*/
        this.a = Integer.parseInt(args[0]);
        this.b = Integer.parseInt(args[1]);
    }

    void calcAdd(String[] args) {

        getValues(args);
        System.out.println(this.a + " + " + this.b + " = " + (this.a + this.b));
    }
}