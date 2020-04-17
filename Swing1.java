	public class Swing1 extends JFrame implements ActionListener,ChangeListener{
		ButtonGroup bg;
		JRadioButton rb1,rb2;
		JComboBox cb;
		JButton b;
		final String[] jenis = {"Laki-laki","Perempuan"};
		JMenuBar mb;
		JMenu m;
		
		public Swing1(){
			super("Radio Combo");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container cp = this.getContentPane();
			cp.setLayout(new FlowLayout());
			mb = new JMenuBar();
			mb.add(m=new JMenu("exit"));
			m.addChangeListener((ChangeListener) this);;
			this.setJMenuBar(mb);
			cp.add(rb1 = new JRadioButton("Laki-laki"));
			cp.add(rb2 = new JRadioButton("Perempuan"));
			bg = new ButtonGroup();
			bg.add(rb1);
			bg.add(rb2);
			cp.add(cb =new JComboBox(jenis));
			cp.add(b = new JButton("Simpan"));
			this.setVisible(true);
			b.addActionListener((ActionListener) this);
		}

		public static void main(String args[]){
			new Swing1();
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(arg0.getSource() == b){
				String radio=null;
				if(rb1.isSelected() == true){
					radio = rb1.getText();
				}
				else{
					radio = rb2.getText();
				}
				
				System.out.println("Radio Button Memilih: "+radio);
				String combo = cb.getSelectedItem().toString();
				System.out.println("ComboBox Memilih: "+combo);
			}
		}
	
		@Override
		public void stateChanged(ChangeEvent arg0) {
			// TODO Auto-generated method stub
			if(arg0.getSource() == m){
				System.exit(0);
			}
		}
	}
