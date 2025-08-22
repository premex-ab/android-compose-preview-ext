package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Brava device specifications for Android Compose previews.
 *
 * This extension provides Brava device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brava.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brava: Any
  get() = object {
      /** Brava DU_600 */
      val DU_600 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
