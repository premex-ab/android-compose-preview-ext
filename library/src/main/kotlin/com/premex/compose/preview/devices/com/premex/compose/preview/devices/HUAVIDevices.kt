package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HUAVI device specifications for Android Compose previews.
 *
 * This extension provides HUAVI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HUAVI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HUAVI: Any
  get() = object {
      /** DeviceSpec(manufacturer=HUAVI, code=GOLD_77, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HUAVI, code=GOLD_77, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val GOLD_77 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HUAVI, code=KHATARH20PRO, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HUAVI, code=KHATARH20PRO,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val KHATARH20PRO = "spec:width=720,height=1560,unit=px,dpi=320"

  }
