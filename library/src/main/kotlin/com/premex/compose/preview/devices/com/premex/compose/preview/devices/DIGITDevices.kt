package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIGIT device specifications for Android Compose previews.
 *
 * This extension provides DIGIT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIGIT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIGIT: Any
  get() = object {
      /** DeviceSpec(manufacturer=DIGIT, code=Digit_Glory1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGIT, code=Digit_Glory1,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val DIGIT_GLORY1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGIT, code=DIGIT_INFINITY, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGIT, code=DIGIT_INFINITY,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val DIGIT_INFINITY = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGIT, code=DIGIT_INFINITY_MAX, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGIT, code=DIGIT_INFINITY_MAX,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val DIGIT_INFINITY_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGIT, code=NOTE_14, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGIT, code=NOTE_14, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOTE_14 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGIT, code=NOTE_20, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGIT, code=NOTE_20, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val NOTE_20 = "spec:width=720,height=1612,unit=px,dpi=280"

  }
