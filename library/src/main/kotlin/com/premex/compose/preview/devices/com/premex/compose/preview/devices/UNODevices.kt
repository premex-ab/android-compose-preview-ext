package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNO device specifications for Android Compose previews.
 *
 * This extension provides UNO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UNO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UNO: Any
  get() = object {
      /** DeviceSpec(manufacturer=UNO, code=NewPad_10, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNO, code=NewPad_10, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val NEWPAD_10 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=UNO, code=Premier5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNO, code=Premier5, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PREMIER5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UNO, code=Premier5Max, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNO, code=Premier5Max, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val PREMIER5MAX = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=UNO, code=Premier_Pro, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNO, code=Premier_Pro, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val PREMIER_PRO = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UNO, code=Premier_ProA, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNO, code=Premier_ProA, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val PREMIER_PROA = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UNO, code=Premier_Pro_B, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNO, code=Premier_Pro_B, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val PREMIER_PRO_B = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UNO, code=UNO_Prime6, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNO, code=UNO_Prime6, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val UNO_PRIME6 = "spec:width=480,height=960,unit=px,dpi=213"

  }
