package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Odido device specifications for Android Compose previews.
 *
 * This extension provides Odido device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Odido.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Odido: Any
  get() = object {
      /** Odido SEI800TFAS */
      val SEI800TFAS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
