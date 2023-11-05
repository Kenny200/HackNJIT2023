package akinator;
class PlayerPreferences  {
		        private int playingTime;
		        private String favoriteGame;
		        
		        private String favoriteGamemodeCOD;
		        private String MKmainfighter; 
		        private String EAfavoriteteam; 
		        private String CODfavoritechar;
		        private String EAfavoriteplayer;
		        
		        private boolean MKiscompetative;

		        public void setPlayingTime(int playingTime2) {
		            this.playingTime = playingTime2;
		        }

		        public int getPlayingTime() {
		            return playingTime;
		        }

		        public void setFavoriteGame(String favoriteGame) {
		            this.favoriteGame = favoriteGame;
		        }

		        public String getFavoriteGame() {
		            return favoriteGame;
		        }

				public String getFavoriteGamemodeCOD() {
					return favoriteGamemodeCOD;
				}

				public void setFavoriteGamemodeCOD(String favoriteGamemodeCOD) {
					this.favoriteGamemodeCOD = favoriteGamemodeCOD;
				}

				public String getMKmainfighter() {
					return MKmainfighter;
				}

				public void setMKmainfighter(String mKmainfighter) {
					this.MKmainfighter = mKmainfighter;
				}

				public String getEAfavoriteteam() {
					return EAfavoriteteam;
				}

				public void setEAfavoriteteam(String eAfavoriteteam) {
					this.EAfavoriteteam = eAfavoriteteam;
				}

				public String getCODfavoritechar() {
					return CODfavoritechar;
				}

				public void setCODfavoritechar(String CODfavoritechar) {
					this.CODfavoritechar = CODfavoritechar;
				}

				public String getEAfavoriteplayer() {
					return EAfavoriteplayer;
				}

				public void setEAfavoriteplayer(String eAfavoriteplayer) {
					this.EAfavoriteplayer = eAfavoriteplayer;
				}

				public boolean getMKiscompetative() {
					return MKiscompetative;
				}

				public void setMKiscompetative(boolean mKiscompetative) {
					this.MKiscompetative = mKiscompetative;
				}

}