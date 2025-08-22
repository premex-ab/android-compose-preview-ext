package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CRUA device specifications for Android Compose previews.
 *
 * This extension provides CRUA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Crua.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Crua: Any
  get() = object {
      /** CRUA mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

  }
