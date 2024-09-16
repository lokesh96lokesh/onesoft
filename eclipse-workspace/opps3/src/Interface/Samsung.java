package Interface;

public class Samsung implements SmartPhone {
	public String voiceCall(String clear) {
		return clear;
	}
	public  String videoCall(String clear) {
		return clear;
	}
	public String cameraFunction() {
		String cameraFunction="SingleTap";
		if(cameraFunction.equalsIgnoreCase("SingleTap")) {
			
			return "takinPicture";
		}
		else if(cameraFunction.equalsIgnoreCase("DoubleTap")) {
			return "Zooming";
		}
		else if(cameraFunction.equalsIgnoreCase("TribleTap")) {
			return "ScreenShot";
		}
		else {
			return "defalt";
		}
	}
	@Override
	public String voiceCall() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String videoCall() {
		// TODO Auto-generated method stub
		return null;
	}

}
