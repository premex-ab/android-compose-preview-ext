package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GOLDTECH device specifications for Android Compose previews.
 *
 * This extension provides GOLDTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GOLDTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GOLDTECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=GOLDTECH, code=GT10-B16, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOLDTECH, code=GT10-B16, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GT10_B16 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GOLDTECH, code=GT7-B16, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOLDTECH, code=GT7-B16, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GT7_B16 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
