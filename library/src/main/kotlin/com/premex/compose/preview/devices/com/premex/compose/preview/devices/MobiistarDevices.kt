package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mobiistar device specifications for Android Compose previews.
 *
 * This extension provides mobiistar device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobiistar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobiistar: Any
  get() = object {
      /** DeviceSpec(manufacturer=mobiistar, code=C1_Lite, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar, code=C1_Lite, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C1_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=mobiistar, code=E1_Selfie, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar, code=E1_Selfie,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val E1_SELFIE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mobiistar, code=mobiistar_C1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar, code=mobiistar_C1,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MOBIISTAR_C1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=mobiistar, code=mobiistar_C1_Shine, width=480, height=960,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar,
      code=mobiistar_C1_Shine, width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MOBIISTAR_C1_SHINE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=mobiistar, code=mobiistar_C2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar, code=mobiistar_C2,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MOBIISTAR_C2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=mobiistar, code=mobiistar_E_Selfie, width=720, height=1440,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar,
      code=mobiistar_E_Selfie, width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val MOBIISTAR_E_SELFIE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mobiistar, code=mobiistar_X, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar, code=mobiistar_X,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val MOBIISTAR_X = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mobiistar, code=Mobiistar_Zumbo_J2, width=720, height=1280,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar,
      code=Mobiistar_Zumbo_J2, width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val MOBIISTAR_ZUMBO_J2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mobiistar, code=X1_Dual, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar, code=X1_Dual, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X1_DUAL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mobiistar, code=X1_Notch, width=720, height=1498, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar, code=X1_Notch,
      width=720, height=1498, dpi=320, isGoogleDevice=false).code */
      val X1_NOTCH = "spec:width=720,height=1498,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mobiistar, code=X1_Selfie, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar, code=X1_Selfie,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val X1_SELFIE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mobiistar, code=XQ_Dual, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar, code=XQ_Dual,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val XQ_DUAL = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=mobiistar, code=Zumbo_S_2017_Lite, width=720, height=1280,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobiistar,
      code=Zumbo_S_2017_Lite, width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ZUMBO_S_2017_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

  }
