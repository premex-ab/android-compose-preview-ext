package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Innopia device specifications for Android Compose previews.
 *
 * This extension provides Innopia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Innopia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Innopia: Any
  get() = object {
      /** Innopia IMTM5000R */
      val IMTM5000R = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
