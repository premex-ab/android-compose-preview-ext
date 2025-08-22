package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TELUS device specifications for Android Compose previews.
 *
 * This extension provides TELUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TELUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TELUS: Any
  get() = object {
      /** TELUS SER2024TLU */
      val SER2024TLU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TELUS uiw4054tlu */
      val UIW4054TLU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
