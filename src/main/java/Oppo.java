public class Oppo extends PhoneUser implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Oppo() {
        super(new Phone() {
            public void powerOn() {

            }

            public void volumeUp() {

            }

            public void powerOff() {

            }

            public void volumeDown() {

            }
        });
        this.volume = 0;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        if (!isPowerOn) {
            isPowerOn = true;
            System.out.println("Oppo On");
        } else {
            System.out.println("Oppo is already On");
        }
    }

    @Override
    public void volumeUp() {
        if (volume < maxVolume && volume >= minVolume) {
            volume++;
        } else {
            System.out.println("Volume is already at the Maximum");
        }
    }

    @Override
    public void powerOff() {
        if (isPowerOn) {
            isPowerOn = false;
            System.out.println("Oppo Off");
        } else {
            System.out.println("Oppo is already Off");
        }
    }

    @Override
    public void volumeDown() {
        if (volume <= maxVolume && volume > minVolume) {
            volume--;
        } else {
            System.out.println("Volume is already at the Minimum");
        }
    }

    public int getVolume() {
        return volume;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    @Override
    public void turnOnThePhone() {
        powerOn();
    }

    @Override
    public void turnOffThePhone() {
        powerOff();
    }

    @Override
    public void makePhoneLouder() {
        if (volume >= minVolume && volume < maxVolume) {
            volume = maxVolume;
        } else {
            System.out.println("Phone volume is already at maximum.");
        }
    }

    @Override
    public void makePhoneSilent() {
        if (volume > minVolume && volume <= maxVolume) {
            volume = minVolume;
        } else {
            System.out.println("Phone volume is already at minimum.");
        }
    }
}
