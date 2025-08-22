package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FATARUS device specifications for Android Compose previews.
 *
 * This extension provides FATARUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FATARUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FATARUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=FATARUS, code=K10, width=800, height=1332, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FATARUS, code=K10, width=800,
      height=1332, dpi=240, isGoogleDevice=false).code */
      val K10 = "spec:width=800,height=1332,unit=px,dpi=240"

  }
