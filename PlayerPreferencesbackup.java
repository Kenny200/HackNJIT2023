package akinator;
class PlayerPreferences {
        private int playingTime;
        private String favoriteGame;
        
        private String favoriteGamemodeCOD;
        private String MKmainfighter;
        private String mKiscompetative;
        private String EAfavoriteteam; 
        private String CODfavoritechar;
        private String EAfavoriteplayer;


        public void setPlayingTime(int playingTime) {
            this.playingTime = playingTime;
        }

        public boolean getMKiscompetative() {
			
			return false;
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

        public void setFavoriteGamemodeCOD(String favoriteGamemodeCOD) {
            this.favoriteGamemodeCOD = favoriteGamemodeCOD;
        }

        public String getFavoriteGamemodeCOD() {
            return favoriteGamemodeCOD;
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

		public void setCODfavoritechar(String CODfavoritechar) {
	        this.CODfavoritechar = CODfavoritechar;
	    }

	    public String getCODfavoritechar() {
	        return CODfavoritechar;
	    }

		public String getEAfavoriteplayer() {
			return EAfavoriteplayer;
		}

		public void setEAfavoriteplayer(String eAfavoriteplayer) {
			this.EAfavoriteplayer = eAfavoriteplayer;
		}

		public String getmKiscompetative() {
			return mKiscompetative;
		}

		public void setmKiscompetative(String mKiscompetative) {
			this.mKiscompetative = mKiscompetative;
		}
    }
