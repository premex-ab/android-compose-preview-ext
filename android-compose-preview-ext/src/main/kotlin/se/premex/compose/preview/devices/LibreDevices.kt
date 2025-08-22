package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Libre device specifications for Android Compose previews.
 *
 * This extension provides Libre device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Libre.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Libre: Any
  get() = object {
      /** Libre W101 */
      val W101 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Libre W808 */
      val W808 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
