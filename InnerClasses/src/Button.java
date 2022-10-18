public class Button {
    private String name;
    private onClickListener onClickListener;

    public Button(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOnClickListener(onClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.name);
    }

    public interface onClickListener {
        void onClick(String name);
    }
}
