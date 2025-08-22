package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Metfone device specifications for Android Compose previews.
 *
 * This extension provides Metfone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Metfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Metfone: Any
  get() = object {
      /** Metfone MediaBox_B866V2F */
      val MEDIABOX_B866V2F = "spec:width=720,height=1280,unit=px,dpi=320"

  }
