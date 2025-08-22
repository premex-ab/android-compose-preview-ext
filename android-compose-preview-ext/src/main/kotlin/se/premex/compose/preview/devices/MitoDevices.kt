package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Mito device specifications for Android Compose previews.
 *
 * This extension provides Mito device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mito.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mito: Any
  get() = object {
      /** Mito A67 */
      val A67 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
