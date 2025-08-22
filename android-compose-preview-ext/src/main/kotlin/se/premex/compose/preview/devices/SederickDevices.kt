package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Sederick device specifications for Android Compose previews.
 *
 * This extension provides Sederick device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sederick.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sederick: Any
  get() = object {
      /** Sederick KT101 */
      val KT101 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
