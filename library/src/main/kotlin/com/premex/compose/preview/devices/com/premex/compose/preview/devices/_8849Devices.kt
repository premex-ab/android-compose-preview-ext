package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * 8849 device specifications for Android Compose previews.
 *
 * This extension provides 8849 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._8849.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._8849: Any
  get() = object {
      /** DeviceSpec(manufacturer=8849, code=OB-A98, width=1440, height=3200, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=8849, code=OB-A98, width=1440,
      height=3200, dpi=560, isGoogleDevice=false).code */
      val OB_A98 = "spec:width=1440,height=3200,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=8849, code=OB-P08, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=8849, code=OB-P08, width=1200,
      height=1920, dpi=260, isGoogleDevice=false).code */
      val OB_P08 = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=8849, code=OB-P10, width=1200, height=1920, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=8849, code=OB-P10, width=1200,
      height=1920, dpi=260, isGoogleDevice=false).code */
      val OB_P10 = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=8849, code=TANK2, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=8849, code=TANK2, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TANK2 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=8849, code=TANK2PRO, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=8849, code=TANK2PRO, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TANK2PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=8849, code=TANK3, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=8849, code=TANK3, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TANK3 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=8849, code=TANK_MINI_1, width=540, height=1200, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=8849, code=TANK_MINI_1, width=540,
      height=1200, dpi=260, isGoogleDevice=false).code */
      val TANK_MINI_1 = "spec:width=540,height=1200,unit=px,dpi=260"

  }
