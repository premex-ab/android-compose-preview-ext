package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Revomovil device specifications for Android Compose previews.
 *
 * This extension provides Revomovil device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Revomovil.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Revomovil: Any
  get() = object {
      /** Revomovil S6523_RU */
      val S6523_RU = "spec:width=720,height=1600,unit=px,dpi=320"

  }
