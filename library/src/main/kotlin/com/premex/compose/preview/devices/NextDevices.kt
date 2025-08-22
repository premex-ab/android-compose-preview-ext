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
      /** Next YDA */
      val YDA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Next YYT */
      val YYT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
