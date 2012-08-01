class Box{
	double width, height, depth;
	
	Box(Box ob){
		System.out.println("Constructor in Box");
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	Box(double w, double h, double d){ 
		System.out.println("Constructor in Box");
		width = w;
		height = h;
		depth = d;
	}
	Box(){
		System.out.println("Constructor in Box");
		width = -1;
		height = -1;
		depth = -1;
	}
	Box(double len){
		width = height = depth = len;
		System.out.println("Constructor in Box");
	}
	double volume(){
		return height * width * depth;
	}
}