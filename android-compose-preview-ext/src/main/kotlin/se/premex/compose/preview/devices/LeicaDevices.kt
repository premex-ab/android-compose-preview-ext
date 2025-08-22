package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Leica device specifications for Android Compose previews.
 *
 * This extension provides Leica device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Leica.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Leica: Any
  get() = object {
      /** Leica CSX8 */
      val CSX8 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
