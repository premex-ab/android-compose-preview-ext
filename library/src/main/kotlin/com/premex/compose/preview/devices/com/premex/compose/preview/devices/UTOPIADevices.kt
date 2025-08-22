package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UTOPIA device specifications for Android Compose previews.
 *
 * This extension provides UTOPIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UTOPIA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UTOPIA: Any
  get() = object {
      /** DeviceSpec(manufacturer=UTOPIA, code=UH0342, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UTOPIA, code=UH0342, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val UH0342 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
