package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALTICE device specifications for Android Compose previews.
 *
 * This extension provides ALTICE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALTICE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALTICE: Any
  get() = object {
      /** DeviceSpec(manufacturer=ALTICE, code=E54, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=E54, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E54 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALTICE, code=E55, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=E55, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val E55 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ALTICE, code=S11, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S11, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val S11 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALTICE, code=S12, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S12, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val S12 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALTICE, code=S22, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S22, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S22 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALTICE, code=S32, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S32, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S32 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALTICE, code=S32_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S32_Plus, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S32_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALTICE, code=S33, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S33, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S33 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALTICE, code=S35, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S35, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val S35 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ALTICE, code=S42, width=540, height=1132, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S42, width=540,
      height=1132, dpi=240, isGoogleDevice=false).code */
      val S42 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALTICE, code=S43, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S43, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val S43 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALTICE, code=S60, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S60, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S60 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALTICE, code=S61, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S61, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S61 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALTICE, code=S64, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S64, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val S64 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALTICE, code=S70, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=S70, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val S70 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ALTICE, code=STARACTIVE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=STARACTIVE, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val STARACTIVE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALTICE, code=STARNAUTE4, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=STARNAUTE4, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val STARNAUTE4 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALTICE, code=STARTRAIL7, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=STARTRAIL7, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val STARTRAIL7 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALTICE, code=STARXTREM5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTICE, code=STARXTREM5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val STARXTREM5 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
