package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Next device specifications for Android Compose previews.
 *
 * This extension provides Next device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Next.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Next: Any
  get() = object {
      /** DeviceSpec(manufacturer=Next, code=YDA, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Next, code=YDA, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YDA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Next, code=YYT, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Next, code=YYT, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YYT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
