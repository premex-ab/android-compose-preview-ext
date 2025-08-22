package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLECK device specifications for Android Compose previews.
 *
 * This extension provides BLECK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BLECK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BLECK: Any
  get() = object {
      /** DeviceSpec(manufacturer=BLECK, code=BE_dg, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLECK, code=BE_dg, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BE_DG = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLECK, code=BE_et, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLECK, code=BE_et, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BE_ET = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLECK, code=BE_o2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLECK, code=BE_o2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BE_O2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLECK, code=BE_se, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLECK, code=BE_se, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BE_SE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLECK, code=BE_xl, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLECK, code=BE_xl, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BE_XL = "spec:width=720,height=1280,unit=px,dpi=320"

  }
