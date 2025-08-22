package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Tigo device specifications for Android Compose previews.
 *
 * This extension provides Tigo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tigo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tigo: Any
  get() = object {
      /** Tigo uiw4054mil */
      val UIW4054MIL = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Tigo uiw4059mil */
      val UIW4059MIL = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
