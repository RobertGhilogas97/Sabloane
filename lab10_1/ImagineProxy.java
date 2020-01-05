package lab10_1;
import java.util.ArrayList;

public class ImagineProxy implements Element {
		private String nume;
		private Image img;
		public ImagineProxy(String nume) {
			this.nume = nume;
		}
		public void print()
		{
			if(this.img == null) {
				this.img = new Image(this.nume);
			}
			this.img.print();
			
		}
		@Override
		public void accept(Visitor vis) {
			// TODO Auto-generated method stub
			vis.visit(this);
			
		}
		@Override
		public void setNewValue(String newValue) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public Element copy() {
			// TODO Auto-generated method stub
			return null;
		}
}
