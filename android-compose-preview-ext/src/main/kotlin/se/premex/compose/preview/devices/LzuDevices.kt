package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LZU device specifications for Android Compose previews.
 *
 * This extension provides LZU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lzu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lzu: Any
  get() = object {
      /** LZU D113 */
      val D113 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LZU D113_EEA */
      val D113_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
