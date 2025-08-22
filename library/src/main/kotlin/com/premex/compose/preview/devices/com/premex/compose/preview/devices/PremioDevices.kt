package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Premio device specifications for Android Compose previews.
 *
 * This extension provides Premio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Premio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Premio: Any
  get() = object {
      /** DeviceSpec(manufacturer=Premio, code=HMR5510, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=HMR5510, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val HMR5510 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Premio, code=Premio, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=Premio, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PREMIO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Premio, code=Premio_P420, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=Premio_P420,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val PREMIO_P420 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Premio, code=S54, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=S54, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val S54 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Premio, code=S55, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=S55, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S55 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Premio, code=S56, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=S56, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val S56 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Premio, code=S57, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=S57, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S57 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Premio, code=S75, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=S75, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val S75 = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Premio, code=S86, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=S86, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S86 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Premio, code=S87, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=S87, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val S87 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Premio, code=S94, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=S94, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val S94 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Premio, code=X70-2021, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=X70-2021, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val X70_2021 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Premio, code=X75-2021, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=X75-2021, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val X75_2021 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Premio, code=X80, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=X80, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val X80 = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Premio, code=X81, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=X81, width=600,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val X81 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Premio, code=X83, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=X83, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val X83 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Premio, code=X84, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=X84, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val X84 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Premio, code=X85, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=X85, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val X85 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Premio, code=X85_PRO, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=X85_PRO, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val X85_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Premio, code=X86, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=X86, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val X86 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Premio, code=X91, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=X91, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X91 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Premio, code=186HS1080233, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Premio, code=186HS1080233,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val _186HS1080233 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
