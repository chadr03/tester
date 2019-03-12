/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc2582.bet.triggers;

import edu.wpi.first.wpilibj.buttons.Button;

public class NegaButton extends Button {

    private final Button button;

    public NegaButton(Button button) {
        this.button = button;
    }

    public boolean get() {
        return !button.get();
    }
}
