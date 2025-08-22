package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALIGATOR device specifications for Android Compose previews.
 *
 * This extension provides ALIGATOR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALIGATOR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALIGATOR: Any
  get() = object {
      /** DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_RX550, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_RX550,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ALIGATOR_RX550 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_RX710, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_RX710,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ALIGATOR_RX710 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_RX800, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_RX800,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ALIGATOR_RX800 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_S5070, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_S5070,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ALIGATOR_S5070 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_S5520, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_S5520,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ALIGATOR_S5520 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_S5540, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_S5540,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ALIGATOR_S5540 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_S6000, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_S6000,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ALIGATOR_S6000 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_S6500, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALIGATOR, code=ALIGATOR_S6500,
      width=540, height=1200, dpi=240, isGoogleDevice=false).code */
      val ALIGATOR_S6500 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALIGATOR, code=RX850, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALIGATOR, code=RX850, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val RX850 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALIGATOR, code=S5710, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALIGATOR, code=S5710, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S5710 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
