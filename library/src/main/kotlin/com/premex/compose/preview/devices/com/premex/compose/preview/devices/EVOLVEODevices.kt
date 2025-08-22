package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVOLVEO device specifications for Android Compose previews.
 *
 * This extension provides EVOLVEO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EVOLVEO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EVOLVEO: Any
  get() = object {
      /** DeviceSpec(manufacturer=EVOLVEO, code=EVOLVEOG2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVOLVEO, code=EVOLVEOG2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EVOLVEOG2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVOLVEO, code=EVOLVEOG4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVOLVEO, code=EVOLVEOG4, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EVOLVEOG4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVOLVEO, code=EVOLVEOG8, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVOLVEO, code=EVOLVEOG8, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EVOLVEOG8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVOLVEO, code=StrongPhoneG5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVOLVEO, code=StrongPhoneG5,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val STRONGPHONEG5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVOLVEO, code=StrongPhone_G7, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVOLVEO, code=StrongPhone_G7,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val STRONGPHONE_G7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EVOLVEO, code=StrongPhone_G9, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EVOLVEO, code=StrongPhone_G9,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val STRONGPHONE_G9 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
