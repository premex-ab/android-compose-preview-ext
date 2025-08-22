package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TRECFONE device specifications for Android Compose previews.
 *
 * This extension provides TRECFONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TRECFONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TRECFONE: Any
  get() = object {
      /** DeviceSpec(manufacturer=TRECFONE, code=V35, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TRECFONE, code=V35, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val V35 = "spec:width=720,height=1600,unit=px,dpi=480"

  }
