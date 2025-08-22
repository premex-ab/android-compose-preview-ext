package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLACKFOX device specifications for Android Compose previews.
 *
 * This extension provides BLACKFOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BLACKFOX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BLACKFOX: Any
  get() = object {
      /** DeviceSpec(manufacturer=BLACKFOX, code=BMM441B, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLACKFOX, code=BMM441B, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BMM441B = "spec:width=720,height=1560,unit=px,dpi=320"

  }
