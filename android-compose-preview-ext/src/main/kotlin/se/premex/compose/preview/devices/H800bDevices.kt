package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * H800B device specifications for Android Compose previews.
 *
 * This extension provides H800B device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.H800b.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.H800b: Any
  get() = object {
      /** H800B RIGEL */
      val RIGEL = "spec:width=800,height=1280,unit=px,dpi=213"

  }
