package com.sap.mervyn.designpattern.state.original;

public class Lift implements ILift {
    private int state;

    @Override
    public void setState(int state) {
       this.state = state;
    }

    @Override
    public void open() {
        switch(this.state) {
            case CLOSING_STATE:
            case STOPPING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            case OPENING_STATE:
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void close() {
        switch(this.state) {
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
            case RUNNING_STATE:
            case STOPPING_STATE:
                break;
        }
    }

    @Override
    public void run() {
        switch(this.state) {
            case CLOSING_STATE:
            case STOPPING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case OPENING_STATE:
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void stop() {
        switch(this.state) {
            case RUNNING_STATE:
            case CLOSING_STATE:
                this.stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            case OPENING_STATE:
            case STOPPING_STATE:
                break;
        }
    }


    public void openWithoutLogic() {
        System.out.println("电梯门开启。。。");
    }

    public void closeWithoutLogic() {
        System.out.println("电梯门关闭。。。");
    }

    public void runWithoutLogic() {
        System.out.println("电梯上下运行起来。。。");
    }

    public void stopWithoutLogic() {
        System.out.println("电梯停止了。。。");
    }
}
