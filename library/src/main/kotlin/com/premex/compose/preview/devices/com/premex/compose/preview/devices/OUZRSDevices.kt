package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OUZRS device specifications for Android Compose previews.
 *
 * This extension provides OUZRS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OUZRS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OUZRS: Any
  get() = object {
      /** DeviceSpec(manufacturer=OUZRS, code=OUZRSM4, width=768, height=1366, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OUZRS, code=OUZRSM4, width=768,
      height=1366, dpi=160, isGoogleDevice=false).code */
      val OUZRSM4 = "spec:width=768,height=1366,unit=px,dpi=160"

  }
