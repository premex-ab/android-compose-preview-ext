package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Zeop device specifications for Android Compose previews.
 *
 * This extension provides Zeop device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zeop.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zeop: Any
  get() = object {
      /** Zeop B866V2F */
      val B866V2F = "spec:width=1080,height=1920,unit=px,dpi=213"

  }
