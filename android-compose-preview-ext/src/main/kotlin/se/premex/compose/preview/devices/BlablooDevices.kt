package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Blabloo device specifications for Android Compose previews.
 *
 * This extension provides Blabloo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blabloo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blabloo: Any
  get() = object {
      /** Blabloo Space1Blue */
      val SPACE1BLUE = "spec:width=540,height=1132,unit=px,dpi=240"

  }
