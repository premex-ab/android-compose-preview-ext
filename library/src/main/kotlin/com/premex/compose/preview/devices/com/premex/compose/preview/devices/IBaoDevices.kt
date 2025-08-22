package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iBao device specifications for Android Compose previews.
 *
 * This extension provides iBao device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IBao.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IBao: Any
  get() = object {
      /** DeviceSpec(manufacturer=iBao, code=iS1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iBao, code=iS1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IS1 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
